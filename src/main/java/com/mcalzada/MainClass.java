package com.mcalzada;

public class MainClass
{
    public static void main(String[] args)
    {
        my_first_class first = new my_first_class();
        double suma = first.SumarDosNumeros(1, 2);

        System.out.println(suma);

        System.out.println(first.obtenerNombreSiNoEsNulo("Pepito"));
        System.out.println(first.obtenerNombreSiNoEsNulo(null));
    }
}
