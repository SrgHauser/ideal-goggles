//Escreva um programa que pergunta um n�mero ao usu�rio, e mostra sua tabuada completa (de 1 at� 10).

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, cont = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		numero = sc.nextInt();
		
		while (cont <= 10) {
		System.out.println(numero + " X " + cont + " = " + (numero*cont));
		cont++;
		}return;
	}

}
