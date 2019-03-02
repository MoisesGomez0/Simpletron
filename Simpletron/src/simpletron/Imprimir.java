/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletron;

/**
 *
 * @author moises_2
 */
public class Imprimir
{
    public static void mostrarMemo(int[][] a)//crear un metodo publico y estatico para imprimir el estado de la memoria
    {
        System.out.print("     ");
        for(int i=0;i<a.length;i++)
            System.out.printf("%5d", i);//imprimir el numero de la columno
        
        System.out.print('\n');//imprimir salto de linea
        
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("%5d", i);//imprimir el numero de fila
            for(int j=0;j<a[i].length;j++)
            {
                System.out.printf("%5d",a[i][j]);
            }
            System.out.print('\n');
        }
    }
    
    public static void mostrarPos(int a)
    {
        System.out.println(a);
    }
}
