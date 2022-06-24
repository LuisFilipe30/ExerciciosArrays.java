package main;

import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vet = new Aluguel[9];
		
		System.out.print("Qunatos quartos serão alugados? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			System.out.println();
			vet[quarto] = new Aluguel(nome, email);
		}
		
		
		System.out.println();
		System.out.println("Quartos alugados:");
		for (int i=0; i<10; i++) {
			if (vet[i] != null) {
			System.out.println(i + ": " + vet[i]);
			}
		}
		
		
		
		sc.close();
		
	}

}
