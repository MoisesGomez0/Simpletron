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
        
        Lector lee=new Lector();
        Memoria b=new Memoria();
        
        Imprimir.mostrarmsj("Bienvenido");
        Imprimir.mostrarmsj("ingresa las instrucciones en orden, de una en una, seguida de un enter");
        
        Imprimir.mostrarMemo(b.getMemoria());
        lee.leerIns(b.getMemoria());
        
        Imprimir.mostrarMemo(b.getMemoria());
        lee.leerDato();
        
    }
    
}
