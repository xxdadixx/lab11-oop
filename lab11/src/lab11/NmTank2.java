package lab11;

public class NmTank2 extends ClassicTank{
	
	@Override
	public void SetHP(int x) {
		HP = x;
	}

	@Override
	public void GetHP() {
		System.out.println("Tank 2 Have HP " + HP);
	}

	@Override
	public void Attack(int x) {
		System.out.println("Tank 2 Take DMG " + x);
		HP = HP - x;
	}

}//end class
