
public class Game {
	
	public static String fight(Soldat s1, Soldat s2) {
		Soldat attack = s1;
		Soldat defend = s2;
		while(s1.isAlive() && s2.isAlive()) {
		    defend.parry(attack.strike());
		    Soldat tmpSwap = attack;
		    attack = defend;
		    defend = tmpSwap;
		}
		if (s1.isAlive()) 
		    return "Soldier 1  Won";
		else if(s2.isAlive())
		    return "Soldier 2  Won";
		return "S1 & S2 are dead";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Soldat infantryman_1 = new IM();
		Soldat infantryman_2 = new IM();
		Soldat hourseman = new HM();
		
		Soldat inf_with_sword = new SoldatWithSoard(infantryman_1);
		Soldat inf_with_sheild = new SoldatWithShield(infantryman_2);
		Soldat inf_with_sword_shield = new SoldatWithSoard(inf_with_sheild);
		
		Soldat hm_with_sword = new SoldatWithSoard(hourseman);
		
		System.out.println("Infantry men battle :");
		System.out.println("The result of the first fight : " + fight(inf_with_sword, inf_with_sheild));
		System.out.println("The result of the second fight : " + fight(inf_with_sword_shield, inf_with_sword));
		
		System.out.println("Horse men battle :");
		System.out.println("The result of the first fight : " + fight(hm_with_sword, inf_with_sword));
		
	}

}
