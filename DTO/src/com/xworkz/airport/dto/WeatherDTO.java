package com.xworkz.airport.dto;

import java.io.Serializable;
//marker interface;d;;w;;d;d;w;;d;;w
public class WeatherDTO implements Serializable{
	
	 private double minTemp;
	 private double maxTemp;
	 private  int windSpeed;
	 private int humidity;
	 private String location;
	 public WeatherDTO() {
			
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + humidity;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		long temp;
		temp = Double.doubleToLongBits(maxTemp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(minTemp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + windSpeed;
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
		WeatherDTO other = (WeatherDTO) obj;
		if (humidity != other.humidity)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (Double.doubleToLongBits(maxTemp) != Double.doubleToLongBits(other.maxTemp))
			return false;
		if (Double.doubleToLongBits(minTemp) != Double.doubleToLongBits(other.minTemp))
			return false;
		if (windSpeed != other.windSpeed)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "WeatherDTO [minTemp=" + minTemp + ", maxTemp=" + maxTemp + ", windSpeed=" + windSpeed + ", humidity="
				+ humidity + ", location=" + location + "]";
	}
	public double getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}
	public double getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public int getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
