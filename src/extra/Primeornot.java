package extra;

import javax.swing.JOptionPane;

public class Primeornot {
	 public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("What number would you like?");
		int prime = Integer.parseInt(number);
		 for(int i = 2; i < prime-1; i++){
		 
if(prime%i == 0) {
	System.out.println("This isn't a prime number");
	System.exit(0);
}
		 }
		 System.out.println("This is an prime number");
	 }
}
