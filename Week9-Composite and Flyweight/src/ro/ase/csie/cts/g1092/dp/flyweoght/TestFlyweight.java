package ro.ase.csie.cts.g1092.dp.flyweoght;

import java.util.ArrayList;
import java.util.List;

public class TestFlyweight {

	public static void main(String[] args) {
		List<NPCCoordinates> soldiers = new ArrayList<NPCCoordinates>();
		soldiers.add(new NPCCoordinates(10, 10, 10, "RED"));
		soldiers.add(new NPCCoordinates(10, 10, 10, "GREEN"));
		soldiers.add(new NPCCoordinates(10, 10, 10, "YELLOW"));
	
		Model3DFlyWeightInterface soldierModel =
				Model3DFactory.getModel(ModelType.SOLDIER);
		for(NPCCoordinates soldierCoord: soldiers) {
			soldierModel.display(soldierCoord);
		}
	}

}
