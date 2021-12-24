package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		int numero;
		int resultado;
		
		
		System.out.println("--------------------");
		System.out.println("Programa da tabuada!");
		System.out.println("--------------------");
		System.out.print("Digite um número: ");
		numero = valor.nextInt();
		System.out.println("--------------------");
		
		for(int cont = 1; cont < 11; cont++) {
			resultado = numero * cont;
			System.out.println(numero + " X " + cont + " = " + resultado);
			System.out.println("--------------------");
			
		}
		valor.close();
		
	}

}
