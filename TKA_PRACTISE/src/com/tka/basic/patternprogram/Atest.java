package com.tka.basic.patternprogram;
//pattern programing
public class Atest {
public static void main(String[]args) {
	//i----> ROW
	//J----> COLUMN

		for (int j=1;j<=5; ++j) {
		for (int i=1;i<=5;++i) {
			System.out.print("#");
		}
	System.out.println();
	}
System.out.println("==========================");
//=======================================================================



	/*for (int j=1;j<=5; ++j) {
		for (int i=1;i<=5;++i) {
			System.out.print("("+i+","+j+")");
		}
	System.out.println();
	}
//output
/*(1,1)(2,1)(3,1)(4,1)(5,1)
(1,2)(2,2)(3,2)(4,2)(5,2)
(1,3)(2,3)(3,3)(4,3)(5,3)
(1,4)(2,4)(3,4)(4,4)(5,4)
(1,5)(2,5)(3,5)(4,5)(5,5)
	 */
//=======================================================================

	/* for (int j=1;j<=5; ++j) {
		for (int i=1;i<=5;++i) {
			System.out.print("("+i+","+j+")");
		}
	System.out.println();
	}
	//output:-
	(1,1)(2,1)(3,1)(4,1)(5,1)
	(1,2)(2,2)(3,2)(4,2)(5,2)
	(1,3)(2,3)(3,3)(4,3)(5,3)
	(1,4)(2,4)(3,4)(4,4)(5,4)
	(1,5)(2,5)(3,5)(4,5)(5,5)
	 */
//=======================================================================

	/*
	for (int i=1;i<=5; ++i) {
		for (int j=1;j<=5;++j) {
		if (i==1 ||i==5) {
			System.out.print("#");
		}
		else
			System.out.print("*");
		}
	System.out.println();
	}

	OUTPUT:-
	#####
	 *****
	 *****
	 *****
#####
	 */
//=======================================================================

/*for (int i=1;i<=5; ++i) {
		for (int j=1;j<=5;++j) {
		if (j==1 ||j==5) {
			System.out.print("#");
		}
		else
			System.out.print("*");
		}
	System.out.println();
	}

output
#***#
#***#
#***#
#***#
#***#
	 */
//=======================================================================

	/*	for (int i=1;i<=5; ++i) {
		for (int j=1;j<=5;++j) {
		if (j==1 ||j==5 ||i==1 || i==5) {
			System.out.print("#");
		}
		else
			System.out.print("*");
		}
	System.out.println();
	}

output 
#####
#***#
#***#
#***#
#####
	 */
	
/*	
 //=======================================================================

	for (int i=1;i<=5; ++i) {
		for (int j=1;j<=5;++j) {
	//	if (j==1 ||j==5 ||i==1 || i==5) {
			if (i<=3)
			{
			System.out.print("#");
		}
		else
			System.out.print("*");
		}
	System.out.println();
	}
output:-
#####
#####
#####
*****
*****
*/


/*
 //=======================================================================
	
	for (int i=1;i<=5; ++i) {
		for (int j=1;j<=5;++j) {
	
			if (i==2 ||i==3 ||i==4 ) {
			//if (i<=2&& i<=4){
			
			System.out.print("#");
		}
		else
			System.out.print("*");
		}
	System.out.println();
	}
output:-

*****
#####
#####
#####
*****
*/
//========================================================================
/*
	for (int i=1;i<=5; ++i) {
		for (int j=1;j<=5;++j) {
	
			//if (i==2 ||i==3 ||i==4 ) {
			if (j>=3 && j<=5){
			
			System.out.print("#");
		}
		else
			System.out.print("*");
		}
	System.out.println();
	}
output 
**###
**###
**###
**###
**###
*/
	/*for (int i=1;i<=5; ++i) {
		for (int j=1;j<=5;++j) {
	
			//if(i==1,i==2){
			if (i<=2){
			
			System.out.print("@");
		}
			else if (i==3 ){
				
				System.out.print("$");
			}
		else
			System.out.print("#");
		}
	System.out.println();
	}
	output:-
	@@@@@
@@@@@
$$$$$
#####
#####
	*/
}
}
