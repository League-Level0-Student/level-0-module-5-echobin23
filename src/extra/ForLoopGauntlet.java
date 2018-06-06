package extra;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int c = 100; c > 0; c--) {
			System.out.println(c);
		}
		for (int j = 0; j < 101; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}
		for (int a = 0; a < 100; a++) {
			if (a % 2 == 1) {
				System.out.println(a);
			}
		}
		for (int d = 0; d < 501; d++) {
			if (d % 2 == 0) {
				System.out.println(d + " is even");
			}
			if (d % 2 == 1) {
				System.out.println(d + " is odd");
			}
		}
		for (int s = 0; s < 778; s++) {
			if (s % 7 == 0) {
				System.out.println(s);
			}
		}
		for (int b = 0; b < 13; b++) {
		}
	}
}
