package ro.ase.csie.cts.g1092.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class RestorePointManager {
	
	List<HeroRestorePoint> restorePoints = new ArrayList<>();
	
	public void addRestorePoint*HeroRestorePoint point) {
		this.restorePoints.add(point);
	}
	
	public HeroRestorePoint getRestorePoint(int index) {
		if(index < 0 || index >= restorePoints)
	}
}
