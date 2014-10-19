package es.upm.miw.pd.text;

public class Texto extends Contenido {

	public Texto() {
	}

	@Override
	public void aniadirCaracter(Componente componente) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void quitarCaracter(Componente componente) {
		this.getContenido().remove(componente);
		
	}

	@Override
	public void aniadirParrafo(Componente componente) {
		this.getContenido().add(componente);
	}

	@Override
	public void quitarParrafo(Componente componente) {
		this.getContenido().remove(componente);
		
	}

	@Override
	public void aniadirTexto(Componente componente) {
		this.getContenido().add(componente);
	}

	@Override
	public void quitarTexto(Componente componente) {
		this.getContenido().remove(componente);
		
	}
	
	@Override
	public String getFinContenido(){
		return "---o---";
	}





}
