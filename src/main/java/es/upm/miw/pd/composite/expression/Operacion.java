package es.upm.miw.pd.composite.expression;

public abstract class Operacion extends Expresion {
	
	private Expresion operando1;
	private Expresion operando2;
	
	public Operacion(Expresion operando1, Expresion operando2){
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public abstract int operar();
	public abstract String getOperador();

	public Expresion getOperando1() {
		return operando1;
	}

	public Expresion getOperando2() {
		return operando2;
	}
	
	
	@Override
	public String toString() {
		return "("+this.operando1+this.getOperador()+this.operando2+")";
	}
	
	

}
