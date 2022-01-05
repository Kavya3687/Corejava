package com.xworkz.digitalwallet;

import com.xworkz.digitalwallet.dao.WalletDAOIMP;
import com.xworkz.digitalwallet.dto.WalletDTO;

public class Tester {

	public static void main(String[] args) {
		
		WalletDTO wallet = new WalletDTO();
		WalletDTO wallet1 = new WalletDTO();
		WalletDTO wallet2 = new WalletDTO();

		wallet.setName("phonePE");
		wallet.setNoOfTransaction((byte)20);
		wallet.setMaxTransaction(40000);
		wallet.setAvailableBalance(60000.5f);
		wallet.setRewards("zomato , meesho ");
		
		wallet1.setName("G-pay");
		wallet1.setNoOfTransaction((byte)25);
		wallet1.setMaxTransaction(70000);
		wallet1.setAvailableBalance(70200.5f);
		wallet1.setRewards("rummy_Vocher , flipCart ");
		
		wallet2.setName("payTM");
		wallet2.setNoOfTransaction((byte)12);
		wallet2.setMaxTransaction(35000);
		wallet2.setAvailableBalance(25200.5f);
		wallet2.setRewards("recharge , better luck Next Time ");
		
		
		WalletDAOIMP impliment = new WalletDAOIMP();
		impliment.createWallet(wallet);
		impliment.createWallet(wallet1);
		impliment.createWallet(wallet2);
		impliment.printAll();
		System.out.println();
		float res=impliment.getcurrentBalance("phonePE");
		System.out.println("current balance in phonePE wallet \t"+res);
		System.out.println();
		float response=impliment.addMoney(5000, "payTM");
		System.out.println("total balance after credit \t"+response);
		System.out.println();
		float res1=impliment.pay(5200.5f, "G-pay");
		System.out.println("total balance after debit \t"+res1);
		System.out.println();
		byte res2=impliment.getRemainingTransaction("phonePE");
		System.out.println("remaining transactions today \t"+res2 );
		System.out.println();
		byte res3 =impliment.getTotalTodaysTransaction();
		System.out.println("total today transactions \t"+res3);
		System.out.println();
		double res4=impliment.totalAmountTransaction();
		System.out.println("total amount transaction done today \t"+res4);
		
		
	}
}
