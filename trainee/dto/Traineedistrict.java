package com.xworkz.trainee.dto;

public class Traineedistrict {
	
		private String name;
		private Traineetaluk taluk;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Traineetaluk getTaluk() {
			return taluk;
		}

		public void setTaluk(Traineetaluk taluk) {
			this.taluk = taluk;
		}


	  public String toString() {
			return "DistrictDTO [name=" + name + ", taluk=" + taluk + "]";
		}
		
		

	}


