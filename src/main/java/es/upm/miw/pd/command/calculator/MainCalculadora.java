package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.memento.GestorMementos;
import es.upm.miw.pd.command.calculator.memento.CalculadoraMementable;

public class MainCalculadora {
	private GestorComandos gestor;

	public MainCalculadora() {
		CalculadoraMementable calc = new CalculadoraMementable();
		GestorMementos<Calculadora> gm = new GestorMementos<Calculadora>();
		this.gestor = new GestorComandos();
		this.gestor.add(new ComandoSumar(calc));
		this.gestor.add(new ComandoRestar(calc));
		this.gestor.add(new ComandoIniciar(calc));
		this.gestor.add(new ComandoImprimir(calc));
		this.gestor.add(new ComandoGuardar(calc, gm));
		this.gestor.add(new ComandoDeshacer(calc, gm));
	}

	public void ejecutar() {
		String key = (String) IO.in.select(this.gestor.keys());
		this.gestor.execute(key);
	}

	public static void main(String[] args) {
		IO.in.addController(new MainCalculadora());
	}
}
