package soldier.core;

import java.util.Iterator;

public interface Unit {
	/* Pattern Composite */
	void add(Unit unit);
	void remove(Unit unit);
	Unit getChildren(int id);
	
	/* Operations */
	public float strike();
	public float parry(float fore);
	public Iterator<Equipment> getWeapons();
	public void heal();
}
