package bloque2;

public class Ejercicio3 {
	public void show() {
		//1
		int x = (int) 165698L;
		System.out.println(x);
		//2
		short s = 56;
		byte b= (byte) s;
		System.out.println(b);
		//3
		byte b2 = (byte) 129;
		System.out.println(b2);
		//4
		float f = 5.89f;
		System.out.println(f);
		//5
		long l = (long) 8.42;
		System.out.println(l);
		//6
		char c1='a',c2;
		c2 = (char) (c1 + 7);
		System.out.println(c2);
		//7
		byte b3;
		short s2 = 7;
		boolean a=true;
		b3 = (byte) (a ? s2++:--s2);
		System.out.println(b3);
	}
	
	public static void main(String[] args) {
		new Ejercicio3().show();
	}
}
