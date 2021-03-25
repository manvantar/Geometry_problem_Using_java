package Day5;

import java.util.*;
public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x1=1,y1=3,x2=2,y2=4;
		float p1=1,q1=3,p2=2,q2=4;
		
		float length1=(float) Math.sqrt(Math.pow((x1-x2),2)+ Math.pow((y2-y1),2)); 
		
		float length2=(float) Math.sqrt(Math.pow((p1-p2),2)+ Math.pow((q2-q1),2)); 
		
		String l1=""+length1;
		System.out.println(length1 +" "+length2 );
		String l2=""+length2;
		
		if(length1==length2) {
		System.out.println("Both are equal");				
			
		}
		else {
			System.out.println("Both are not equal");	
			
		}
		System.out.println(l1.compareTo(l2));
		
		
		
	}

}
