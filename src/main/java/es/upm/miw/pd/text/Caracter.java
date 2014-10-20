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
	public void aniadirCaracter(Componente componente) {
	}

	@Override
	public void quitarCaracter(Componente componente) {

	}

	@Override
	public void aniadirParrafo(Componente componente) {
	}

	@Override
	public void quitarParrafo(Componente componente) {
	}

	@Override
	public void aniadirTexto(Componente componente) {

	}

	@Override
	public void quitarTexto(Componente componente) {
	}

	@Override
	public String imprimir() {
		return this.caracter;

	}

	@Override
	public String imprimir(boolean mayusculas) {
		return mayusculas ? this.caracter.toUpperCase() : this.caracter
				.toLowerCase();

	}

}
