package oo.formas;

public class Retangulo extends FormaGeometrica {

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void calculaArea() {
		System.out.println("-- Calculando a Área do Retângulo --");
		super.setArea(this.base * this.altura);
	}
	
}
