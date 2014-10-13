package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {
	private static final String[] textValue = { "zero", "one", "two", "three",
			"four", "five" };

	public NaturalNumberEn(int value) {
		super(value);
	}

	@Override
	public String[] getArrayTextvalue() {
		return textValue;
	}

}
