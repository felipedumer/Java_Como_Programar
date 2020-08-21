package com.br.primeiraclasse;
import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		
		// cria um objeto Conta com o saldo e o atribui a account 1 e 2
		Conta account1 = new Conta("Felipe", 50.00);
		Conta account2 = new Conta("Ada", -7.53);
		
		// exibe o saldo inicial de cada objeto
		System.out.printf("%s saldo: R$%.2f %n", 
			account1.getName(), account1.getBalance());
		System.out.printf("%s saldo: R$%.2f %n", 
			account2.getName(), account2.getBalance());
		
		// cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade para depositar na conta1: "); // prompt
		double depositAmount = input.nextDouble(); // obtém a entrada do usuário
		System.out.printf("%nadicionando %.2f para a conta1%n%n",
			depositAmount);
		account1.deposit(depositAmount); // adiciona o saldo de account1
		
		// exibe os saldos
		System.out.printf("%s saldo: R$%.2f %n", 
			account1.getName(),account1.getBalance());
		System.out.printf("%s saldo: R$%.2f %n", 
			account2.getName(),account2.getBalance());
		
		System.out.print("Entre com a quantia para conta2: "); // prompt
		depositAmount = input.nextDouble(); // obtém a entrada do usuário
		System.out.printf("%n adicionando %.2f para a conta 2%n%n",
			depositAmount);
		account2.deposit(depositAmount); // adiciona o saldo de account2
		
		// exibe os saldos
		System.out.printf("%s saldo: R$%.2f %n", 
			account1.getName(),account1.getBalance());
		System.out.printf("%s saldo: R$%.2f %n", 
			account2.getName(),account2.getBalance());
	} // fim de main

} // fim da classe TesteConta
