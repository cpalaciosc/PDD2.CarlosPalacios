package es.upm.miw.pd.command.calculator;

import es.upm.miw.pd.command.calculator.memento.CalculadoraMementable;
import upm.jbb.IO;

public class ComandoDeshacer extends SuperComando {
	private final static String COMANDO = "Deshacer";

	public ComandoDeshacer(CalculadoraMementable calculadora) {
		super(calculadora);
	}

	@Override
	public String name() {
		return COMANDO;
	}

	@Override
	public void execute() {
		Calculadora calculadoraRestore = MainCalculadora.getGestorMementos()
				.getMemento(
						(String) IO.in.select(MainCalculadora
								.getGestorMementos().keys(), "Restaurar"));
		IO.out.println("Calc restore " + calculadoraRestore.getTotal());
		this.getOriginador().restoreMemento(calculadoraRestore);
	}

}
