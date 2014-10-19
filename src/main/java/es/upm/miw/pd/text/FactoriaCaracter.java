package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FactoriaCaracter {

	private Map<String, Caracter> map;
	private static FactoriaCaracter factoria;

	private FactoriaCaracter() {
		map = new TreeMap<String, Caracter>();
	}

	public static FactoriaCaracter getInstance() {
		if (factoria == null) {
			factoria = new FactoriaCaracter();
		}
		return factoria;
	}

	public Caracter getCaracter(char key) {
		if (!this.map.containsKey(String.valueOf(key))) {
			Caracter value = new Caracter(key);
			this.map.put(String.valueOf(key), value);
		}
		return this.map.get(String.valueOf(key));
	}
	
	public List<Caracter> list(){
		return new ArrayList<Caracter>(map.values());
	}

}
