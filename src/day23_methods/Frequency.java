package day23_methods;
/*
 write a program that can return the frequency of the characters in a string
		Ex: "AABCBCA" ==> "A3B2C2"
 */
public class Frequency {
	public static void main(String[] args) {
		String str = "AAABCBCCD";
		String elementRepeated = "";
		String jCount = "";
		
		for (int jStr = 0; jStr <= elementRepeated.length()-1; jStr++) {
		char elementChar = elementRepeated.charAt(jStr);
			
			int iCount = 0;
			for (int iStr = 0; iStr <= str.length() - 1; iStr++) {
				if (str.charAt(iStr) == elementChar) {
					iCount++;
				}
			}
			jCount +="" + elementRepeated +iCount;
			
		}
		
		System.out.println(jCount );
	}
}
