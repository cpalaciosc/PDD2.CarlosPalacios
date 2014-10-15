package es.upm.miw.pd.command.calculator;

import es.upm.miw.pd.command.calculator.memento.CalculadoraMementable;
import es.upm.miw.pd.command.calculator.memento.GestorMementos;

public abstract class ComandoMementable extends SuperComando {

	private GestorMementos<Calculadora> gm;

	public ComandoMementable(CalculadoraMementable originador,
			GestorMementos<Calculadora> gm) {
		super(originador);
		this.gm = gm;
	}

	public GestorMementos<Calculadora> getGestorMementos() {
		return this.gm;
	}

	@Override
	public abstract String name();

	@Override
	public abstract void execute();
}
