package es.upm.miw.pd.singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryReferences {
    private Map<String, Integer> references = null;
    private static FactoryReferences factoryReference;

    private int reference;

    private FactoryReferences() {
        this.references = new HashMap<>();
        this.reference = 0;
    }
    
    public static FactoryReferences getFactory(){
    	if(factoryReference==null){
    		factoryReference = new FactoryReferences();
    	}
    	return factoryReference;
    }

    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

}
