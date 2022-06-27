import java.util.Random;

public class Program {

	public static void main(String[] args) {
		int x = 13;
		int y = 14;
		func(x, y);
	}

	public static void func(int x, int y) {
		Random rand = new Random();
		int z = 0;
		while (y >= -2) {
			z = rand.nextInt(10) + 1;
			if ((x - y) % z == 0) {
				System.out.println("sadness(" + y + ")");
			} else {
				System.out.println("summertime(" + y + ")");
			}
			y--;
		}
	}
}
