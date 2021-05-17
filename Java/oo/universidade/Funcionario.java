package br.com.qm.oo.universidade;

public class Funcionario {

	//1. Modele as classes referentes aos funcionarios de 
	//uma universidade, que serão os professores, coordenadores, 
	//e funcionarios administrativos.

	//Os atributos comuns de todos os funcionarios serão: Nome, CPF, 
	//numero de registro, orgão de lotação e salario.

	private String nome;
	private String cpf;
	private int nroRegistro;
	private String orgaoLotacao;
	private double salario;
	
	
	public Funcionario(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.nroRegistro = nroRegistro;
		this.orgaoLotacao = orgaoLotacao;
		this.salario = salario;
	}


	public String getOrgaoLotacao() {
		return orgaoLotacao;
	}


	public void setOrgaoLotacao(String orgaoLotacao) {
		this.orgaoLotacao = orgaoLotacao;
	}


	public double getSalario() {
		return salario;
	}


	protected void setSalario(double salario) {
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public int getNroRegistro() {
		return nroRegistro;
	}

	// Aumento de salario: para todos menos os coordenadores aumenta o
	//salario em 10% e para os coordenadores o aumento é de 5%.
	public void aumentaSalario() {
		
		this.salario = this.salario * 1.1;
		
	}


	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", nroRegistro=" + nroRegistro + ", orgaoLotacao="
				+ orgaoLotacao + ", salario=" + salario + "]";
	}
	
	
	
}
