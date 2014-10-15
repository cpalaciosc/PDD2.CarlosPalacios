package es.upm.miw.pd.command.calculator;

import es.upm.miw.pd.command.calculator.memento.CalculadoraMementable;
import es.upm.miw.pd.command.calculator.memento.GestorMementos;
import upm.jbb.IO;

public class ComandoGuardar extends ComandoMementable {
	private final static String COMANDO = "Guardar";

	public ComandoGuardar(CalculadoraMementable originador,
			GestorMementos<Calculadora> gm) {
		super(originador, gm);
	}

	@Override
	public String name() {
		return COMANDO;
	}

	@Override
	public void execute() {
		this.getOriginador().setTotal(this.getOriginador().getTotal());
		this.getGestorMementos().addMemento(
				IO.in.readString("Nombre del Memento"),
				this.getOriginador().createMemento());
	}

}
