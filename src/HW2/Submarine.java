public class Submarine extends Template {
	public void move() {
		wings("Folding up");
		System.out.println("Start Screw Propeller");
		randDepth();
		System.out.println("Sonar Started");
		wheels("Concealed Inside");
		randSeaLevel();
		randSpeed(50);
	}
}