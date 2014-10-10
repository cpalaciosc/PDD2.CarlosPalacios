package es.upm.miw.pd.state.connection;

public class FaseEsperando extends Fase {

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		if (respuesta == 0) {
			conexion.setFase(new FasePreparado());
		} else {
			conexion.setFase(new FaseCerrado());
		}

	}

	@Override
	public Estado getEstado() {
		return Estado.ESPERANDO;
	}

}
