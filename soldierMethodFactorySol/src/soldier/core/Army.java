package soldier.core;

import java.util.ArrayList;
import java.util.Iterator;

public class Army implements Unit {
	private ArrayList<Unit> army;
	
	public Army() {
		army = new ArrayList<Unit>();
	}
	
	public void add(Unit unit) {
		if(unit != null) {
			army.add(unit);
		}
	}
	
	public void remove(Unit unit) {
		if(unit != null) {
			army.remove(unit);
		}
	}
	
	public Unit getChildren(int id) {
		return army.get(id);
	}

	@Override
	public float strike() {
		float sum = 0 ;
		
		@SuppressWarnings("unchecked")
		ArrayList<Unit> tmp = (ArrayList<Unit>)army.clone();
		for(Unit unit : tmp) {
			sum += unit.strike();
		}
		return sum;
	}

	@Override
	public float parry(float fore) {
		float sum = 0 ;
		
		@SuppressWarnings("unchecked")
		ArrayList<Unit> tmp = (ArrayList<Unit>)army.clone();
		for(Unit unit : tmp) {
			sum += unit.parry(fore);
		}
		return sum;
	}

	@Override
	public Iterator<Equipment> getWeapons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		
	}
	
	
}
