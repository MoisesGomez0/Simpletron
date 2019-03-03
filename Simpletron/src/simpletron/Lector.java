/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletron;

import java.util.Scanner;

/**
 *
 * @author moises_2
 */
public class Lector {

    Scanner leer = new Scanner(System.in);//creando objeto Scanner para leer cosas de la consola

    public void leerIns(int[][] b)//este metodo lee las instrucciones del usuario, las cuales deben ser dadas al inicio de la ejecucion
    {

        int temp;//variable temporal donde se guardan las cosas, tabien sirve como centinela

        do
        {

            temp = leer.nextInt();//se lee desde la consola
            if (temp != -10)//se verifica que la lectura sea distinto de el valor clave del centinela
            {
                for (int i = 0; i < 10; i++)
                {
                    boolean a = false;//se declara una variable bool para verificar que el numero fue guardado y asi salir de el segundo for
                    for (int j = 0; j < 10; j++)
                    {
                        if (b[i][j] == 0)// se verifica que el espacio este vacio
                        {
                            b[i][j] = temp;//se llena el espacio
                            a = true;//la variable se pone en true para verificar que se guardó el de que u
                            break;//se sale del for interior

                        }
                    }
                    if (a)
                    {
                        break;//se sale del for exterior
                    }
                }
            }

        } while (temp != -10);//se verifica que el centilea sea distinto
    }

    public int leerDato()//este metodo lee un numero //12.21 no sirve
    {
        int a;
        try
        {
            a = leer.nextInt();
        } catch (Exception b)
        {
            Imprimir.mostrarmsj("Hey, deberias de ingresar un entero");
            return leerDato();
        }

        return a;
    }
}
