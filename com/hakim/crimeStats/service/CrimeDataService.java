/**
 * 
 */
package com.hakim.crimeStats;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CrimeDataService.java
 * 12/14/2016
 * @author Tufiq
 * this class is a data service class that gets the data inputed to it and it stores each element 
 * to the proper crimeStatEntity object attribute
 *
 */
public class CrimeDataService {
	
	public List <CrimeStatsEntity> crimeDataHelper(String crimeDataFile){
		
		List<CrimeStatsEntity> crimeStats = new ArrayList<CrimeStatsEntity>();
        String csvFile = crimeDataFile;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            br.readLine();
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] crimeStat = line.split(cvsSplitBy);
                
                CrimeStatsEntity crimeStatsEntity = new CrimeStatsEntity();
                crimeStatsEntity.setYear(Integer.parseInt(String.valueOf(crimeStat[0])));
                crimeStatsEntity.setPopulation(Long.parseLong(crimeStat[1]));
                crimeStatsEntity.setViolentCrime(Long.parseLong(crimeStat[2]));
                crimeStatsEntity.setViolentCrimeRate(Double.parseDouble(crimeStat[3]));
                crimeStatsEntity.setMurderNonnegligentManslaughter(Long.parseLong(crimeStat[4]));
                crimeStatsEntity.setMurderNonnegligentManslaughterRate(Double.parseDouble(crimeStat[5]));
                crimeStatsEntity.setRape(Long.parseLong(crimeStat[6]));
                crimeStatsEntity.setRapeRate(Double.parseDouble(crimeStat[7]));
                crimeStatsEntity.setRobbery(Long.parseLong(crimeStat[8]));
                crimeStatsEntity.setRobberyRate(Double.parseDouble(crimeStat[9]));
                crimeStatsEntity.setAggravatedAssault(Long.parseLong(crimeStat[10]));
                crimeStatsEntity.setAggravatedAssaultRate(Double.parseDouble(crimeStat[11]));
                crimeStatsEntity.setPropertyCrime(Long.parseLong(crimeStat[12]));
                crimeStatsEntity.setPropertyCrimeRate(Double.parseDouble(crimeStat[13]));
                crimeStatsEntity.setBurglary(Long.parseLong(crimeStat[14]));
                crimeStatsEntity.setBurglaryRate(Double.parseDouble(crimeStat[15]));
                crimeStatsEntity.setLarcenyTheft(Long.parseLong(crimeStat[16]));
                crimeStatsEntity.setLarcenyTheftRate(Double.parseDouble(crimeStat[17]));
                crimeStatsEntity.setMotorVehicleTheft(Long.parseLong(crimeStat[18]));
                crimeStatsEntity.setMotorVehicleTheftRate(Double.parseDouble(crimeStat[19]));
                
                crimeStats.add(crimeStatsEntity);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

		return crimeStats;
		
	}

}
