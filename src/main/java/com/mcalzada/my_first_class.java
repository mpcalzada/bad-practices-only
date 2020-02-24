package com.mcalzada;

/**
 * {@link my_first_class}
 *
 * @author MarcoCalzada
 * @version 1
 * @since MarcoCalzada
 */
public class my_first_class
{
    public int SumarDosNumeros(int x, int y)
    {
        return x + y;
    }

    public int DIVIDIR_DOS_NUMERO(int x, int y)
    {
        return x / y;
    }

    public String obtenerNombreSiNoEsNulo(String nombre)
    {
        if (nombre != null)
        {
            return nombre;
        }
        else if (nombre == "Marco Calzada")
        {
            return "Hola Marco";
        }
        else if (nombre.equals("Marco Calzada"))
        {
            return "Hola Marco";
        }
        else
        {
            return null;
        }
    }
}
