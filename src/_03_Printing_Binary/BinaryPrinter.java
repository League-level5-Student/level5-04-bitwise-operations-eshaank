package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		byte b = 8;
		short s = 100;
		int i = 1000;
		long l = 10000000;
		
		printByteBinary(b);
//		System.out.println();
//		printShortBinary(s);
//		System.out.println();
//		printIntBinary(i);
//		System.out.println();
//		printLongBinary(l);
	}
	
	public static void printByteBinary(byte b) {
		//StringBuilder num = new StringBuilder();
		String num = "";
		for (int i = 7; i >= 0; i--) {
			byte numShift = (byte) (b >> i);
			
			if ((numShift & 1) > 0) {
				num += "1";
			}
			else {
				num += "0";
			}
		}
		System.out.println(num);
	}
	
	public static void printShortBinary(short s) {
		for (int i = 15; i >= 0; i--) {
			short numShift = (short) (s >> i);
			
			if ((numShift & 1) > 0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}
	}
	
	public static void printIntBinary(int i) {
		for (int j = 31; j >= 0; j--) {
			byte numShift = (byte) (i >> j);
			
			if ((numShift & 1) > 0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}
	}
	
	public static void printLongBinary(long l) {
		for (int i = 63; i >= 0; i--) {
			byte numShift = (byte) (l >> i);
			
			if ((numShift & 1) > 0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}
	}
}
