package bloque2;

public class Ejercicio4 {
    private void show() {
    	System.out.println("""
    			====================================================
				1) VALIDAS
				====================================================
				
				z = 2 < 1
				   Efecto: z = 0 (2<1 es false -> 0).
				   Tipos:  z debe ser int.
				
				a = a + 1
				   Efecto: a toma su valor + 1.
				   Tipos:  a numerica (byte/short/int/long/float/double)
				          e inicializada.
				
				a = b
				   Efecto: a recibe el valor de b.
				   Tipos:  ambas numericas y compatibles (ensanchamiento).
				          double -> int NO compila, haria falta cast.
				
				a = a<b?5+1:7-3*2
				   Efecto: si a<b entonces a=6, si no a=1 (7-3*2 = 7-6).
				   Tipos:  a y b numericas.
				
				i = ++j
				   Efecto: primero se incrementa j, luego i recibe el valor nuevo.
				   Tipos:  i y j numericas, no final, definidas.
				
				i = j++
				   Efecto: i recibe el valor viejo de j y despues j se incrementa.
				   Tipos:  i y j numericas, no final, definidas.
				
				c = 'c'
				   Efecto: c vale 'c' (codigo 99).
				   Tipos:  c debe ser char.
				
				c = 'A'      (en el codigo estaba escrito c = '\u0041')
				   Efecto: '\u0041' es el escape unicode de 'A', asi que c = 65.
				   Tipos:  c debe ser char o int.
				
				x = (a>b ? 5.4*3 : 65.1/8)
				   Efecto: si a>b entonces x = 16.2, si no x = 8.1375.
				   Tipos:  a y b numericas; x debe ser double, porque el
				          resultado es double y en Java no hay conversion
				          implicita de double a int.
				
				d = !a ? c++ : --c
				   Efecto: !a da true/false. Si a == 0 -> d = 0 y c se
				          incrementa (postfijo, usa el valor viejo).
				          Si a != 0 -> d = 1 y c se decrementa (prefijo).
				   Tipos:  c numerica y modificable (no final);
				          d debe ser int.
				
				
				====================================================
				2) INVALIDAS QUE SI COMPILAN AL CORREGIR LAS COMILLAS
				====================================================
				
				x = 'y'      (venia con comillas tipograficas)
				   Efecto: x = 121 (el codigo ASCII de 'y').
				   Tipos:  x debe ser char o int.
				
				c = '"'
				   Efecto: c = 34, el caracter comilla doble.
				   Tipos:  c debe ser char.
				
				s = "'"
				   Efecto: cadena de 2 caracteres: el apostrofo y el \0.
				   Tipos:  s debe ser String.
				
				s = ""
				   Efecto: cadena vacia, longitud 0.
				   Tipos:  s debe ser String.
				
				precio = precio - precio*(30/100)
				   (venia con un guion largo, no es el operador resta)
				   Efecto: NADA, precio no cambia. Porque 30/100 es division
				          entera y da 0, asi que se le resta 0. Esto pasa
				          aunque precio sea double, ya que 30 y 100 son int.
				          Para que funcione el 30% habria que escribir
				          precio - precio*(30.0/100).
				   Tipos:  precio numerica, inicializada y no final.
				
				
				====================================================
				3) INVALIDAS DE VERDAD
				====================================================
				
				'x' = 'y'
				   No se arregla cambiando las comillas. El lado izquierdo
				   de un = en Java tiene que ser una variable declarada; una
				   literal no lo es. Error de compilacion.
				
				a = b / 0
				   Si compila, pero al ejecutar lanza
				   ArithmeticException: / by zero y el programa termina si
				   no se captura con try/catch.
				
				c = '''
				   '' es un literal de caracter vacio: error de compilacion
				   (empty character literal).
				
				c = 65
				   Solo compila si c es byte, short, int o long. Si c es char
				   -- que es lo que sugieren las otras lineas -- NO compila,
				   porque en Java no hay conversion implicita de int a char.
				   Lo correcto seria c = 'A'.
				
				a == a>b ? 3+6 : 9-4
				   No es una asignacion, usa == (comparacion). Por
				   precedencia se evalua como a == ((a>b) ? 9 : 5).
				   No modifica absolutely nada: el resultado booleano se
				   descarta. Solo da true si a == 9 y a > b, o si a == 5 y
				   a <= b. Ademas necesita punto y coma.
    		    
    		    		""");
	}
    
    public static void main(String[] args) {
		new Ejercicio4().show();
	}
}
