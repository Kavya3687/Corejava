package com.xworkz.inheritance.dto;

public class Chrome extends Browser {
	
		
		private float version;
		private float size;
		private String releasedDate;
		
		public Chrome() {
			this("Banglore");
		System.out.println("invoking chrome constructor");
	}
		public Chrome(String place) {
			super(6.7f);
			System.out.println(place);
		}
		public String getReleasedDate() {
			return releasedDate;
		}
		
		public void SetReleasedDate(String releasedDate) {
			this.releasedDate = releasedDate;
			
		}
	public float getVersion() {
		return version;
	}
	public void SetVersion(float version) {
		this.version = version;
	}
	public float getSize() {
		return size;
	}
	public void SetSize(float size) {
		this.size = size;
	}

		
	}


