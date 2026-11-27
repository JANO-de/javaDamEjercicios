package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

import static excepciones.Colors.*;

public class ConsoleIO {
	private Scanner keyb;
	
	//Output
	
	public ConsoleIO(Scanner keyb) {
		this.keyb = keyb;
	}
	
	public void write(String text) {
		System.out.print(text);
	}
	
	public void write(int value) {
		write(String.valueOf(value));
	}
	
	public void write(double value) {
		write(String.valueOf(value));
	}
	
	public void write(char value) {
		write(String.valueOf(value));
	}
	
	public void write(boolean value) {
		write(String.valueOf(value));
	}
	
	public void writeln(String text) {
		System.out.println(text);
	}
	
	public void writeColor(String text, String color) {
		System.out.print(color + text + RESET);
	}
	
	public void writeColor(int value, String color) {
		writeColor(String.valueOf(value), color);
	}
	
	public void writeColor(double value, String color) {
		writeColor(String.valueOf(value), color);
	}
	
	public void writeColor(char value, String color) {
		writeColor(String.valueOf(value), color);
	}
	
	public void writeColor(boolean value, String color) {
		writeColor(String.valueOf(value), color);
	}
	
	public void writelnColor(String text, String color) {
		System.out.println(color + text + RESET);
	}
	
	//Input
	
	private void cleanInput() {
		keyb.nextLine();
	}
	
	public int readInt() {
		boolean isValid = false;
		int value = 0;
		do { 
			try {
				value = keyb.nextInt();
				isValid = true;
			} catch(InputMismatchException e) {
				writelnColor("Input is not an int", RED);
			}
			cleanInput();
		} while(!isValid);
		return value;
	}
	
	public int readIntLessThan(int upperBound) {
		int value = 0;
		do {
			value = readInt();
			if (value >= upperBound) {
				writelnColor("Input must be less than " + upperBound, RED );
			}
		}while(value >= upperBound);
		return value;
	}
	
	public int readIntLessOrEqualThan(int upperBound) {
		int value = 0;
		do {
			value = readInt();
			if (value > upperBound) {
				writelnColor("Input must be less than or equal to " + upperBound, RED );
			}
		} while (value > upperBound);
		return value;
	}
	
	 public int readIntGreaterThan(int lowerBound) {
		int value = 0;
		do {
			value = readInt();
			if (value <= lowerBound) {
				writelnColor("Input must be greater than" + lowerBound, RED );
			}
		} while (value <= lowerBound);
		return value;
	 }
	
	 public int readIntGreaterOrEqualThan(int lowerBound) {
		int value = 0;
		do {
			value = readInt();
			if (value < lowerBound) {
				writelnColor("Input must be greater than or equal to" + lowerBound, RED );
			}
		} while (value < lowerBound);
		return value;
	}
	 
	public int readIntInRange(int lowerBound, int upperBound) {
		int value = 0;
		do {
			value = readInt();
			if (value < lowerBound || value > upperBound) {
				writelnColor("Input must be value between " + lowerBound + " and " + upperBound, RED );
			}
		} while (value < lowerBound || value > upperBound);
		return value;
	}
	
	public double readDouble() {
		boolean isValid = false;
		double value = 0;
		do { 
			try {
				value = keyb.nextDouble();
				isValid = true;
			} catch(InputMismatchException e) {
				writelnColor("Input is not an double", RED);
			}
			cleanInput();
		} while(!isValid);
		return value;
	}
	
	public double readDoubleLessThan(double upperBound) {
		double value = 0;
		do {
			value = readDouble();
			if (value >= upperBound) {
				writelnColor("Value must be less than " + upperBound, RED);
			}
		}while(value >= upperBound);
		return value;
	}
	
	public double readDoubleLessOrEqualThan(double upperBound) {
		double value = 0;
		do {
			value = readDouble();
			if (value > upperBound) {
				writelnColor("Value must be less than or equeal to " + upperBound, RED);
			}
		}while(value > upperBound);
		return value;
	}
	
	public double readDoubleGreaterThan(double lowerBound) {
		double value = 0;
		do {
			value = readDouble();
			if (value <= lowerBound) {
				writelnColor("Value must be greater than " + lowerBound, RED);
			}
		}while(value <= lowerBound);
		return value;
	}
	
	public double readDoubleGreaterOrEqualThan(double lowerBound) {
		double value = 0;
		do {
			value = readDouble();
			if (value < lowerBound) {
				writelnColor("Value must be greater than or equal to " + lowerBound, RED);
			}
		}while(value < lowerBound);
		return value;
	}
	
	public double readDoubleInRange(double lowerBound, double upperBound) {
		double value = 0;
		do {
			value = readDouble();
			if (value < lowerBound || value > upperBound) {
				writelnColor("Input must be value between " + lowerBound + " and " + upperBound, RED );
			}
		} while (value < lowerBound || value > upperBound);
		return value;
	}
	
	public String readString() {
		return keyb.nextLine();
	}
	
	public String readString(int maxLength) {
		String text = " ";
		do {
			text = readString();
			if (text.length() > maxLength) {
				writelnColor("must be at most " + maxLength, RED);
			}
		}while(text.length() > maxLength);
		return text;
	}
	
	public char readChar() {
		String character = " ";
		do {
			character = readString();
			if (character.length() != 1) {
				writelnColor("Input is not a char, it should be 1 character", RED);
			}
		}while(character.length() != 1);
		return character.charAt(0);
	}
	
	public boolean readBooleanUsingChar(char affirmativeValue, char negativeValue) {
		char character = ' ';
		boolean result = false;
		do {
			character = Character.toLowerCase(readChar());
			if (character == Character.toLowerCase(affirmativeValue)) {
				result = true;
			} else if (character == Character.toLowerCase(negativeValue)) {
				result = false;
			} else {
				writelnColor("Input must be a value equal to " + affirmativeValue + " or " + negativeValue, RED);
			}
		}while (character != Character.toLowerCase(affirmativeValue) && character != Character.toLowerCase(negativeValue));
		return result;
	}
}