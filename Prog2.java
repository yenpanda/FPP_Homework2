/* RESULT: 
 * Mimimum Character is: a
 */
package Recursive;

public class Prog2 {
	static char min; 
	public static char Rec(String a){

		min = min <= a.charAt(0)?min:a.charAt(0);
		if(a.length() == 1)
			return min;
		else
			return Rec(a.substring(1));
	}
	
	public static void main(String arg[]){
		String a = "akel";
		min = a.charAt(0);
		System.out.println("Mimimum Character is: "+Rec(a));
	}

}
