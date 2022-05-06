package generics_main;

import java.util.Scanner;

import generics_service.ServicoDeImpressao;

public class Programa {
	/*
	 * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
	 * inteiros. Ao final, imprima esses números de forma organizada conforme
	 * exemplo. Em seguida, informar qual foi o primeiro valor informado.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Para que a classe ServicoDeImpressao permita usar Integer, basta alterar o String para Integer, pois a classe Servico de Impressão é uma classe Generics.
		//ServicoDeImpressao<Integer> ps = new ServicoDeImpressao<>();
		ServicoDeImpressao<String>  ps = new ServicoDeImpressao<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			//Integer value = sc.nextInt();
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		//Integer x = ps.first();
		String x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
		
	}

}
