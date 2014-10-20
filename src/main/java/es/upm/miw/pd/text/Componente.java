package es.upm.miw.pd.text;

public abstract class Componente {

	public Componente() {
	}

	public abstract void aniadirCaracter(Componente componente);

	public abstract void quitarCaracter(Componente componente);

	public abstract void aniadirParrafo(Componente componente);

	public abstract void quitarParrafo(Componente componente);

	public abstract void aniadirTexto(Componente componente);

	public abstract void quitarTexto(Componente componente);
	
	public abstract String imprimir();

	public abstract String imprimir(boolean mayusculas);

}
