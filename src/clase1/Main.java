package clase1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nombres listaNombres = new Nombres();
        int opc;


        do {

            System.out.println("MENU");
            System.out.println("1.Listar nombres ");
            System.out.println("2. Agregar nombre a la lista");
            System.out.println("3. Encontrar nombre");
            System.out.println("4. Eliminar nombre");
            System.out.println("0. salir");

            System.out.println("Por favor digite la opcion");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    listaNombres.listarNombres();
                    break;
                case 2:
                    System.out.println("digite el nombre para agrarlo a la lista");
                    String nombre = sc.nextLine();
                    listaNombres.agregarNombre(nombre);
                    break;
                case 3:
                    System.out.println("Escriba el nombre que quiera encontrar");
                    String encontrar = sc.nextLine();
                    listaNombres.encontrarNombre(encontrar);
                    break;
                case 4:
                    System.out.println("Escriba el nombre que quiera eliminar");
                    String eliminar = sc.nextLine();
                    listaNombres.eliminarNombre(eliminar);
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