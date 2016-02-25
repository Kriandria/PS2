package base;

public class MyInteger {

	private int iValue;
	
	MyInteger(int value) {
		iValue = value;
	}
	
	public int getValue() {
		return this.iValue;
	}
	
	public boolean isEven() {
		if (this.iValue % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOdd() {
		if (this.iValue % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isPrime() {
		boolean prime = true;
		for (int x = 2; x < iValue; x++) {
			if (this.iValue % x == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	public static boolean isEven(int val) {
		if (val % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isOdd(int val) {
		if (val % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(int val) {
		boolean prime = true;
		for (int x = 2; x < val; x++) {
			if (val % x == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	
	public static boolean isEven(MyInteger val2) {
		int val = val2.getValue();
		if (val % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger val2) {
		int val = val2.getValue();
		if (val % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger val2) {
		int val = val2.getValue();
		boolean prime = true;
		for (int x = 2; x < val; x++) {
			if (val % x == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	public boolean equals(int val) {
		if (this.iValue == val) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(MyInteger val2) {
		int val = val2.getValue();
		if (this.iValue == val) {
			return true;
		}
		else {
			return false;
		}
	}
}
