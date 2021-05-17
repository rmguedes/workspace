package oo.televisao;

public class Televisao {

	// 4. Crie uma classe Televisao e uma classe ControleRemoto que pode 
	//controlar o volume e trocar os canais da televis�o. 
	//O controle de volume permite:
	//aumentar ou diminuir a potencia do volume de som em uma unidade de cada vez;
	//aumentar e diminuir o numero do canal em uma unidade;
	//trocar para um canal indicado;
	//consultar o valor do volume de som e o canal selecionado;

	//Crie depois um programa principal que interaja com as suas classes, 
	//n�o se esque�a dos modificadores de acesso e dos getters e setters em suas
	//classes.
	private int canalAtual;
	private int volumeAtual;
	
	public Televisao(int canalAtual, int volumeAtual) {
		this.canalAtual = canalAtual;
		this.volumeAtual = volumeAtual;
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}

	public int getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(int volumeAtual) {
		this.volumeAtual = volumeAtual;
	}
	
}
