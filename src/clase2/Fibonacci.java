package clase2;

public class Fibonacci {

    public int serieDeFibonacci1(int n)
    {
        if (n == 1) { //o(1)
            return 0; //o(1)
        } else if (n == 2)
        { //o(1)
            return 1; //o(1)
        }

        int anterior = 0; //o(1)
        int despues = 1; //o(1)
        int resul = 0; //o(1)

        for (int i = 3; i <= n; i++)
        { //o(n)
            resul = anterior + despues; //o(1)
            anterior = despues; //o(1)
            despues = resul; //o(1)
        }
        return resul; //o(1)
    }
    // complejidad del algoritmo o(n)

    public int serieDeFibonacci2(int n2)
    {
        if (n2 == 1)
        { //o(1)
            return 0; //o(1)
        } else if (n2 == 2) //o(1)
        {
            return 1;//o(1)
        }

        int anterior = 0; //o(1)
        int despues = 1; //o(1)
        int resul = 0; //o(1)
        int i = 3; //o(1)

        while (i <= n2) //o(n)
        {
            resul = anterior + despues; //o(1)
            anterior = despues; //o(1)
            despues = resul; //o(1)
            i++; //o(1)
        }
        return resul; //o(1)
    }
    // complejidad del algoritmo o(n)
}
