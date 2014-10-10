package es.upm.miw.pd.composite.expression;

public class Multiplicar extends Operacion {

	public Multiplicar(Expresion operando1, Expresion operando2) {
		super(operando1, operando2);
	}

	@Override
	public int operar() {
		return this.getOperando1().operar() * this.getOperando2().operar();
	}

	@Override
	public String getOperador() {
		return "*";
	}
}
