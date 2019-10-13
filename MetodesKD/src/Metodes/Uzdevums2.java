package Metodes;

import java.util.Scanner;

public class Uzdevums2 {
		static double x;
		static double y;
		static double z;
		static Scanner input = new Scanner(System.in);
		public static void main(String[] args) {
			
			System.out.print("ievadi y: ");
			 x = input.nextInt();
			System.out.print("ievadi y: ");
			 y = input.nextInt();
			
			if (x<-5&&-5<y&&y<5) {			
				pirmais ();
			}
			if (-5 <= x&&x <=5&& 5<=y&&y<10 ) {
				otrais ();
			}
			if ( x>5&&y>=10 ) {			
				tresais ();
			}
			

		}
		public static void pirmais() {
			
			z= (1/(-x))+3*y;
			System.out.print("Z= "+z );
		}
		public static void otrais() {
			
			z= Math.sin(2*y)+Math.cos(x);
			System.out.print("Z= "+z );
		}
		public static void tresais() {
			
			z= x*y*y+Math.sqrt(2*x)+2*y;
			System.out.print("Z= "+z );
		}

	}
	

