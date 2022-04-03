package powerRegulator;
import java.util.Scanner;
public class PowerManagement {

	public static void main(String[] args) {
		int deviceA;
		int deviceB;
		int deviceC;		
		Scanner input = new Scanner(System.in);
		// Prompting for the device consumption in watts per min and taking care of consumption less than 0
		System.out.println("enter device A consumption in watts per min");
		deviceA = input.nextInt();
		while(deviceA <0) {
			System.out.println("Invalid entry try again!!");
			System.out.println("enter device A consumption in watts per min");
			deviceA = input.nextInt();
		}
		System.out.println("enter device B consumption in watts per min");
		deviceB = input.nextInt();
		while(deviceB <0) {
			System.out.println("Invalid entry try again!!");
			System.out.println("enter device B consumption in watts per min");
			deviceB = input.nextInt();
		}
		System.out.println("enter device C consumption in watts per min");
		deviceC = input.nextInt();
		while(deviceC <0) {
			System.out.println("Invalid entry try again!!");
			System.out.println("enter device C consumption in watts per min");
			deviceC = input.nextInt();
		}
		//  the time will be taken before the device is switched off for each device
	     float timeA,timeB,timeC;
		timeA = (float) ((double) (1200/deviceA)/60);
		timeB = (float) ((double)(1200/deviceB)/60);
		timeC = (float) ((double)(1200/deviceC)/60);
		System.out.printf("Device A takes %.2f hour(s)\n",timeA);
		System.out.printf("Device B takes %.2f hour(s)\n",timeB);
		System.out.printf("Device C takes %.2f hour(s)\n",timeC);
		// time that should be taken before all the devices is switched off
		
		
		int wattSum = deviceA + deviceB + deviceC;
		int timeTaken =0;
		int i =1;
        while(wattSum<1200) {
        	
        	i++;
        	wattSum += deviceA + deviceB + deviceC;
        	
        	 timeTaken = i-1;
        }
        
        System.out.println(timeTaken+" minute(s) taken before the devices are switched off");
		
		//charges for the first 30 minutes
        int cost10 = 0,cost5 =0;
         if(timeTaken>30) {
              cost10 = (timeTaken/60) *10;
         }
		 cost5 = (((timeTaken -30)/60)) *5;
		int totalCost = cost10 + cost5;
		System.out.println("total pay per device "+totalCost+"");
		System.out.println("the total pay for all devices is "+(totalCost *3)+"");
		
		
		
		
		
		
		

	}

}
