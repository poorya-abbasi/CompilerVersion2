import java.util.Random;

public class Program {
	public static void calc(int x, int y) {
		Random rand = new Random();
		int z = 0;
		while (y >= -2) {
			z = rand.nextInt(10) + 1;
			if ((x - y) % z == 0) {
				System.out.println("X: " + x + " Y: " + y + " Z: " + z + "| sadness(" + y + ")");
			} else {
				System.out.println("X: " + x + " Y: " + y + " Z: " + z + "| summertime(" + y + ")");
			}
			y--;
		}
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 14;
		calc(x, y);
	}
}
