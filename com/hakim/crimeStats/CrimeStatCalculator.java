/**
 * 
 */
package com.hakim.crimeStats;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * CrimeStatCalculator.java
 * 12/14/2016
 * @author Tufiq
 * this class is an aggregation  engine class that gets the data from a CrimeStat object array
 *  and calculates different stats 
 * 
 *
 */
public class CrimeStatCalculator {

	public void populationGrowthCalc(List<CrimeStatsEntity> crimeList){
		Integer preYear;
		Integer postYear;
		Long preYearPop;
		Long postYearPop;
		Double rateOfChange;
		for (int i = 0; i< crimeList.size()-1;i++){
			preYear = crimeList.get(i).getYear();
			postYear = crimeList.get(i+1).getYear();
			preYearPop = crimeList.get(i).getPopulation();
			postYearPop = crimeList.get(i+1).getPopulation();
			rateOfChange = calculateRateOfChange(preYearPop,postYearPop);
			System.out.println("the population grownt between"+" "+preYear+" "+"and"+" "+postYear+" is: "+ rateOfChange);
		}
		
	}
	
	
	
	private Double calculateRateOfChange(Long year0, Long year1){
		
		Double deltaRate = (((double)(year1-year0)*CrimeAppConstants.MULTIPLIER/year0));
		Double AbsValRate = Math.abs(deltaRate);
		BigDecimal convertedRate = new BigDecimal(AbsValRate);
		BigDecimal roundedDeltaRate =  convertedRate.setScale(2, RoundingMode.UP);
		return roundedDeltaRate.doubleValue();
		
	}
	
	
	public int findMaximumMurderRate(List<CrimeStatsEntity> crimeList){
		Double maxMurderRate= crimeList.get(0).getMurderNonnegligentManslaughterRate();
		int maxMurderRateYear = 0;
		for (CrimeStatsEntity crimeStatsEntity: crimeList){
			if(crimeStatsEntity.getMurderNonnegligentManslaughterRate()>maxMurderRate){
				maxMurderRate = crimeStatsEntity.getMurderNonnegligentManslaughterRate();
				maxMurderRateYear = crimeStatsEntity.getYear();
				
			}else{
				maxMurderRateYear = crimeList.get(0).getYear();
			}

		}
		
		return maxMurderRateYear;
		
	}
	
	public int findMinimumMurderRate(List<CrimeStatsEntity> crimeList){
		Double minMurderRate= crimeList.get(0).getMurderNonnegligentManslaughterRate();
		int minMurderRateYear = 0;
		for (CrimeStatsEntity crimeStatsEntity: crimeList){
			if(crimeStatsEntity.getMurderNonnegligentManslaughterRate()<minMurderRate){
				minMurderRate = crimeStatsEntity.getMurderNonnegligentManslaughterRate();
			    minMurderRateYear = crimeStatsEntity.getYear();
			}else{
				minMurderRateYear = crimeList.get(0).getYear();
			}

		}
		
		return minMurderRateYear;
		
	}
	
	public int findMaximumRobberyRate(List<CrimeStatsEntity> crimeList){
		Double maxRobberyRate= crimeList.get(0).getRobberyRate();
		int maxRobberyYear = 0;
		for (CrimeStatsEntity crimeStatsEntity: crimeList){
			if(crimeStatsEntity.getRobberyRate()>maxRobberyRate){
				maxRobberyRate = crimeStatsEntity.getRobberyRate();
				maxRobberyYear = crimeStatsEntity.getYear();
			}else{
				maxRobberyYear = crimeList.get(0).getYear();
			}

		}
		
		return maxRobberyYear;
		
	}
	
	public int findMinimumRobberyRates(List<CrimeStatsEntity> crimeList){
		Double minRobberyRate= crimeList.get(0).getRobberyRate();
		int minRobberyYear = 0;
		for (CrimeStatsEntity crimeStatsEntity: crimeList){
			if(crimeStatsEntity.getRobberyRate()<minRobberyRate){
				minRobberyRate = crimeStatsEntity.getRobberyRate();
				minRobberyYear = crimeStatsEntity.getYear();
			}else{
				minRobberyYear = crimeList.get(0).getYear();
			}

		}
		
		return minRobberyYear;
		
	}
	
	public Double motorVehicleTheftDiff(List<CrimeStatsEntity> crimeList){
		Long year98Stat = null;
		Long year12Stat = null;
		Double vehiculeTheftDiff=null;
		for (CrimeStatsEntity crimeStatsEntity: crimeList){
			if(crimeStatsEntity.getYear().equals(CrimeAppConstants.NINTYEIGHT)){
				year98Stat = crimeStatsEntity.getMotorVehicleTheft();
			}
			if(crimeStatsEntity.getYear().equals(CrimeAppConstants.TWOTWELVE)){
				year12Stat = crimeStatsEntity.getMotorVehicleTheft();
			}
			
			 
		}
		vehiculeTheftDiff = calculateRateOfChange(year98Stat,year12Stat);
		
		return vehiculeTheftDiff;
		
	}

}
