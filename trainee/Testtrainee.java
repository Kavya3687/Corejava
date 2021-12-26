package com.xworkz.trainee;
import com.xworkz.trainee.dao.Traineeoperations;
import com.xworkz.trainee.dto.Traineeaddress;
import com.xworkz.trainee.dto.Traineearea;
import com.xworkz.trainee.dto.Traineedistrict;
import com.xworkz.trainee.dto.Traineestate;
import com.xworkz.trainee.dto.Traineetaluk;
import com.xworkz.trainee.dto.Traineedetails;
public class Testtrainee {
	
		public static void main(String[] args) {
			
			Traineedetails traineedetail = new Traineedetails();
			Traineedetails traineedetail1 = new Traineedetails();
			Traineedetails traineedetail2 = new Traineedetails();
			traineedetail.setName("Kavya");
			traineedetail.setContactno(897032681);
			traineedetail.setEmail("kavyavishwakarma@gmail.com");
			
			traineedetail1.setName("bhagya");
			traineedetail1.setContactno(994535363);
			traineedetail1.setEmail("bhagyaraj456@gmail.com");
			
			traineedetail2.setName("sameeksha");
			traineedetail2.setContactno(1237555555l);
			traineedetail2.setEmail("sameeksha123@gmail.com");
			
			Traineeaddress adress = new Traineeaddress();
			Traineeaddress adress1 = new Traineeaddress();
			Traineeaddress adress2 = new Traineeaddress();
			adress.setBuildingName("Gulbarga");
			adress1.setBuildingName("Gulbarga");
			adress2.setBuildingName("Chikmagalore");
			
			traineedetail.setAdress(adress);
			traineedetail1.setAdress(adress1);
			traineedetail2.setAdress(adress2);
			
			Traineearea area = new Traineearea();
			Traineearea area1 = new Traineearea();
			Traineearea area2 = new Traineearea();
			area.setAreaName("prakashnagar");
			area1.setAreaName("Rajajinagar");
			area2.setAreaName("vijaynagar");
			
			adress.setArea(area);
			adress1.setArea(area1);
			adress2.setArea(area2);
			
			Traineedistrict district = new Traineedistrict();
			Traineedistrict district1 = new Traineedistrict();
			Traineedistrict district2 = new Traineedistrict();
			district.setName("Gulbarga");
			district1.setName("Gulbarga");
			district2.setName("Chikmagalore");
			
			area.setDistrict(district);
			area1.setDistrict(district1);
			area2.setDistrict(district2);

			
			Traineetaluk taluk =new Traineetaluk();
			Traineetaluk taluk1 =new Traineetaluk();
			Traineetaluk taluk2 =new Traineetaluk();
			taluk.setName("Jewargi");
			taluk1.setName("Jewargi");
			taluk2.setName("mudigere");

			
			district.setTaluk(taluk);
			district1.setTaluk(taluk1);
			district2.setTaluk(taluk2);

			
			Traineestate state =new Traineestate();
			Traineestate state1 =new Traineestate();
			Traineestate state2 =new Traineestate();
			state.setName("Karnataka");
			state.setCountry("India");
			
			state1.setName("Karnataka");
			state1.setCountry("India");
			
			state2.setName("Karnataka");
			state2.setCountry("India");
			
			taluk.setState(state);
			taluk1.setState(state1);
			taluk2.setState(state2);


			Traineeoperations operation = new Traineeoperations();
			operation.save(traineedetail);
			operation.save(traineedetail1);
			operation.save(traineedetail2);
			operation.printAll();
			System.out.println();
			Traineedetails res=operation.updateCountryByName("sameeksha","Anagha");
			System.out.println(res.toString());
			System.out.println();
			operation.printAll();
		   System.out.println();
		   Traineedetails response =operation.getByCountry("India");
		   System.out.println(res.toString());
		   System.out.println();
		   Traineedetails response1 =operation.getByDistrict("Gulbarga");
		   System.out.println(response1.toString());
		   System.out.println();
		  
		}

	}


