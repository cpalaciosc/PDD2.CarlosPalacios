package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoSumar extends SuperComando  {
	private final static String COMANDO = "Sumar";

	public ComandoSumar(Calculadora calculadora) {
		super(calculadora);
	}

	@Override
	public String name() {
		return COMANDO;
	}

	@Override
	public void execute() {
		int valor = IO.in.readInt();
		this.getCalculadora().sumar(valor);
	}

}
