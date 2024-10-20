import java.util.Scanner;

public class M1_04_Pedro_Castellano_Gonzalez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escriba tantas frases como desee, para finalizar escriba un .");
		boolean exit=false;
		int contador=0;
		//se hace un blucle for dentro de un do while para que puedas poner las frases que quieras
		do {
			//se escanea la frase que se quiera poner
			frase=sc.nextLine();
			//bucle for se recorre la frase con length
			for (int i = 0; i < frase.length(); i++) {
				//se guarda el caracter de la posiscion actual en espacio para compararlo con los if
			char espacio=frase.charAt(i);
			//si es igual a un espacio se cuenta y se suma 1
				if (espacio == ' ')
					
					contador++;
				else
					//si es igual a un punto cambiamos el estado de exit a verdadero para salir del bucle while
					if (espacio == '.') {
						
					exit=true;
						
					}
				
			}
		} while (!exit);
		sc.close();
		System.out.println("Hay "+contador+" espacios en total");
	}

}
