package clase2;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class MainFibonacci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();


        System.out.println("Escriba el numero de veces que desee ejecutar la serie de Fibonnaci 1");
        int n1 = sc.nextInt();

        System.out.println("Escriba el numero de veces que desee ejecutar la serie de Fibonnaci 2");
        int n2 = sc.nextInt();

        long inicioEjecucion1 = System.nanoTime();

        for(int i = 1; i<n1; i++)
        {
            System.out.println(fibonacci.serieDeFibonacci1(i));
        }

        long finalEjecucion1 = System.nanoTime();
        long tiempoTotal1 = finalEjecucion1 - inicioEjecucion1;
        System.out.println("Tiempo de ejecución: " + tiempoTotal1 + " nanosegundos");

        long inicioEjecucion = System.nanoTime();

        for (int i = 1; i <= n2; i++) {
            System.out.println(fibonacci.serieDeFibonacci2(i));
        }

        long finalEjecucion = System.nanoTime();
        long tiempoTotal = finalEjecucion - inicioEjecucion;
        System.out.println("Tiempo de ejecución: " + tiempoTotal + " nanosegundos");

        System.out.println("Conclusion");
        System.out.println("En terminos de optimizacion, se puede notar como el segundo metodo, es decir, el que maneja la instruccion while" +
                "es mucho mas eficiente en tiempo de solucionar la serie de fibonnaci, puesto que le lleva menos tiempo ejecutarse y realizar " +
                "el objetivo del algoritmo.");
    }
}
