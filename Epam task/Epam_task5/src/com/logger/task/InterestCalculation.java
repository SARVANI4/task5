package com.logger.task;

import java.util.Scanner;
import java.util.logging.Logger;


public class InterestCalculation {
     public static void main(String args[]){
    	 Logger logger = Logger.getLogger(InterestCalculation.class.getName());
    	    logger.info("Enter Simple intrest(1) or Coumpound intrest(2):");
    	   	 Scanner sc = new Scanner(System.in);
    	   	 int choice = sc.nextInt();
    	   	 int principal, rate, time;
    	   	logger.info("Enter principal, time and rate:");
    	   	 principal=sc.nextInt();
    	   	 time=sc.nextInt();
    	   	 rate=sc.nextInt();
    	   	Interest k= new Interest();
    		k.cho(choice, principal, rate, time);
    	}
}

class Interest {
	Logger logger = Logger.getLogger(Interest.class.getName());
     double si(int principal, int time, int rate){
	   	 double intrest;
	   	 intrest = principal * time * rate;
	   	 intrest = intrest / 100;
	   	 return intrest;
	    }
	    double ci(int principal,int time,int rate){ 
	   	 double intrest;
	   	 double k;
	   	 k = rate / 100 ;
	   	 k = k + 1;
	   	 k = Math.pow(k, time);
	   	 intrest = principal * k;
	   	 intrest = intrest - principal;
	   	 return intrest;
	    }
	    void cho(int choice, int principal,int rate, int time){
	    //int principal, rate, time;
	   	 if(choice==1){
	   		 logger.info("hello");
	   		 double k = si(principal,time,rate);
	   		 logger.info("Amount="+(k+principal));
	   		logger.info("Intrest="+k);
	   	 }
	   	 else {
	   		 double k = ci(principal,time,rate);
	   		logger.info("Intrest="+(k-principal));
	   		logger.info("Amount="+k);
	   	 
	   	 }
	    }
	}