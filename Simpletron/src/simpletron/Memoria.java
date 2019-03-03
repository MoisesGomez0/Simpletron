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
public class Memoria {

    private int[][] memoria = new int[10][10];
    public static int temporal=0;//Esta variable almacenara datos que se carguen por la instruccion 40
    public static int numeroi=0;//esta variable almacenara la cantidad de instrucciones que se ingresen

    public int[][] getMemoria()
    {
        return memoria;
    }

    public void setMemoria(int[][] memoria)
    {
        this.memoria = memoria;
    }
}
