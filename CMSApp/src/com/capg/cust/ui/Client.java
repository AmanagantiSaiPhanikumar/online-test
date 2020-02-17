package com.capg.cust.ui;

import java.sql.Date;
import java.util.Scanner;

import com.capg.cust.bean.Cust;
import com.capg.cust.service.CustomerServiceImp;
import com.capg.cust.service.ICustomerService;

public class Client {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ICustomerService service = new CustomerServiceImp();
		while (true) {
			System.out.println("welcome to customer");

			System.out.println("menu");
			System.out.println("1.add");
			System.out.println("2.delete");
			System.out.println("3.update");
			System.out.println("4.select");
			System.out.println("5.selectall");
			System.out.println("6.exit");
			int Choice = scan.nextInt();
			switch (Choice) {
			case 1:

				Cust custbean = new Cust();
				
				int id = scan.nextInt();
			
				String name = scan.next();
				double Amount = scan.nextDouble();
				// Date DOP=Date.valueOf(scan.nextLine());
				
							custbean.setId(id);
							custbean.setName(name);
							custbean.setAmount(Amount);
						
							
				boolean isValid=	CustomerServiceImp.userValidations(custbean);
						if(isValid)	
						{
							service.addcustomer(custbean);
							System.out.println("valid");
						}
						else
						{
							System.out.println("invalid");
						}
				break;
			case 2:

				break;
			case 3:

				break;

			case 4:

				break;
			case 5:

				break;
			case 6:

				System.out.println("thank you");

				break;

			default:
				System.err.println("get out");

				break;
			}

		}

	}

}
