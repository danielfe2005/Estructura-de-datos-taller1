package clase1;

import java.util.Scanner;

public class MainTareas
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tareas tareas = new Tareas();
        int opc;


        do {

            System.out.println("MENU");
            System.out.println("1.Listar tareas pendientes ");
            System.out.println("2. Agregar tareas");
            System.out.println("3. Eliminar tarea completada");
            System.out.println("0. salir");

            System.out.println("Por favor digite la opcion");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    tareas.listarTareasPendientes();
                    break;
                case 2:
                    System.out.println("Escriba la nueva tarea pendiente");
                    String newTarea = sc.nextLine();
                    tareas.agregarTarea(newTarea);
                    break;
                case 3:
                    System.out.println("digite el mumero de la tarea que ya finalizo");
                    int finalizada = sc.nextInt();
                    tareas.eliminarTarea(finalizada);
                    break;
                case 0:
                    System.out.println("Gracias por usar el programa :3");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opc != 0);
        sc.close();


    }
}
