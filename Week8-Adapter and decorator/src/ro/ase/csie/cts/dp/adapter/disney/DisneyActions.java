package ro.ase.csie.cts.dp.adapter.disney;

public interface DisneyActions {
	
	public abstract void changeLocation(int x, int y);
	public abstract void isWounded(int lostLifePoints);
	public abstract void isHealing(int recoverdPoints);
	
	public abstract String getName();
	public abstract int getPower();
}
