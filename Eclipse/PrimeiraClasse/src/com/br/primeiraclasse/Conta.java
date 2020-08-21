package com.br.primeiraclasse;

public class Conta {
	
	private String nome; // vari�vel de inst�ncia
	private double balance; // vari�vel de inst�ncia
	
	// Construtor de Account que recebe dois par�metros
	public Conta(String nome, double balance) 
	{
		this.nome = nome; // atribui nome a var�avel de inst�ncia nome
	
		// valida que o balance � maior que 0.0; s n�o for,
		// a vari�vel de inst�ncia balance mant�m seu valor inicial padr�o de 0.
		if (balance > 0.0) // se o saldo for v�lido
			this.balance = balance; // o atribui � var�avel de inst�ncia balance
	}
	
	// m�todo que deposita (adiciona) apenas uma quantia v�lida no saldo
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0) // se depositAmount for v�lido
			balance = balance + depositAmount; // o adiciona ao saldo
	}
	
	// m�todo para retornar o saldo da conta
	public double getBalance()
	{
		return balance;
	}
	
	// m�todo que define o nome
	public void setName(String nome)
	{
		this.nome = nome; // armazena o nome
	}
	
	// m�todo que retorna o nome
	
	public String getName ()
	{
		return nome; // retorna o valor do nome para o chamador
	} // fim do m�todo getName

} // fim da classe Conta
