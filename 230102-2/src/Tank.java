public class Tank extends Unit implements IAttack {
	public int hp;
	public boolean mode;
	@Override
	public void attack() {
		System.out.println("탱크 공격");
		
	}
	
}
