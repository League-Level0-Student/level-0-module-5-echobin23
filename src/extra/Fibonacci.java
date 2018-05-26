package extra;

public class Fibonacci {
public static void main(String[]args) {
	int num1 = 0;
	int num2 = 1;
	for(int i = 0; i < 12; i++) {
		int sum = num1 + num2;
		System.out.println(sum);
		num1 = num2;
		num2 = sum;
	}
}
}
