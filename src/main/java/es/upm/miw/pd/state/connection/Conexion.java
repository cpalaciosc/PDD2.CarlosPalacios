package es.upm.miw.pd.state.connection;

public class Conexion {
	private Fase fase;
	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		this.fase = new FaseCerrado();
	}

	public Link getLink() {
		return link;
	}

	public Estado getEstado() {
		return this.fase.getEstado();
	}
	
	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public void abrir() {
		this.fase.abrir(this);
	}

	public void cerrar() {
		this.fase.cerrar(this);
	}

	public void parar() {
		this.fase.parar(this);
	}

	public void iniciar() {
		this.fase.iniciar(this);
	}

	public void enviar(String msg) {
		this.fase.enviar(this, msg);
	}

	public void recibir(int respuesta) {
		this.fase.recibir(this, respuesta);
	}

}
