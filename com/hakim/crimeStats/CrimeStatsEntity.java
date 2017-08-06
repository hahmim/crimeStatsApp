/**
 * 
 */
package com.hakim.crimeStats;

/**
 * CrimeStatsEntity.java
 * 12/14/2016
 * @author Tufiq
 * this class is a POJO class that represents the crimes data object
 * and all of its attributes
 *
 */
public class CrimeStatsEntity {
	
	private Integer year;
	private Long population;
	private Long violentCrime;
	private Double violentCrimeRate;
	private Long murderNonnegligentManslaughter;
	private Double murderNonnegligentManslaughterRate;
	private Long rape;
	private Double rapeRate;
	private Long robbery;
	private Double robberyRate;
	private Long aggravatedAssault;
	private Double aggravatedAssaultRate;
	private Long propertyCrime;
	private Double propertyCrimeRate;
	private Long burglary;
	private Double burglaryRate;
	private Long larcenyTheft;
	private Double larcenyTheftRate;
	private Long motorVehicleTheft;
	private Double motorVehicleTheftRate;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CrimeStatsEntity other = (CrimeStatsEntity) obj;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public Long getViolentCrime() {
		return violentCrime;
	}
	public void setViolentCrime(Long violentCrime) {
		this.violentCrime = violentCrime;
	}
	public Double getViolentCrimeRate() {
		return violentCrimeRate;
	}
	public void setViolentCrimeRate(Double violentCrimeRate) {
		this.violentCrimeRate = violentCrimeRate;
	}
	public Long getMurderNonnegligentManslaughter() {
		return murderNonnegligentManslaughter;
	}
	public void setMurderNonnegligentManslaughter(Long murderNonnegligentManslaughter) {
		this.murderNonnegligentManslaughter = murderNonnegligentManslaughter;
	}
	public Double getMurderNonnegligentManslaughterRate() {
		return murderNonnegligentManslaughterRate;
	}
	public void setMurderNonnegligentManslaughterRate(Double murderNonnegligentManslaughterRate) {
		this.murderNonnegligentManslaughterRate = murderNonnegligentManslaughterRate;
	}
	public Long getRape() {
		return rape;
	}
	public void setRape(Long rape) {
		this.rape = rape;
	}
	public Double getRapeRate() {
		return rapeRate;
	}
	public void setRapeRate(Double rapeRate) {
		this.rapeRate = rapeRate;
	}
	public Long getRobbery() {
		return robbery;
	}
	public void setRobbery(Long robbery) {
		this.robbery = robbery;
	}
	public Double getRobberyRate() {
		return robberyRate;
	}
	public void setRobberyRate(Double robberyRate) {
		this.robberyRate = robberyRate;
	}
	public Long getAggravatedAssault() {
		return aggravatedAssault;
	}
	public void setAggravatedAssault(Long aggravatedAssault) {
		this.aggravatedAssault = aggravatedAssault;
	}
	public Double getAggravatedAssaultRate() {
		return aggravatedAssaultRate;
	}
	public void setAggravatedAssaultRate(Double aggravatedAssaultRate) {
		this.aggravatedAssaultRate = aggravatedAssaultRate;
	}
	public Long getPropertyCrime() {
		return propertyCrime;
	}
	public void setPropertyCrime(Long propertyCrime) {
		this.propertyCrime = propertyCrime;
	}
	public Double getPropertyCrimeRate() {
		return propertyCrimeRate;
	}
	public void setPropertyCrimeRate(Double propertyCrimeRate) {
		this.propertyCrimeRate = propertyCrimeRate;
	}
	public Long getBurglary() {
		return burglary;
	}
	public void setBurglary(Long burglary) {
		this.burglary = burglary;
	}
	public Double getBurglaryRate() {
		return burglaryRate;
	}
	public void setBurglaryRate(Double burglaryRate) {
		this.burglaryRate = burglaryRate;
	}
	public Long getLarcenyTheft() {
		return larcenyTheft;
	}
	public void setLarcenyTheft(Long larcenyTheft) {
		this.larcenyTheft = larcenyTheft;
	}
	public Double getLarcenyTheftRate() {
		return larcenyTheftRate;
	}
	public void setLarcenyTheftRate(Double larcenyTheftRate) {
		this.larcenyTheftRate = larcenyTheftRate;
	}
	public Long getMotorVehicleTheft() {
		return motorVehicleTheft;
	}
	public void setMotorVehicleTheft(Long motorVehicleTheft) {
		this.motorVehicleTheft = motorVehicleTheft;
	}
	public Double getMotorVehicleTheftRate() {
		return motorVehicleTheftRate;
	}
	public void setMotorVehicleTheftRate(Double motorVehicleTheftRate) {
		this.motorVehicleTheftRate = motorVehicleTheftRate;
	}
	
	

}

