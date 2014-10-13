package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {

	private NaturalNumberCreator naturalNumberCreator;
	private static NaturalNumberManager naturalNumberManager;

	private NaturalNumberManager() {
		this.setNaturalNumberCreator(new NaturalNumberEsCreator());
	}

	public static NaturalNumberManager getInstance() {
		if (naturalNumberManager == null) {
			naturalNumberManager = new NaturalNumberManager();
		}
		return naturalNumberManager;
	}

	public NaturalNumber getNaturalNumber(int value) {
		return this.naturalNumberCreator.createNaturalNumber(value);
	}

	public void setNaturalNumberCreator(
			NaturalNumberCreator naturalNumberCreator) {
		this.naturalNumberCreator = naturalNumberCreator;
	}

}
