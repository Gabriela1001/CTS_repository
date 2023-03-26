package singleton.registry.nerecomandat;

import java.util.HashMap;
import java.util.Map;

public class Registru {
	private static Map<String,Firma> firme = new HashMap<>();
	
	public static Firma getFirma(String name) {
		if(!firme.containsKey(name)) {
			firme.put(name, new Firma(name,0));
		}
		return firme.get(name);
	}
	

}
