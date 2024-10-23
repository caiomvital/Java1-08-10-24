package logica;

import java.util.Scanner;

public class Exercicio {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
//Escreva um programa que leia dois números inteiros 
//e diga qual é o maior, o menor ou se são iguais.
	
	System.out.println("Digite um valor: ");
	int primeiroValor = scan.nextInt();
	
	System.out.println("Digite outro valor: ");
	int segundoValor = scan.nextInt();
	
	if(primeiroValor == segundoValor) {
		System.out.println("Os valores são iguais");
	} else if(primeiroValor > segundoValor) {
		System.out.println("O primeiro é maior que o segundo");
	} else {
		System.out.println("O segundo é maior que o primeiro");
	}
	
	
}
}
