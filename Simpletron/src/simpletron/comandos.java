package simpletron;

public class comandos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		String numero_comando = Integer.toString(x); //Conversi�n de int a String
		numero_comando.charAt(0);//toma del primer n�mero
		numero_comando.charAt(1);
		numero_comando.charAt(2);
		numero_comando.charAt(3);
		
		String n="numero_comando.charAt(0)"+"numero_comando.charAt(1)";//Uni�n de los dos primeros n�meros para formar los comandos
		switch(n){
		case "10":
			resultado= a+b;
		case "11":
		    resultado= a-b;
		case "12":
		    resultado= a/b;
		case "13":
		    resultado= a*b;
		default:
		    System.out.println("Opcion no valida");
		}
		
		
		
			
	}
}
