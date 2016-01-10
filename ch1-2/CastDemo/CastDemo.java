/*
	Явное преобразование типов.

	(тип) (выражение);

	b = (byte) i;
	b = (byte) (i+2);

	-------------

	При вычислении выражений ВСЕГДА происходит преобразование типов.
	char, byte, short преобразуются в int
	если есть переменные long, то всё это преобразуется в long
	если есть переменные float, то всё преобразуется в float
	и потом, если есть переменные double, то всё преобразуется в double

	например 
	byte b;
	b = b * b; -- НЕ ВЕРНО, b*b это уже int
	b = (byte) (b * b); -- ВЕРНО. тут требуется явное преобразование типов.
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