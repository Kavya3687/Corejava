package com.xworkz.trainee.dto;

public class Traineearea {
	
		private String areaName;
		private Traineedistrict district;
		
		
		public String getAreaName() {
			return areaName;
		}



		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}



		public Traineedistrict getDistrict() {
			return district;
		}



		public void setDistrict(Traineedistrict district) {
			this.district = district;
		}



		public String toString() {
			return "AreaDTO [areaName=" + areaName + ", district=" + district + "]";
		}
		
		

	}


