package es.upm.miw.pd.composite.expression;

public class Numero extends Expresion {
	
	private int valor;
	
	public Numero(int valor){
		this.valor = valor;
	}

	@Override
	public int operar() {
		return valor;
	}
	
	@Override
	public String toString() {
		return ""+this.valor;
	}

}
