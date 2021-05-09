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
public class fullPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException{
	File file = new File ("C:\\Users\\Tyler Quist\\Documents\\coding projects\\marchMadnessRNG\\2021TeamsOrdered.txt");
		
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
		
		play (1, teams);
		scan.close();
	}
	
	/**
	 * plays the first round of the march madness tournament and prints out results in the console
	 * 
	 * @param teamList list of teams playing in the first round 
	 */
	public static void play(int roundNum, Team [] teamList) {
		if (roundNum == 7)
			System.out.println(teamList	[0].getName() + " Wins the National Championship");
		
		else {
			System.out.println("Round "+ roundNum +" Results");
			System.out.println("");
			 
			Team [] winnersList = new Team [(int) ((64)/(Math.pow(2, roundNum)))];
			
			int j = 0;
			
			for (int i = 0; i < teamList.length;i+=2) { //add all cases and posibilities
				double num =  rngNum();
				if (i == 0 || teamList [i].getRegion() != teamList [i - 2].getRegion()) {
					System.out.println( "Region " + teamList [i].getRegion() + " Division Results");
					System.out.println("");
				}
				switch(teamList[i].getSeed()) {
				case 1:
					switch(teamList[i + 1].getSeed()) {
					case 2 :
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						break;
					case 8:
						break;
					case 9:
						break;
					case 10:
						break;
					case 11:
						break;
					case 12:
						break;
					case 13:
						break;
					case 14:
						break;
					case 15:
						break;
					case 16:
						if (num < 0.7) {
							System.out.println(teamList[i + 1].getName() + " wins");
							winnersList [j] = new Team (teamList[i + 1].getName(),teamList[i + 1].getSeed(),teamList[i + 1].getRegion());
							j++;
						}
						else {
							System.out.println(teamList[i].getName() + " wins");
							winnersList [j] = new Team (teamList[i].getName(),teamList[i].getSeed(),teamList[i].getRegion());
							j++;
						}
						break;
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				case 13:
					break;
				case 14:
					break;
				case 15:
					break;
				case 16:
					break;
				}
				
				
			}
		
			play(roundNum + 1, winnersList);
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
