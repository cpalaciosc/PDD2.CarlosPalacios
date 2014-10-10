package es.upm.miw.pd.state.connection;

public class FasePreparado extends Fase {

	@Override
	public void abrir(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setFase(new FaseCerrado());
		
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setFase(new FaseParado());
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.setFase(new FaseEsperando());
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public Estado getEstado() {
		return Estado.PREPARADO;
	}


}
