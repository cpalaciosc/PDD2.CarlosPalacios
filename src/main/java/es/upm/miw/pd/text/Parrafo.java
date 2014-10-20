package es.upm.miw.pd.text;

public class Parrafo extends Contenido {

	public Parrafo() {
	}

	@Override
	public String getFinContenido() {
		return "\n";
	}

	@Override
	public void add(Componente c) {
		if ((c.getClass() == Parrafo.class) || c.getClass() == Texto.class) {
			throw new UnsupportedOperationException();
		}
		this.getContenido().add(c);
	}

}
