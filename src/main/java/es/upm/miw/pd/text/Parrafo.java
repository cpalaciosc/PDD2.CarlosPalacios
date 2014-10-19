package es.upm.miw.pd.text;

public class Parrafo extends Contenido {

	public Parrafo() {
	}

	@Override
	public void aniadirCaracter(Componente componente) {
		this.getContenido().add(componente);
	}

	@Override
	public void quitarCaracter(Componente componente) {
		this.getContenido().remove(componente);

	}

	@Override
	public void aniadirParrafo(Componente componente) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void quitarParrafo(Componente componente) {
		this.getContenido().remove(componente);

	}

	@Override
	public void aniadirTexto(Componente componente) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void quitarTexto(Componente componente) {
		this.getContenido().clear();

	}

	@Override
	public String getFinContenido(){
		return "\n";
	}

}
