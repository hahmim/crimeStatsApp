/**
 * 
 */
package com.hakim.crimeStats;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrimeStatsApp {

	/**
	 * CrimeStatsApp.java
	 * 12/17/2016
	 * @author Hakim
	 * this class is the execution class the starting entry of the program
	 *
	 */
	public String userPrompter(){
		System.out.println("********** Welcome to the US Crime Statistical Application **************************"+"\n");
		System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program :"+"\n");
		System.out.println("1. What were the percentages in population growth for each consecutive year from 1994 – 2013?"+"\n");
		System.out.println("2. What year was the Murder rate the highest?"+"\n");
		System.out.println("3. What year was the Murder rate the lowest?"+"\n");
		System.out.println("4. What year was the Robbery rate the highest?"+"\n");
		System.out.println("5. What year was the Robbery rate the lowest?"+"\n");
		System.out.println("6. What was the total percentage change in Motor Vehicle Theft between 1998 and 2012?"+"\n");
		System.out.println("7. What was [enter your first unique statistic here]?"+"\n");
		System.out.println("8. What was [enter your second unique statistic here]?"+"\n");
		System.out.println("Q. Quit the program?"+"\n");
		System.out.println("Enter your selection: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;

	}

	public static void main(String[] args) {

		CrimeStatsApp crimeStatsApp = new CrimeStatsApp();
		CrimeStatCalculator crimeStatCalculator = new CrimeStatCalculator();
		List<CrimeStatsEntity> crimeStats = new ArrayList<CrimeStatsEntity>();
		CrimeDataService crimeDataService = new CrimeDataService();
		Integer maxYear = null;
		Integer minYear = null;
		Double rateOfChange = null;
		Long start = null;
		Long end = null;

		if (args == null) {
			System.exit(0);
		} else {
			crimeStats = crimeDataService.crimeDataHelper(args[0]);
		}

		start = System.currentTimeMillis();

		String input = "";
		while (!input.equals(CrimeAppConstants.Q)) {
			input = crimeStatsApp.userPrompter();

			if (input.equals(CrimeAppConstants.ONE)) {
				crimeStatCalculator.populationGrowthCalc(crimeStats);
				// input= crimeStatsApp.userPrompter();
			}
			if (input.equals(CrimeAppConstants.TWO)) {
				maxYear = crimeStatCalculator.findMaximumMurderRate(crimeStats);
				System.out.println("The Murder rate was highest in: " + maxYear);
				// input= crimeStatsApp.userPrompter();
			}
			if (input.equals(CrimeAppConstants.THREE)) {
				minYear = crimeStatCalculator.findMinimumMurderRate(crimeStats);
				System.out.println("The Murder rate was lowest in: " + minYear);
			}
			if (input.equals(CrimeAppConstants.FOUR)) {
				maxYear = crimeStatCalculator.findMaximumRobberyRate(crimeStats);
				System.out.println("The Robbery rate was highest in: " + maxYear);
			}
			if (input.equals(CrimeAppConstants.FIVE)) {
				minYear = crimeStatCalculator.findMinimumRobberyRates(crimeStats);
				System.out.println("The Robbery rate was lowest in: " + minYear);
			}
			if (input.equals(CrimeAppConstants.SIX)) {
				rateOfChange = crimeStatCalculator.motorVehicleTheftDiff(crimeStats);
				System.out.println(
						"The total percentage change in Motor Vehicle Theft between 1998 and 2012 is: " + rateOfChange);
			}
			if (input.equals(CrimeAppConstants.SEVEN)) {
				// functionality here

			}
			if (input.equals(CrimeAppConstants.EIGHT)) {
				// functionality here
			}
			if (input.equals(CrimeAppConstants.Q)) {
				System.out.println("Thank you for trying the US Crimes Statistics Program.");
				end = System.currentTimeMillis();
				System.out.println("Elapsed time in seconds was: " + (end - start) / 1000);
				System.exit(0);

			}

		}

	}

}
