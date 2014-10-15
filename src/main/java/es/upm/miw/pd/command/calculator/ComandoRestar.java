package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoRestar extends SuperComando {
	private final static String COMANDO = "Restar";

	public ComandoRestar(Calculadora calculadora) {
		super(calculadora);
	}

	@Override
	public String name() {
		return COMANDO;
	}

	@Override
	public void execute() {
		int valor = IO.in.readInt();
		this.getCalculadora().restar(valor);
	}

}
