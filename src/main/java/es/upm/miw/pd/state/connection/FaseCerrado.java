package es.upm.miw.pd.state.connection;

public class FaseCerrado extends Fase {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setFase(new FasePreparado());
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		// TODO Auto-generated method stub
		
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
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public Estado getEstado() {
		return Estado.CERRADO;
	}


}
