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
public class Ejecutor
{
    public static int puntero(int[][] b)//este metodo devuelve el valor de una posicion que almacene una instruccion
    {
        for(int i=0; i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                if(b[i][j]>=1000)
                {
                    int temp=b[i][j];
                    b[i][j]=0;//se borra la instrunccion ya leida
                    return temp;
                    
                }
            }
        }
        return 0;
    }
    public static void operacion(int ins, int posi, int posj, int [][] b)//este metodo realiza las operaciones
    {
        switch(ins)
        {
            case 10:
                Memoria.temporal=b[posi][posj]+Memoria.temporal;
                Imprimir.mostrarmsj("se sumo");
                break;
            case 11:
                Memoria.temporal=b[posi][posj]-Memoria.temporal;
                Imprimir.mostrarmsj("se resto");
                break;
            case 20:
                Memoria.temporal=b[posi][posj]*Memoria.temporal;
                Imprimir.mostrarmsj("se multiplico");
                break;
            case 21:
                Memoria.temporal=b[posi][posj]/Memoria.temporal;
                Imprimir.mostrarmsj("se dividio");
                break;
            case 30:
                Lector leer=new Lector();
                b[posi][posj]=leer.leerDato();
                Imprimir.mostrarmsj("se leyo y guardo");
                break;
            case 31:
                Imprimir.mostrarmsj(b[posi][posj]);
                Imprimir.mostrarmsj("se escribio");
                break;
            case 40:
                Memoria.temporal=b[posi][posj];
                Imprimir.mostrarmsj("se cargo");
                break;
            case 41:
                b[posi][posj]=Memoria.temporal;
                Imprimir.mostrarmsj("se guardo");
                break;
        }
        
                
    }
}
