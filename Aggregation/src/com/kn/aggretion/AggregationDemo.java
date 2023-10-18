package com.kn.aggretion;

public class AggregationDemo {

	public static void main(String[] args) {
            Pilot pilot =new Pilot("flying  Beast");
            Airline airline = new Airline("Emirates", pilot);
//            
            airline.operation();
            
            //shutdown emirates
            
            airline = null;
          
            System.out.println("....Airline has been shutdown");
             pilot.fly();
	}

}
