package es.upm.miw.pd.command.calculator;

import es.upm.miw.pd.command.calculator.memento.CalculadoraMementable;
import upm.jbb.IO;

public class ComandoGuardar extends SuperComando {
	private final static String COMANDO = "Guardar";

	public ComandoGuardar(CalculadoraMementable calculadora) {
		super(calculadora);
	}

	@Override
	public String name() {
		return COMANDO;
	}

	@Override
	public void execute() {
		this.getOriginador().setTotal(this.getOriginador().getTotal());
		MainCalculadora.getGestorMementos().addMemento(
				IO.in.readString("Nombre del Memento"),
				this.getOriginador().createMemento());
	}

}
