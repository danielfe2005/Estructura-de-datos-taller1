package Clase1;

import java.util.ArrayList;

public class Tareas
{
   private ArrayList<String> tareas;

   public Tareas()
   {
       tareas = new ArrayList<>();
       tareas.add("Limpiar la habitacion");
       tareas.add("Hacer mercado");
       tareas.add("Repasar para la Exposicion");
       tareas.add("Reparar el televisor");
   }

   public void listarTareasPendientes()
   {
       for (int i = 0; i< tareas.size(); i++)
       {
           System.out.println((i+1) + "."+ tareas.get(i));
       }
   }
   public void agregarTarea(String tarea)
   {
       tareas.add(tarea);
   }

   public void eliminarTarea(int finalizada)
   {
       boolean encontrado = false;
       for (int i = 0; i<tareas.size(); i++)
       {
           if ((finalizada-1) == i)
           {
               tareas.remove(i);
               System.out.println("La tarea fue completada con exito");
               encontrado = true;
           }
       }
       if (!encontrado)
       {
           System.out.println("No se encuentra la tarea que desea eliminar");
       }

   }

}
