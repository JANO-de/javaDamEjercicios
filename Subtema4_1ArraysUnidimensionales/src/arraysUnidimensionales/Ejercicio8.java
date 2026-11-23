package arraysUnidimensionales;

public class Ejercicio8 {

	public void show() {
		int[] list = { 1, 2, 3, 2, 1 };

		System.out.printf("Is palindrome: %b", isPalindrome(list));
	}

	public boolean isPalindrome(int[] list) {
		return isPalindrome(list, 0, list.length - 1);
	}

	private boolean isPalindrome(int[] list, int start, int end) {
		if (start >= end) {
			return true;
		}
		return list[start] == list[end] && isPalindrome(list, start + 1, end - 1);
	}

	public static void main(String[] args) {
		new Ejercicio8().show();
	}

}