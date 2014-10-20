package es.upm.miw.pd.text;

public class Texto extends Contenido {

	public Texto() {
	}

	@Override
	public String getFinContenido() {
		return "---o---\n";
	}

	@Override
	public void add(Componente c) {
		if (c.getClass() == Caracter.class) {
			throw new UnsupportedOperationException();
		}
		this.getContenido().add(c);
	}

}
