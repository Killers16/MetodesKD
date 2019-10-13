package Metodes;

import java.util.Scanner;



public class Uzdevums1 {
public static void Vats( ) {
Scanner input = new Scanner(System.in);	
System.out.println("Ievadi amperus:");
int I1 = input.nextInt();
System.out.println("Ievadi volti:");
int U3 = input.nextInt();
int P = I1*U3;
input.close();
System.out.println(P);
}


public static void Volti( ) {
Scanner input = new Scanner(System.in);		
System.out.println("Ievadi amperus:");
double I1 = input.nextDouble();
System.out.println("Ievadi vatus:");
double P2 = input.nextDouble();
double U = I1*P2;
input.close();
System.out.println(U);
}

public static void Amperi( ) {
Scanner input = new Scanner(System.in);	
System.out.println("Ievadi Voltus:");
int U3 = input.nextInt();
System.out.println("Ievadi Vatus:");
int P2 = input.nextInt();
int I = U3/P2;

System.out.println(I);
	input.close();
}





public static void main(String []args) {
	Scanner input = new Scanner(System.in);	
	System.out.println("1-Aprekinat Vatus(P):");
System.out.println("2-Aprekinat Voltus(U):");
System.out.println("3-Aprekinat Amperus(A):");
System.out.print("Izvelaties  darbibu:");
	int x = input.nextInt();
	
	if (x==1){	
		Vats();
	}
	if (x==2){	
		Volti();
	}
	if (x==3){
		Amperi();
	}	
	double I=0 ;
	double P=0 ;
	double U=0;
	double I1;
	double P2;
	double U3;




}
	}
	
	





