package soldier.core;

public abstract class UnitSimple {
		private BehaviorSoldier _delag;
		private int nbEquipments;
		
		public UnitSimple(BehaviorSoldier s) {
			_delag = s;
			nbEquipments = 0;
		}
		
		public float strike() {
			return _delag.strike();
		}
		
		public float parry(float force) {
			return _delag.parry(force);
		}
		
		public void heal() {
			_delag.heal();
		}
		
		public boolean alive() {
			return _delag.alive();
		}
		
		public String getName() {
			return _delag.getName();
		}
		
		public float getHealthPoints() {
			return _delag.getHealthPoints();
		}
		
		public void addSword() {
			_delag = new StdExtension(this.strike() * 2, 0,_delag);
		}
		public void addShield() {
			_delag = new StdExtension(this.strike(), 10, _delag);
		}
		
		public void addEquipment(Equipment equipment) {
			nbEquipments++;
			if(nbEquipments > 10)
				return;
			_delag = equipment.createEquipment(_delag);
		}
}
