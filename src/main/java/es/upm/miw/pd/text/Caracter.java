package es.upm.miw.pd.text;

public class Caracter extends Componente {
	private String caracter;

	public Caracter(String caracter) {
		this(caracter.charAt(0));
	}

	public Caracter(char caracter) {
		this.caracter = String.valueOf(caracter);
	}

	public char getCaracter() {
		return this.caracter.charAt(0);
	}

	@Override
	public String dibujar() {
		return this.caracter;

	}

	@Override
	public String dibujar(boolean mayusculas) {
		return mayusculas ? this.caracter.toUpperCase() : this.dibujar();

	}

	@Override
	public void add(Componente c) {
	}

}
