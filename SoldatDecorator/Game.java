
public class Game {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Soldat infantryman = new IM();
		Soldat hourseman = new HM();
		
		Soldat inf_with_sword = new SoldatWithSoard(infantryman);
		Soldat inf_with_sheild = new SoldatWithShield(infantryman);
		Soldat inf_with_sword_shield = new SoldatWithSoard(inf_with_sheild);
		
		
		
	}

}
