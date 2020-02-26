package com.logger.task;

import java.util.Scanner;
import java.util.logging.Logger;

class Building{
	public static void displayoptions() {
		Logger logger = Logger.getLogger(Building.class.getName());
		logger.info("The option for buildings associated with building is:");
		logger.info("1->1200 INR for using standard materials.");
		logger.info("2->1500 INR for using above standard materials.");
		logger.info("3->1800 INR for using high standard materials.");
		logger.info("4->2500 INR for using high standard materials with full automation");
		logger.info("Enter choice:(1/2/3/4)");	
	}
	public static void standard(float AreaofHouse){
		float price=1200*AreaofHouse;
		Logger logger = Logger.getLogger(Building.class.getName());
		logger.info("Price is"+price);
	}
	public static void abovestandard(float AreaofHouse){
		float price=1200*AreaofHouse;
		Logger logger = Logger.getLogger(Building.class.getName());
		logger.info("Price is"+price);
	}
	public static void highstandard(float AreaofHouse){
		float price=1200*AreaofHouse;
		Logger logger = Logger.getLogger(Building.class.getName());
		logger.info("Price is"+price);
	}
	public static void automatedbuilding(float AreaofHouse){
		float price=1200*AreaofHouse;
		Logger logger = Logger.getLogger(Building.class.getName());
		logger.info("Price is"+price);
	}
}
public class House {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Logger logger = Logger.getLogger(Building.class.getName());
	logger.info("Enter area of house:");
	float AreaofHouse = sc.nextFloat();
	Building.displayoptions();
	int choice = sc.nextInt();
	if(choice==1) {
		Building.standard(AreaofHouse);
	    }
	else if(choice==2){
		Building.abovestandard(AreaofHouse);
	    }
	else if(choice==3){
		Building.highstandard(AreaofHouse);
	    }
	else if(choice==4){
		Building.automatedbuilding(AreaofHouse);
        }
	}
}
