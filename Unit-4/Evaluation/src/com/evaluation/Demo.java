
/*
Q3) Change this block of code according to the given instruction and explain the output?

public class Demo {
public static void main(String[] args) {
int a = 64;
int b = 70;
byte c = a+b;//typecast (a+b) to byte
System.out.println(c){
}
}
Note: You need to typecast (a+b) to byte*/

/*
 Ans) In the above question we need to convert the data type of the varible a and b into the byte. so here we need to do explicit type casting.
 
 */

package com.evaluation;

public class Demo {

	public static void main(String[] args) {
		int a = 64;
		int b = 70;
		byte c = (byte)(a+b);//typecast (a+b) to byte
		System.out.println(c);
		{
			/*
			 Here we simply changed the type of the varible. Now as we now int is bigger data type then the the byte.
			 Byte only has range from 127 to -128.
			 So after converting this code into byte the value will only be in range between 127 to -128.
			 As per the above question the value shoud be 134 but due to type cast it will now -122.
			 */
		}
		}
}
