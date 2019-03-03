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
        
        for(int i=0;i<Memoria.numeroi;i++)
        {
            Imprimir.mostrarMemo(b.getMemoria());
            int a=Ejecutor.puntero(b.getMemoria());
            Imprimir.mostrarmsj("Ejecutor a "+a);
            int instruccion=comandos.instruccion(a);
            Imprimir.mostrarmsj("la instruccion "+instruccion);
            int posicioni=comandos.posicioni(a);
            Imprimir.mostrarmsj("posicion i"+posicioni);
            int posicionj=comandos.posicionj(a);
            Imprimir.mostrarmsj("posicion j"+posicionj);
            Ejecutor.operacion(instruccion, posicioni,posicionj, b.getMemoria());
        }
        
    }
    
}
