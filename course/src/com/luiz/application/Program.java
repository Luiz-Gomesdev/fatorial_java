package com.luiz.application;

import java.util.Scanner;

import com.luiz.entities.Calculadora;

public class Program {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num; 
		
		do {
			System.out.println("Entre com um n�mero positivo: ");
			num = sc.nextInt();
			
			if (num < 0){
			System.out.println("N�mero Inv�lido, digite novamente");
			}
		}while (num < 0);
		
			System.out.println(Calculadora.fatorial(num));
		
		
		
		sc.close();
		
	}
}