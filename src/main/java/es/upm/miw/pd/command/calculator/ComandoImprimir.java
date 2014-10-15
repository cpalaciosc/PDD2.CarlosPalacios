package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class ComandoImprimir extends SuperComando {
	private final static String COMANDO = "Imprimir";

	public ComandoImprimir(Calculadora calculadora) {
		super(calculadora);
	}

	@Override
	public String name() {
		return COMANDO;
	}

	@Override
	public void execute() {
		IO.out.println(this.getCalculadora().getTotal());
	}

}
