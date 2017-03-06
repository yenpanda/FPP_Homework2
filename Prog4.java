/* RESULT:
 * String: madam is Palindrome
 */
package Recursive;

public class Prog4 {
	public static boolean recur(String a){
		
		if(a.length() < 2 || a.equals(""))
			return true;
		
		if(a.charAt(0) == a.charAt(a.length()-1)){
			return recur(a.substring(1, a.length()-1));
			}
		return false;
	}
	
	public static void main(String []args){
		String a = "madAm";
		if(recur(a))
			System.out.println("String: " +a+ " is Palindrome");
		else
			System.out.println("String: " +a+ " is not Palindrome");
	}

}
