package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class Contenido extends Componente {

	private List<Componente> contenido;

	public Contenido() {
		this.contenido = new ArrayList<Componente>();
	}

	public List<Componente> getContenido() {
		return contenido;
	}
	
	public abstract String getFinContenido();
	
	@Override
	public String imprimir() {
		String txt = "";
		for (Componente caracter : this.getContenido()) {
			txt += caracter.imprimir();
		}
		return txt + this.getFinContenido();
	}
	
	@Override
	public String imprimir(boolean mayusculas) {
		String txt = "";
		for (Componente caracter : this.getContenido()) {
			txt += caracter.imprimir(mayusculas);
		}
		return txt + this.getFinContenido();
	}

}
