package entities;

public class ContaBancaria {
	private String nome;
	private int numeroConta;
	private Double saldo;

	public ContaBancaria(String nome, int numeroConta) {
		this.nome = nome;
		this.numeroConta = numeroConta;
	}

	public ContaBancaria(String nome, int numeroConta, Double depositoInicial) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = depositoInicial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void deposito(Double deposito) {
		saldo += deposito;
	}

	public void saque(Double saque) {
		if (saque > saldo) {
			System.out.println("Operaçao nao permitida, saldo insuficiente.");
		} else {
			saldo -= saque + 5.0;
		}
	}
	
	public String toString() {
		return "Nome: " + nome + "\nNumero da conta: " + numeroConta + "\nSaldo = " + saldo;
	}
}
