package aula01;

import java.util.Scanner;

public class ExercicioHelloWorld {
	
	// 1. Fa�a um programa que leia um numero inteiro e o imprima.
	
	public static void main(String[] args) {
		
		System.out.println("Ol� querido usu�rio, digite um n�mero:");
		Scanner teclado = new Scanner(System.in);
		
		int inteiroLido = teclado.nextInt();
		
		System.out.printf("\nO n�mero lido foi: %d", inteiroLido);
	}

}
