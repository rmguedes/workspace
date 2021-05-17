package br.com.qm.oo.elevador;

public class Elevador {
	
	//3. Crie uma classe denominada Elevador para armazenar as informações
	//  de um elevador dentro de um predio. A classe deve armazenar o 
	//  andar atual (terreo = 0), total de andares no predio 
	//  (desconsiderando o terreo), capacidade do elevador e quantas pessoas estão presentes nele.
	//  A classe deve tambem disponibilizar os seguintes metodos:
	//	Entra : para acrescentar uma pessoa no elevador (so deve acrescentar se ainda houver espaço);
	//	Sai : para remover uma pessoa do elevador (so deve remover se houver alguem dentro dele);
	//	Sobe : para subir um andar (não deve subir se ja estiver no ultimo andar);
	//	Desce : para descer um andar (não deve descer se ja estiver no terreo);
	//	Crie um programa principal capaz de interagir com seu Elevador.
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int qtdPessoas;
	
	
	public Elevador(int totalAndares, int capacidade) {
		this.andarAtual = 0;
		this.qtdPessoas = 0;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}
	
	public void entra() {
		if (qtdPessoas < capacidade) {
			qtdPessoas++;
		}
	}
	
	public void sai() {
		if (qtdPessoas > 0) {
			qtdPessoas--;
		}
	}
	
	public void sobe() {
		if (andarAtual < totalAndares) {
			andarAtual++;
		}
	}
	
	public void desce() {
		if (andarAtual > 0) {
			andarAtual--;
		}
	}
	
	public void status() {
		System.out.println("----------");
		System.out.printf("\nO elevador estÃ¡ no andar: %d\n", this.andarAtual);
		System.out.printf("\n HÃ¡ %d pessoas no elevador.\n", this.qtdPessoas);
		System.out.println("----------");
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}
	
	

}
