package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria novaConta;
		
		System.out.print("Nome do titular: ");
		String nome = sc.nextLine();
		
		System.out.print("Numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Deseja fazer deposito inicial (S/N)? ");
		char continuar = sc.next().charAt(0);
		
		if(continuar == 'S' || continuar == 's') {
			System.out.print("Informe o valor do deposito inicial: ");
			Double depositoInicial = sc.nextDouble();
			novaConta = new ContaBancaria(nome, numero, depositoInicial);
		}
		else {
			novaConta = new ContaBancaria(nome, numero);
		}
		System.out.println();
		System.out.println(novaConta);
		System.out.println();
		
		System.out.print("Valor do deposito: ");
		Double deposito = sc.nextDouble();
		novaConta.deposito(deposito);
		System.out.println(novaConta);
		
		System.out.println();
		
		System.out.print("Valor do saque: ");
		Double saque = sc.nextDouble();
		novaConta.saque(saque);
		System.out.println(novaConta);
		
		
		sc.close();
	}
}
