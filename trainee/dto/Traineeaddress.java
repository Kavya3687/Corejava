package com.xworkz.trainee.dto;

public class Traineeaddress {
	
		private String buildingName;
		private Traineearea area;
		
		
		public String getBuildingName() {
			return buildingName;
		}


		public void setBuildingName(String buildingName) {
			this.buildingName = buildingName;
		}


		public Traineearea getArea() {
			return area;
		}


		public void setArea(Traineearea area) {
			this.area = area;
		}


		public String toString() {
			return "AdressDTO [buildingName=" + buildingName + ", area=" + area + "]";
		}

		
		
		
	}


