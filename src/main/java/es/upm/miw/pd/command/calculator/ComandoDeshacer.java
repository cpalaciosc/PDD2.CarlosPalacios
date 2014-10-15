package es.upm.miw.pd.command.calculator;

import es.upm.miw.pd.command.calculator.memento.CalculadoraMementable;
import es.upm.miw.pd.command.calculator.memento.GestorMementos;
import upm.jbb.IO;

public class ComandoDeshacer extends ComandoMementable {
	private final static String COMANDO = "Deshacer";

	public ComandoDeshacer(CalculadoraMementable originador,
			GestorMementos<Calculadora> gm) {
		super(originador, gm);
	}

	@Override
	public String name() {
		return COMANDO;
	}

	@Override
	public void execute() {
		Calculadora calculadoraRestore = this.getGestorMementos()
				.getMemento(
						(String) IO.in.select(this
								.getGestorMementos().keys(), "Restaurar"));
		this.getOriginador().restoreMemento(calculadoraRestore);
	}

}
