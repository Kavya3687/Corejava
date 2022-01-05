package com.xworkz.digitalwallet.dto;

import java.util.Objects;

public class WalletDTO {
	
	private String name;
	private byte noOfTransaction;
	private int maxTransaction;
	private float availableBalance;
	private String rewards;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setNoOfTransaction(byte noOfTransaction) {
		this.noOfTransaction = noOfTransaction;
	}
	public byte getNoOfTransaction() {
		return noOfTransaction;
	}
    public void setMaxTransaction(int maxTransaction) {
		this.maxTransaction = maxTransaction;
	}
    public int getMaxTransaction() {
		return maxTransaction;
	}
    public void setAvailableBalance(float availableBalance) {
		this.availableBalance = availableBalance;
	}
    public float getAvailableBalance() {
		return availableBalance;
	}
    public void setRewards(String rewards) {
		this.rewards = rewards;
	}
    public String getRewards() {
		return rewards;
	}
    
    @Override
    public String toString() {
    	return super.getClass().getSimpleName() +"walletName :"+name +"\t noOfTransaction :"+noOfTransaction +
    			"\t maxTransaction :"+maxTransaction +"\t availableBalance :"+availableBalance +
    			"\t rewards :"+rewards;
    }
    @Override
    public int hashCode() {
    	
    	return Objects.hash(name ,noOfTransaction,maxTransaction,availableBalance,rewards);
    }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof WalletDTO)) {
			return false;
		}
		WalletDTO wallet = (WalletDTO) obj;
		return Float.floatToIntBits(availableBalance) == Float.floatToIntBits(wallet.availableBalance)
				&& maxTransaction == wallet.maxTransaction && Objects.equals(name, wallet.name)
				&& noOfTransaction == wallet.noOfTransaction && Objects.equals(rewards, wallet.rewards);
	}
   
    	
    }

