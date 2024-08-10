package Clase1;

import com.sun.tools.javac.Main;

import java.util.ArrayList;


public class Nombres
{
    private ArrayList<String> nombres;

    public Nombres() {
        nombres = new ArrayList<>();
        nombres.add("daniel");
        nombres.add("angely");
        nombres.add("catalina");
        nombres.add("samuel");
        nombres.add("angel");
    }

    public void agregarNombre(String nombre)
    {
        nombres.add(nombre);
    }
    public void listarNombres()
    {
        for (int i = 0; i<nombres.size(); i++)
        {
            System.out.println(nombres.get(i));
        }
    }

    public void encontrarNombre(String encontrar)
    {
        boolean noEncontro = false;
        for (int i = 0; i<nombres.size(); i++)
        {
            if (nombres.get(i).equalsIgnoreCase(encontrar))
            {
                System.out.println("El nombre fue encontrado");
                System.out.println(nombres.get(i));
                noEncontro = true;
            }
        }
        if (!noEncontro)
        {
            System.out.println("El nombre no se encuentra en la lista");
        }
    }

    public void eliminarNombre(String eliminar)
    {
        boolean encontrar = false;
        for (int i = 0; i<nombres.size(); i++)
        {
            if (nombres.get(i).equalsIgnoreCase(eliminar))
            {
                nombres.remove(i);
                System.out.println("El nombre fue removido con exito");
                encontrar = true;
            }
        }
        if (!encontrar)
        {
            System.out.println("El nombre que intento eliminar no fue encontrado.");
        }
    }
}
