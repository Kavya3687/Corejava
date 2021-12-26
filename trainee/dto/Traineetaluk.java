package com.xworkz.trainee.dto;

public class Traineetaluk {
	
		private String name;
		private Traineestate state;
		
		public String getName() {
			return name;
		}

	  public void setName(String name) {
			this.name = name;
		}

	  public Traineestate getState() {
			return state;
		}

	  public void setState(Traineestate state) {
			this.state = state;
		}

	    public String toString() {
			return "TalukDTO [name=" + name + ", state=" + state + "]";
		}
		
		
		
	}

