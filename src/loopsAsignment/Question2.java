package loopsAsignment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter max capacity of tank");
		double maxCapacity =sc.nextDouble();
		
		System.out.println("enter  capacity of bucket");
		
		double bucketCapacity =sc.nextDouble();
		
		System.out.println("enter  current volume of liquid of tank");
		double currentVolumeofLiquid=sc.nextDouble();
		
		while(currentVolumeofLiquid<maxCapacity) {
			
			if(currentVolumeofLiquid>(maxCapacity-bucketCapacity)) {
				System.out.println("Tank may overflow");
				break;
			}
			else{
				currentVolumeofLiquid+=bucketCapacity;
			
			}
		}
		
		System.out.println(currentVolumeofLiquid);
	}

}
