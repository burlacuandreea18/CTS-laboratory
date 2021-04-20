package ro.ase.csie.cts.g1092.dp.flyweoght;

import java.util.HashMap;
import java.util.Map;

public class Model3DFactory  {
	static Map<String, Model3DFlyWeightInterface> models
							= new HashMap<>();	
	
	static {
		models.put(ModelType.SOLDIER.toString(), 
				new Model3DFlyWeightInterface());
		
		models.put(ModelType.SOLDIER.toString(), 
				new Model3DFlyWeightInterface());
		
		
	}	
	static Model3DFlyWeightInterface getModel(ModelType type) {
		
	}
}
