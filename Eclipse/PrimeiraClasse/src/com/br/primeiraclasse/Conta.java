package com.br.primeiraclasse;

public class Conta {
	
	private String nome; // variável de instância
	private double balance; // variável de instância
	
	// Construtor de Account que recebe dois parâmetros
	public Conta(String nome, double balance) 
	{
		this.nome = nome; // atribui nome a varíavel de instância nome
	
		// valida que o balance é maior que 0.0; s não for,
		// a variável de instância balance mantém seu valor inicial padrão de 0.
		if (balance > 0.0) // se o saldo for válido
			this.balance = balance; // o atribui à varíavel de instância balance
	}
	
	// método que deposita (adiciona) apenas uma quantia válida no saldo
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0) // se depositAmount for válido
			balance = balance + depositAmount; // o adiciona ao saldo
	}
	
	// método para retornar o saldo da conta
	public double getBalance()
	{
		return balance;
	}
	
	// método que define o nome
	public void setName(String nome)
	{
		this.nome = nome; // armazena o nome
	}
	
	// método que retorna o nome
	
	public String getName ()
	{
		return nome; // retorna o valor do nome para o chamador
	} // fim do método getName

} // fim da classe Conta
