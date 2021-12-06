package com.fisei.p001;

public class Operacion {
    public static long factorial(int n){
        long f=1;
        for (int i=1; i< n; i++){
            f *=1;

        }
        return f;
    }

    public static long potencia(int base, int exponente){
        long p=1;
        for (int i=1;i<=exponente; i++)
        {
            p *=base;
        }
        return p;
    }
}
