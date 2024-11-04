package zomato;

import java.util.*;
public class zomato {
	static int password = 1234;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t...Welcome to Zomato...\n\t\t\t Please Login Your Credentials");
		System.out.print("Enter your username : ");
		String username = sc.nextLine();
		System.out.print("Enter your password : ");
		int passcode = sc.nextInt();
		if(password == passcode) {
			System.out.println("\t\t\t...Successfully Login...\n\n\t\t\tSelect your Hotel\n\n\t\t\t1.Buhari\n\t\t\t2.SS Hydrabad Biriyani\n\t\t\t3.A2B\n\t\t\t4.Amma Canteen");
			System.out.print("Enter the Hotel : ");

			int hotel = sc.nextInt();
			switch(hotel) {
			case 1 :{
					System.out.println("...Welcome to Buhari...");
					System.out.println("\t\t\t1.Mutton Biriyani\n\t\t\t2.Chicken Biriyani\n\t\t\t3.Prawn Biriyani\n\t\t\t4.Chicken 65");
					System.out.print("Enter the Dish : ");
					int dish = sc.nextInt();
					int bill = 0;
					
					switch(dish) {
					case 1:{
						System.out.println("\t\t\t...You Selected Mutton Biriyani...");
						System.out.print("Enter the Quantity : ");
						int qty = sc.nextInt();
						bill = qty * 300;		// quantity * price
						System.out.println("\t\t\tYour Bill Amount is : "+bill);
						break;
						}
						
					case 2:{
						System.out.println("\t\t\t...You Selected Chicken Biriyani...");
						System.out.print("Enter the Quantity : ");
						int qty = sc.nextInt();
						bill = qty * 200;		
						System.out.println("\t\t\tYour Bill Amount is : "+bill);
						break;
						}
							
					case 3:{
						System.out.println("\t\t\t...You Selected Prawn Biriyani...");
						System.out.print("Enter the Quantity : ");
						int qty = sc.nextInt();
						bill = qty * 250;		
						System.out.println("\t\t\tYour Bill Amount is : "+bill);
						break;
						}
						
					case 4:{
						System.out.println("\t\t\t...You Selected Chicken 65...");
						System.out.print("Enter the Quantity : ");
						int qty = sc.nextInt();
						bill = qty * 150;		
						System.out.println("\t\t\tYour Bill Amount is : "+bill);
						break;
						}
						
					default :
						System.out.println("\t\t\t...Invalid Input...");
					}
					
					System.out.println("\n\t\t\t...Select Your Payment Method...");
					System.out.println("\t\t\t1.G-Pay\n\t\t\t2.Phone-pe");
					System.out.print("Enter the Payment Gateway : ");
		
					int payment = sc.nextInt();
					switch(payment) {
					case 1:{
						System.out.println("\t\t\t...You Selected the G-Pay Payment Gateway...");
						System.out.print("Enter the Bill Amount : ");
						int userAmount = sc.nextInt();
						if(bill == userAmount) {
							int otp = (int)(Math.random()*1234+1234);
							System.out.println("Your OTP is : "+otp);
							System.out.print("Enter your OTP : ");
							int userOtp = sc.nextInt();
							
							if(userOtp == otp) 
								System.out.println("\t\t\t...Hurray! Your Order was Confirmed...\n\t\t\t...Order will be Delivery in 30 Minutes...");
							
							else
								System.out.println("\t\t\t...OTP doesn't Match...");					
							}
							
						else
							System.out.println("\t\t\t...Wrong Payment ! Order Cancelled...");
						
						break;
						}
					
					
					case 2:{
						System.out.println("\t\t\t...You Selected the Phone-pe Payment Gateway...");
						System.out.print("Enter the Bill Amount : ");
						int userAmount = sc.nextInt();
						if(bill == userAmount) {
							int otp = (int)(Math.random()*1234+1234);
							System.out.println("Your OTP is : "+otp);
							System.out.print("Enter your OTP : ");
							int userOtp = sc.nextInt();
								
							if(userOtp == otp) 
								System.out.println("\t\t\t...Hurray! Your Order was Confirmed...\n\t\t\t...Order will be Delivery in 30 Minutes...");
							else
								System.out.println("\t\t\t...OTP doesn't Match...");
								}
						else
								System.out.println("\t\t\t...Wrong Payment ! Order Cancelled...");
						break;
						}
					
					default:
						System.out.println("\t\t\t...Invalid Input...");
					}
				}
	//-----------------------------------------------------------------------------------------------------------		
			case 2:{
				System.out.println("...Welcome to SS Hydrabad Biriyani...");
				System.out.println("\t\t\t1.Chicken Biriyani\n\t\t\t2.Mutton Biriyani\n\t\t\t3.Fish Biriyani\n\t\t\t4.Prawn Biriyani\n\t\t\t5.Crab Biriyani");
				System.out.print("Enter the Dish : ");
				int dish = sc.nextInt();
				int bill = 0;
				
				switch(dish) {
				case 1:{
					System.out.println("\t\t\t...You Selected Chicken Biriyani...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 200;		// quantity * price
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
					
				case 2:{
					System.out.println("\t\t\t...You Selected Mutton Biriyani...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 300;		
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
						
				case 3:{
					System.out.println("\t\t\t...You Selected Fish Biriyani...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 250;		
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
					
				case 4:{
					System.out.println("\t\t\t...You Selected Prawn Biriyani...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 250;		
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
				
				case 5:{
					System.out.println("\t\t\t...You Selected Crab Biriyani...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 250;		
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
					
				default :
					System.out.println("\t\t\t...Invalid Input...");
				}
				
				System.out.println("\n\t\t\t...Select Your Payment Method...");
				System.out.println("\t\t\t1.G-Pay\n\t\t\t2.Phone-pe");
				System.out.print("Enter the Payment Gateway : ");

				int payment = sc.nextInt();
				switch(payment) {
				case 1:{
					System.out.println("\t\t\t...You Selected the G-Pay Payment Gateway...");
					System.out.print("Enter the Bill Amount : ");
					int userAmount = sc.nextInt();
					if(bill == userAmount) {
						int otp = (int)(Math.random()*1234+1234);
						System.out.println("Your OTP is : "+otp);
						System.out.print("Enter your OTP : ");
						int userOtp = sc.nextInt();
						
						if(userOtp == otp) 
							System.out.println("\t\t\t...Hurray! Your Order was Confirmed...\n\t\t\t...Order will be Delivery in 30 Minutes...");
						
						else
							System.out.println("\t\t\t...OTP doesn't Match...");					
						}
						
					else
						System.out.println("\t\t\t...Wrong Payment ! Order Cancelled...");
					
					break;
					}
				
				
				case 2:{
					System.out.println("\t\t\t...You Selected the Phone-pe Payment Gateway...");
					System.out.print("Enter the Bill Amount : ");
					int userAmount = sc.nextInt();
					if(bill == userAmount) {
						int otp = (int)(Math.random()*1234+1234);
						System.out.println("Your OTP is : "+otp);
						System.out.print("Enter your OTP : ");
						int userOtp = sc.nextInt();
							
						if(userOtp == otp) 
							System.out.println("\t\t\t...Hurray! Your Order was Confirmed...\n\t\t\t...Order will be Delivery in 30 Minutes...");
						else
							System.out.println("\t\t\t...OTP doesn't Match...");
							}
					else
							System.out.println("\t\t\t...Wrong Payment ! Order Cancelled...");
					break;
					}
				
				default:
					System.out.println("\t\t\t...Invalid Input...");
				}
				break;
			}
			
	//-----------------------------------------------------------------------------------------------------------
			case 3:{
				System.out.println("...Welcome to A2B...");
				System.out.println("\t\t\t1.South Indian Meals\n\t\t\t2.Vegetable dum Biriyani\n\t\t\t3.Spl South Indian Thali\n\t\t\t4.Spl North Indian Thali");
				System.out.print("Enter the Dish : ");
				int dish = sc.nextInt();
				int bill = 0;
				
				switch(dish) {
				case 1:{
					System.out.println("\t\t\t...You Selected South Indian Meals...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 150;		// quantity * price
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
					
				case 2:{
					System.out.println("\t\t\t...You Selected Vegetable dum Biriyani...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 120;		
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
						
				case 3:{
					System.out.println("\t\t\t...You Selected Spl South Indian Thali...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 250;		
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
					
				case 4:{
					System.out.println("\t\t\t...You Selected Spl North Indian Thali...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 250;		
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
					
				default :
					System.out.println("\t\t\t...Invalid Input...");
				}
				
				System.out.println("\n\t\t\t...Select Your Payment Method...");
				System.out.println("\t\t\t1.G-Pay\n\t\t\t2.Phone-pe");
				System.out.print("Enter the Payment Gateway : ");

				int payment = sc.nextInt();
				switch(payment) {
				case 1:{
					System.out.println("\t\t\t...You Selected the G-Pay Payment Gateway...");
					System.out.print("Enter the Bill Amount : ");
					int userAmount = sc.nextInt();
					if(bill == userAmount) {
						int otp = (int)(Math.random()*1234+1234);
						System.out.println("Your OTP is : "+otp);
						System.out.print("Enter your OTP : ");
						int userOtp = sc.nextInt();
						
						if(userOtp == otp) 
							System.out.println("\t\t\t...Hurray! Your Order was Confirmed...\n\t\t\t...Order will be Delivery in 30 Minutes...");
						
						else
							System.out.println("\t\t\t...OTP doesn't Match...");					
						}
						
					else
						System.out.println("\t\t\t...Wrong Payment ! Order Cancelled...");
					
					break;
					}
				
				
				case 2:{
					System.out.println("\t\t\t...You Selected the Phone-pe Payment Gateway...");
					System.out.print("Enter the Bill Amount : ");
					int userAmount = sc.nextInt();
					if(bill == userAmount) {
						int otp = (int)(Math.random()*1234+1234);
						System.out.println("Your OTP is : "+otp);
						System.out.print("Enter your OTP : ");
						int userOtp = sc.nextInt();
							
						if(userOtp == otp) 
							System.out.println("\t\t\t...Hurray! Your Order was Confirmed...\n\t\t\t...Order will be Delivery in 30 Minutes...");
						else
							System.out.println("\t\t\t...OTP doesn't Match...");
							}
					else
							System.out.println("\t\t\t...Wrong Payment ! Order Cancelled...");
					break;
					}
				
				default:
					System.out.println("\t\t\t...Invalid Input...");
				}
				break;
			}
			
	//-----------------------------------------------------------------------------------------------------------
			case 4:{
				System.out.println("...Welcome to Amma Canteen...");
				System.out.println("\t\t\t1.Sambar Rice\n\t\t\t2.Tomato Rice\n\t\t\t3.Lemon Rice\n\t\t\t4.Curd Rice");
				System.out.print("Enter the Dish : ");
				int dish = sc.nextInt();
				int bill = 0;
				
				switch(dish) {
				case 1:{
					System.out.println("\t\t\t...You Selected Sambar Rice...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 50;		// quantity * price
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
					
				case 2:{
					System.out.println("\t\t\t...You Selected Tomato Rice...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 40;		
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
						
				case 3:{
					System.out.println("\t\t\t...You Selected Lemon Rice...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 40;		
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
					
				case 4:{
					System.out.println("\t\t\t...You Selected Curd Rice...");
					System.out.print("Enter the Quantity : ");
					int qty = sc.nextInt();
					bill = qty * 30;		
					System.out.println("\t\t\tYour Bill Amount is : "+bill);
					break;
					}
					
				default :
					System.out.println("\t\t\t...Invalid Input...");
				}
				
				System.out.println("\n\t\t\t...Select Your Payment Method...");
				System.out.println("\t\t\t1.G-Pay\n\t\t\t2.Phone-pe");
				System.out.print("Enter the Payment Gateway : ");

				int payment = sc.nextInt();
				switch(payment) {
				case 1:{
					System.out.println("\t\t\t...You Selected the G-Pay Payment Gateway...");
					System.out.print("Enter the Bill Amount : ");
					int userAmount = sc.nextInt();
					if(bill == userAmount) {
						int otp = (int)(Math.random()*1234+1234);
						System.out.println("Your OTP is : "+otp);
						System.out.print("Enter your OTP : ");
						int userOtp = sc.nextInt();
						
						if(userOtp == otp) 
							System.out.println("\t\t\t...Hurray! Your Order was Confirmed...\n\t\t\t...Order will be Delivery in 30 Minutes...");
						
						else
							System.out.println("\t\t\t...OTP doesn't Match...");					
						}
						
					else
						System.out.println("\t\t\t...Wrong Payment ! Order Cancelled...");
					
					break;
					}
				
				
				case 2:{
					System.out.println("\t\t\t...You Selected the Phone-pe Payment Gateway...");
					System.out.print("Enter the Bill Amount : ");
					int userAmount = sc.nextInt();
					if(bill == userAmount) {
						int otp = (int)(Math.random()*1234+1234);
						System.out.println("Your OTP is : "+otp);
						System.out.print("Enter your OTP : ");
						int userOtp = sc.nextInt();
							
						if(userOtp == otp) 
							System.out.println("\t\t\t...Hurray! Your Order was Confirmed...\n\t\t\t...Order will be Delivery in 30 Minutes...");
						else
							System.out.println("\t\t\t...OTP doesn't Match...");
							}
					else
							System.out.println("\t\t\t...Wrong Payment ! Order Cancelled...");
					break;
					}
				
				default:
					System.out.println("\t\t\t...Invalid Input...");
				}
			}
			
			
	//---------------------------------------------------------------------------------------------------------
			default:
				System.out.println("Invalid Input");
			
			
			}
		}
		
		else
			System.out.println("\t\t\t...Login Credentials was Wrong. Please try Again...");


		
		
	}

}
