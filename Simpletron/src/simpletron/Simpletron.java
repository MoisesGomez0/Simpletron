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
public class Simpletron
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Memoria b=new Memoria();
        
        Imprimir.mostrarMemo(b.getMemoria());
    }
    
}
