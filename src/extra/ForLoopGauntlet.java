package extra;

public class ForLoopGauntlet {
	public static void main(String[] args) {
/*		for (int i = 0; i < 101; i++) {
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
		int year = 2005;
		for (int b = 0; b < 14; b++) {
			System.out.print(+year+b);
			System.out.println(" I was "+b);
		}*/
		
		for(int loop =0; loop <3; loop++) {
           for(int two = 0; two < 3; two++) {
        	   System.out.println(loop+" "+two);
           }
		}
		for(int nest = 1; nest < 8; nest+=3) {
			for(int nest2 = nest; nest2 < nest+3; nest2++) {
				System.out.print(nest2);
			}
			System.out.println();
		}
		for(int outl=1; outl<101; outl++) {
			for(int innerl=outl; innerl<outl+1; innerl++) {
				System.out.println(innerl);
				
			}
		}
	}
}
