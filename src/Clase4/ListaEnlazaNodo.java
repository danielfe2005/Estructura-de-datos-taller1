package Clase4;

public class ListaEnlazaNodo
{
    private Nodo cab;

    public void addInicio(Nodo nodo)
    {
        if(cab == null)
        {
            cab = nodo;
        }
        nodo.setSgt(cab);
        cab = nodo;
    }

    public void imprimirLista()
    {
        Nodo rec = cab;
        while (rec != null)
        {
            System.out.println(rec);
            rec = rec.getSgt();
        }
    }

    public void eliminarNodo(String Vnombre)
    {
        Nodo rec = cab;
        Nodo ant = null;

        if (cab == null)
        {
            return;
        }

        if (Vnombre.equalsIgnoreCase(rec.getNombre()))
        {
            cab = cab.getSgt();
            return;

        }

        while(rec != null)
        {
            if (Vnombre.equalsIgnoreCase(rec.getNombre()))
            {
                ant.setSgt(rec.getSgt());
            }
            ant = rec;
            rec = rec.getSgt();
        }
        rec = ant;
    }

    public Nodo buscarNodo(String cNombre)
    {
        Nodo rec = cab;
        if (cab == null)
        {
            return null;
        }

        while (rec != null)
        {
            if (cNombre.equalsIgnoreCase(rec.getNombre()))
            {
                return rec;
            }
            rec = rec.getSgt();
        }
        return rec;
    }

    public void insertAnywhere(String pNombre, int pos){
        Nodo nodo = new Nodo(null, pNombre);
        if (pos == 0 ) {
            nodo.setSgt(cab);
            cab = nodo;
            return;
        }
        Nodo rec = cab;
        int ant = 0;


        while(rec != null && ant < (pos-1) ){
            rec = rec.getSgt();
            ant ++;
        }

        nodo.setSgt(rec.getSgt());
        rec.setSgt(nodo);

    }

}
