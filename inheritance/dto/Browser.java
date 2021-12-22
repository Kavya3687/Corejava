package com.xworkz.inheritance.dto;

public class Browser {
	
		public String title = "newTag";

		public Browser() {
			System.out.println("calling Browser()");
		}
		public Browser(float version) {
			this("mozilla firefox");
			System.out.println(version);
		}
		public Browser(String  name) {
			System.out.println(name);
		}
	public String search(String search) {
		return "data of " +search;
	}

	public boolean download(String app) {
		System.out.println("downloading application:" +app);
		return true;
	}
	}


