/*
	Явное преобразование типов.

	(тип) (выражение);

	b = (byte) i;
	b = (byte) (i+2);
*/

class CastDemo {
	public static void main(String args[]) {
		double x, y;
		byte b;
		int i;
		char ch;

		x = 10.0;
		y = 3.0;
		i = (int) (x / y);	// Теряется дробная часть числа
		System.out.println("Целочисленный результат деления x / y: " + i);

		i = 100;
		b = (byte) i;	// информация не теряется. Тип byte может содержать 100
		System.out.println("Значение b: " + b);

		i = 257;
		b = (byte) i;	// информация теряется. Тип byte не может содержать 257
		System.out.println("Значение b: " + b);

		b = 88;			// Представление символа Х в коде ASCII
		ch = (char) b;	// Явное приведение несовместимых типов
		System.out.println("ch: " + ch);
	}
}