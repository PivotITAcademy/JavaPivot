package assignment2Operators;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1, y=10, z=100;
	//	int x = 001, y=010, z=100;
        

        int i = --x + y++  - z--  - --z  + ++y- --x + y-- - --x;
        		//  ;
      // --x 
      /*  x =1-1 =0
        		i=0
        _______________
        	 i = i+y++
        	  i = 0 +10 = 10;
        	  x=0, y = 11, z= 100	
        	  __________
        	  i= 10
        	  i  = i -z--
        	  i =10 -100 = -90
        	  x=0, y =11, z=99
        	  
        	  ------------------
        	  i = i - --z
        	  i = -90  - 98 = -188
        	  x=0, y =11, z=98
        	  
        	  -------------------
        	  y = y +1 = 11+1 = 12
        	   i = -188 +12 = -176
        	  x=0, z=98
        	  
        	  ___--------------
        	   x = x-1 = 0-1 =-1
        	   i = -176 - (-1) = -176 +1 = -175
        	   x=-1, y = 12, z =98
        	  
        	  -----------------------
        	  
        	  
        		*/
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("i="+i);
	}

}
