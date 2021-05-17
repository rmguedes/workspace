package oo.carro;

public class Carro {
	
	//1. Crie uma classe que represente um carro, que tenha como 
	//caracteristicas o nome, o peso, a fabricante, a cor e o valor do carro. 
	//Crie tambem o metodo darDesconto() que servira para diminuir o preço do 
	//carro e o metodo pintar(), que sera responsavel por mudar a cor do carro. 
	//Crie um carro no seu programa principal, utilize os metodos criados e mostre 
	//na tela o preço e a cor do carro antes e depois da utilização dos metodos.
	private String nome;
	private float peso;
	private String fabricante;
	private String cor;
	private float valor;
	
	public Carro(String nome, float peso, String fabricante, String cor, float valor) {
		this.nome = nome;
		this.peso = peso;
		this.fabricante = fabricante;
		this.cor = cor;
		this.valor = valor;
	}

	public void darDesconto(float porcentagem) {
		if (porcentagem > 0 && porcentagem <= 10) {
			this.valor = this.valor * (1 - (porcentagem / 100F));
		}
	}
	
	public void darDescontoGerente(float porcentagem) {
		if (porcentagem > 0 && porcentagem <= 20) {
			this.valor = this.valor * (1 - (porcentagem / 100F));
		}
	}
	
	public void pintar(String novaCor) {
		this.cor = novaCor;
	}

	public String getNome() {
		return nome;
	}

	public float getPeso() {
		return peso;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getCor() {
		return cor;
	}

	public float getValor() {
		return valor;
	}
	

}
