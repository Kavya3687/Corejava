package com.xworkz.trainee.dto;

public class Traineedetails {
	
		private String name;
		private long contactno;
		private String email;
		private Traineeaddress adress;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getContactno() {
			return contactno;
		}
		public void setContactno(long contactno) {
			this.contactno = contactno;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Traineeaddress getAdress() {
			return adress;
		}
		public void setAdress(Traineeaddress adress) {
			this.adress = adress;
		}
		
		public String toString() {
			return "TraineeDetails [name=" + name + ", contactno=" + contactno + ", email=" + email + ", adress=" + adress
					+ "]";
		}
		
}		




