/* INPUT: String 1 = "acddghmm";
String 2 = "bcegkl"
 * 
 * RESULT: Single sorted String: abcdeghklm
 * 
 */
package Recursive;

public class Prog1 {
	private static String result ="";

	public static void recur(String a, String b) {
		char last;
		char next = ' ';
		if(result.length() > 0)
			last = result.charAt(result.length()-1); //set the last character of String
		else
			last = '0';
		
		if( a.length() != 0){   // in case String a is still not null
			if(a.charAt(0)> last)
				next = a.charAt(0);
			
			if( b.length() != 0){
				if(b.charAt(0) <= next){
					next = b.charAt(0);
					if(b.length() >=2)				// Check length before decrease size for next loop
						b = b.substring(1);		
					else
						b = "";
				}
				else{
					if(a.length() >= 2)           // Check length before decrease size for next loop
						a = a.substring(1);
					else
						a = "";
				}					
			}
			else{
				if(a.length() >=2)				// Check length before decrease size for next loop
					a = a.substring(1);
				else
					a = "";
			}
		}
		
		else{                					// in case String b is still not null
			if(b.length()!=0){
				if(b.charAt(0) > last)
					next = b.charAt(0);
				if(b.length() >=2)
					b = b.substring(1);		
				else
					b = "";
			}
		}		
		
		if(next != ' ' )    
			result = result + next;
		
		if(a.length() == 0 &&b.length() == 0)
			return;
		else
			recur(a,b);
	}


	public static void main(String[] args){
		String a = "acddghmm";
		String b = "bceggkl";
		recur(a, b);
		System.out.println("Single sorted String: "+result);		
	}

}
