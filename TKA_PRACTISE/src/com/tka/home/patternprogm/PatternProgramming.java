package com.tka.home.patternprogm;

public class PatternProgramming {
public static void main(String[] args) {

	for(int j=1;j<=5;++j) {

		for(int i=1;i<=5;++i) {
			System.out.print("*");}
		System.out.println();
	}

	System.out.println("==========================");
	//============================================================	
	System.out.println("1st PATTERN");
	for(int j=1; j<=5;++j) {

		for(int i=1; i<=5;++i) {
			if( j==1 || i==5) {
				System.out.print("#");}

			else
				System.out.print("*");
		}
		System.out.println("");
	}
	System.out.println("==========================");
	//====================================================================	
	System.out.println("2nd PATTERN");
	for(int j=1;j<=5;++j) {
		for(int i=1;i<=5;++i) {
			if(j<=2 || i==5)	
				System.out.print("#");
			else 
				System.out.print("*");
		}
		System.out.println();	
	}
	System.out.println("==========================");
//=======================================================================
	System.out.println("3rd PATTERN");
	for (int a=1 ;a<=5; ++a){

	for (int b=1;b<=5; ++b) {
		if (a<=3)
			System.out.print("#");
		else
			System.out.print("*");
	}		  
  System.out.println();
	}  	
	System.out.println("==========================");
//=======================================================================
	 
	
	System.out.println("4TH PATTERN");
	
	
	
	
	
	
	for(int j=1;j<=5;++j){
		   for(int i=1;i<=5    ;++i) {
			  
				   if( j>1 && j<5 &&i<4)
			 
				   System.out.print("#");
			   else
				   System.out.print("*");
		   }
		   System.out.println();
		   } 
	   System.out.println("==========================");
//=======================================================================	   
	   System.out.println("5th PATTERN");   	
	 
		for(int j=1; j<=5;++j) {

			for(int i=1; i<=5;++i) {
				if( j<=3 || i>=3) {
					System.out.print("#");}

				else
					System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("==========================");
//====================================================================	
System.out.println("6th PATTERN") ; 	
		for(int i=1;i<=2;++i) {
			for (int j=1;j<=2;++j) {
				System.out.print("*");
		}   
			System.out.println();
			}
		
		for(int i=1;i<=3;++i) {
			for (int j=1;j<=3;++j) {
				System.out.print("*");
		}   
			System.out.println();
			}	
		for(int i=1;i<=4;++i) {
			for (int j=1;j<=4;++j) {
				System.out.print("*");
		}   
			System.out.println();
			}		    	
		    	
		System.out.println("==========================");
	//=================================================

	        for(int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				if(i>j && i !=2) {
				for(int p=1; p<=i-1;p++) {
					System.out.print("*");
					
				}
				System.out.println();
				}
		}   
			
			}

	System.out.println("==========================");

	//=================================================
		System.out.println("7th PATTERN") ;
 
		for (int i=1; i<=5;++i) {
		  for (int j=1; j<=5;++j){
			 System.out.print(j);
		  }
System.out.println();
	  }
	System.out.println("==========================");

//====================================================================	
	System.out.println("8th PATTERN") ;
 
	for (int i=1; i<=5;++i) {
		  for (int j=1; j<=5;++j){
			 System.out.print(i);
		  }
System.out.println();
	  }
	System.out.println("==========================");
//====================================================================	

	for(int i=1; i<=2;i++) {
	for(int j=1;j<=4; j++)
		if(j<=1 )
		System.out.println("11");
	
		else if(j<=2)
		System.out.println("12");
	
		else if(j<=3)
		System.out.println("13");
	
		else if(j<=4)
		System.out.println("14");
	
	}
	
		System.out.println();
		
/*		
	11 11 
	12 12 12
	13 13 13 13
	14 14 14 14 14 
	
	
	 *
	 */
	
	
	
	
	
	
}

}
