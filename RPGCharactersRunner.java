public class RPGCharactersRunner {
	public static void main(String[] args) {
		Warrior c1 = new Warrior("Jim");
		Healer c2 = new Healer("Aaron", 10);
		
		c2.heal(40, 100);
	}
}
