package com.company;

public class Main {

    public static void main(String[] args) {
	    Account user = new Account();

	    user.setAccountNumber(11111);
	    user.setBalance(10000.0);
	    user.setName("Pham Quang Huy");
	    user.setEmail("p.q.huy97@gmail.com");
	    user.setPhoneNumber("00000");

//        System.out.println("Balance: " + user.getBalance());

        user.withdrawFunds(9000);

    }
}
