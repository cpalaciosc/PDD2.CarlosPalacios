package es.upm.miw.pd.command.calculator;

public class ComandoIniciar extends SuperComando {
	private final static String COMANDO = "Iniciar";

	public ComandoIniciar(Calculadora calculadora) {
		super(calculadora);
	}

	@Override
	public String name() {
		return COMANDO;
	}

	@Override
	public void execute() {
		this.getCalculadora().iniciar();
	}

}
