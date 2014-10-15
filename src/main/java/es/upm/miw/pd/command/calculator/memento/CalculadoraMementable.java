package es.upm.miw.pd.command.calculator.memento;

import es.upm.miw.pd.command.calculator.Calculadora;

public class CalculadoraMementable extends Calculadora implements Mementable<Calculadora> {

	public CalculadoraMementable() {
		super();
	}

	@Override
	public Calculadora createMemento() {
		CalculadoraMementable calculadoraMementable = new CalculadoraMementable();
		calculadoraMementable.setTotal(this.getTotal());
		return calculadoraMementable;
	}

	@Override
	public void restoreMemento(Calculadora memento) {
		this.setTotal(memento.getTotal());
	}

	@Override
	public String toString() {
		return "CalculadoraMementable[" + this.getTotal() + "]";
	}

}
