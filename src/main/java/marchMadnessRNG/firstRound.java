/**
 * 
 */
package main.java.marchMadnessRNG;

import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Tyler Quist
 *
 */
public class firstRound {
 
	
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File ("C:\\Users\\Tyler Quist\\Documents\\coding projects\\marchMadnessRNG\\2021Teams.txt");
		
		Scanner scan = new Scanner (file).useLocale(Locale.US);
		
		Team [] teams = new Team [64];
		
		int i = 0;
		while (scan.hasNextLine()) {
			
			String name = scan.next();
			int seed = scan.nextInt();
			int region = scan.nextInt();
			
			teams [i] = new Team(name,seed,region);
			
			i++;
		}
		
		play (teams);
		scan.close();
	}
	/**
	 * plays the first round of the march madness tournament and prints out results in the console
	 * 
	 * @param teamList list of teams playing in the first round 
	 */
	public static void play(Team [] teamList) {
		System.out.println("First Round Results");
		System.out.println("");
		
		for (int i = 0; i < teamList.length;i++) {
			double num =  rngNum();
			
			printDivNames(i);
			
			switch(teamList[i].getSeed()) {
			case 1:
				if (num < 0.7)
					System.out.println(teamList[i + 14].getName() + " wins");
				else 
					System.out.println(teamList[i].getName() + " wins");
				break;
			case 2:
				if (num < 5.7)
					System.out.println(teamList[i + 13].getName() + " wins");
				else 
					System.out.println(teamList[i].getName() + " wins");
				break;
			case 3:
				if (num < 15)
					System.out.println(teamList[i + 12].getName() + " wins");
				else 
					System.out.println(teamList[i].getName() + " wins");
				break;
			case 4:
				if (num < 20.7)
					System.out.println(teamList[i + 11].getName() + " wins");
				else 
					System.out.println(teamList[i].getName() + " wins");
				break;
			case 5:
				if (num < 35.7)
					System.out.println(teamList[i + 7].getName() + " wins");
				else 
					System.out.println(teamList[i].getName() + " wins");
				break;
			case 6:
				if (num < 37.1)
					System.out.println(teamList[i + 5].getName() + " wins");
				else 
					System.out.println(teamList[i].getName() + " wins");
				break;
			case 7:
				if (num < 39.3)
					System.out.println(teamList[i + 3].getName() + " wins");
				else 
					System.out.println(teamList[i].getName() + " wins");
				break;
			case 8:
				if (num < 50)
					System.out.println(teamList[i + 1].getName() + " wins");
				else 
					System.out.println(teamList[i].getName() + " wins");
				System.out.println("");
				i = i + 8;
				break;
			}
		}
		
		
	}
	
	/*
	 * prints titles of which division results are directly underneath in console
	 * 
	 * @param num number on teamlist 
	 */
	public static void printDivNames(int num) {
		switch(num){
		case 0:
		System.out.println("MidWest Division Results");	
		System.out.println("");
		break;
		case 16:
			System.out.println("South Division Results");	
			System.out.println("");
			break;
		case 32:
			System.out.println("East Division Results");	
			System.out.println("");
			break;
		case 48:
			System.out.println("West Division Results");	
			System.out.println("");
			break;
		}
	}
	
	/*
	 * generates five random numbers between 0 and 100 and returns average of those numbers
	 * 
	 * @returns average of five random numbers between 0 and 100
	 */
	public static double rngNum() {
		double num1 = (Math.random() * (100));
		double num2 = (Math.random() * (100));
		double num3 = (Math.random() * (100));
		double num4 = (Math.random() * (100));
		double num5 = (Math.random() * (100));
		
		double num = (num1 + num2 + num3 + num4 + num5) / 5;
		return num;
 	}

}
