package simpletron;

public class comandos {

    public static int instruccion(int a)//este metodo devolvera la instruccion que exista en una palabra del codigo de simpletron
    {

        String numero_comando = Integer.toString(a); //Conversión de int a String

        char x = numero_comando.charAt(0);
        char y = numero_comando.charAt(1);

        String w = Character.toString(x) + Character.toString(y);

        return Integer.parseInt(w);
    }

    public static int posicioni(int a)
    {
        String numero_comando = Integer.toString(a); //Conversión de int a String

        char i = numero_comando.charAt(2);
        //char j=numero_comando.charAt(3);

        String w = Character.toString(i);

        return Integer.parseInt(w);
    }

    public static int posicionj(int a)
    {
        String numero_comando = Integer.toString(a);
        char j = numero_comando.charAt(3);
        String w = Character.toString(j);
        return Integer.parseInt(w);
    }

}
