package myProject14;
import  java.util.Scanner;

public class FlyTicket {
	public static void main(String[]args) {
		int km,age,situation;
		double cost=0;
		Scanner inp=new Scanner(System.in);
		System.out.print("Please enter length of your destination in Km:");
		km=inp.nextInt();
		System.out.print("Please enter your age:");
		age=inp.nextInt();
		System.out.print("Please enter 1 if your ticket is one way otherwise,enter 2:");
		situation=inp.nextInt();
		if((km<=0||age<=0)||!(situation==1||situation==2)) {
			System.out.println("Incorrect Data Entered");
			
		}
		else {
		if(age<12) {
			if(situation==2) {
				cost=km*0.1*0.3;
			}
			else {
			cost=km*0.1*0.5;
			}
		}
		if(age>=12&&age<=24) {
			if(situation==2) {
				cost=km*0.1*0.7;
			}
			else {
				cost=km*0.1*0.9;
			}
		}
		if(age>65) {
			if(situation==2) {
				cost=km*0.1*0.5;
			}
			else {
				cost=km*0.1*0.7;
			}
		}
		System.out.println("Cost of your ticket is:"+cost);
		}
		
		
		
		
	}
}
