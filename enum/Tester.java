package com.xworkz.enums;
import com.xworkz.enums.dto.DonerDTO;
import com.xworkz.enums.dto.ContactDetails;
import com.xworkz.enums.dto.BloodGroup;
import com.xworkz.enums.dto.Gender;
import com.xworkz.enums.dao.DonerOperation;

public class Tester {
		public static void main(String[] args) {
			
			
			DonerDTO dto = new DonerDTO();
			dto.setName("Kavya");
			dto.setAge((byte)22);
			dto.setWeight(45.5f);
			dto.setBloodGroup(BloodGroup.O_POSITIVE);
			dto.setGender(Gender.FEMALE);
			
			DonerDTO dto1 = new DonerDTO();
			dto1.setName("Roopa");
			dto1.setAge((byte)21);
			dto1.setWeight(30.5f);
			dto1.setBloodGroup(BloodGroup.A_POSITIVE);
			dto1.setGender(Gender.FEMALE);
			
			DonerDTO dto2 = new DonerDTO();
			dto2.setName("Bhagya");
			dto2.setAge((byte)23);
			dto2.setWeight(58.5f);
			dto2.setBloodGroup(BloodGroup.AB_POSITIVE);
			dto2.setGender(Gender.FEMALE);
			
			DonerDTO dto3 = new DonerDTO();
			dto3.setName("Nuthan");
			dto3.setAge((byte)21);
			dto3.setWeight(53.5f);
			dto3.setBloodGroup(BloodGroup.A_POSITIVE);
			dto3.setGender(Gender.MALE);
			
			
			ContactDetails details = new ContactDetails();
			details.setContactNumber(8550071423l);
			details.setEmail("kavya.xworkz@gmail.com");
			details.setAdress("Gulbarga");
			
			ContactDetails details1 = new ContactDetails();
			details1.setContactNumber(9845632140l);
			details1.setEmail("roopa.xworkz@gmail.com");
			details1.setAdress("hassan");
			
			ContactDetails details2 = new ContactDetails();
			details2.setContactNumber(9148407768l);
			details2.setEmail("bhagya.xworkz@gmail.com");
			details2.setAdress("vijaypur");
			
			ContactDetails details3 = new ContactDetails();
			details2.setContactNumber(9148407768l);
			details2.setEmail("nuthan.xworkz@gmail.com");
			details2.setAdress("banglore");
			
			
			dto.setDetails(details);
			dto1.setDetails(details1);
			dto2.setDetails(details2);
			dto3.setDetails(details3);
			
			
			DonerOperation operation = new DonerOperation();
			operation.save(dto);
			operation.save(dto1);
			operation.save(dto2);
			operation.save(dto3);
			operation.printAll();
			System.out.println();
			System.out.println("get by bloodgroup");
			DonerDTO res=operation.getByBloodGroup(BloodGroup.A_POSITIVE);
			System.out.println(res.toString());
			System.out.println();
			System.out.println("get by gender");
			DonerDTO get = operation.getByGender(Gender.MALE);
			System.out.println(get.toString());
			System.out.println();
			System.out.println("updated contact number by name");
			DonerDTO update = operation.updateContactByName("Kavya",962362282676l);
			System.out.println(update.toString());
			System.out.println();
			operation.printAll();
			System.out.println();
			System.out.println("get all male array");
			DonerDTO[] all = operation.getByAllGender(Gender.MALE);
			for(int index=0;index<all.length;index++) {
				System.out.println(all[index]);
				System.out.println();
				System.out.println("get similar bloodgroup by array");
				DonerDTO[] response =operation.getByAllBloodGroup(BloodGroup.A_POSITIVE);
				for(int i = 0; i < response.length; i++) {
					System.out.println(response[i]);
					System.out.println();
					
				}
				
			}
			
		}
}
