package es.upm.miw.pd.command.calculator;

import es.upm.miw.pd.command.calculator.memento.CalculadoraMementable;

public abstract class SuperComando implements Comando {
	private Calculadora calculadora;
	private CalculadoraMementable originador;

	public SuperComando(Calculadora calculadora) {
		this.calculadora = calculadora;
	}

	public SuperComando(CalculadoraMementable originador) {
		this.originador = originador;
	}

	public Calculadora getCalculadora() {
		return calculadora;
	}

	public CalculadoraMementable getOriginador() {
		return originador;
	}

	@Override
	public abstract String name();

	@Override
	public abstract void execute();

}
