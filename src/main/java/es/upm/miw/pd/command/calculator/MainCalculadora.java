package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.memento.GestorMementos;
import es.upm.miw.pd.command.calculator.memento.CalculadoraMementable;

public class MainCalculadora {
	private GestorComandos gestor;
	private static GestorMementos<Calculadora> gm = new GestorMementos<Calculadora>();

	public MainCalculadora() {
		CalculadoraMementable calc = new CalculadoraMementable();
		this.gestor = new GestorComandos();
		this.gestor.add(new ComandoSumar(calc));
		this.gestor.add(new ComandoRestar(calc));
		this.gestor.add(new ComandoIniciar(calc));
		this.gestor.add(new ComandoImprimir(calc));
		this.gestor.add(new ComandoGuardar(calc));
		this.gestor.add(new ComandoDeshacer(calc));
	}

	public void ejecutar() {
		String key = (String) IO.in.select(this.gestor.keys());
		this.gestor.execute(key);
	}

	public static GestorMementos<Calculadora> getGestorMementos() {
		return gm;
	}

	public static void main(String[] args) {
		IO.in.addController(new MainCalculadora());
	}
}
