package Clase4;

public class Nodo
{
    private String nombre;
    private Nodo sgt;

    public Nodo(Nodo sgt, String nombre) {
        this.sgt = sgt;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Nodo getSgt() {
        return sgt;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSgt(Nodo sgt) {
        this.sgt = sgt;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "nombre='" + nombre + '\'' +
                ", sgt=" + sgt +
                '}';
    }
}
