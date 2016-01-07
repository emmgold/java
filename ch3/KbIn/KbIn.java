class KbIn {
	public static void main(String args[])
	throws java.io.IOException {
		char ch;

		System.out.print("Нажмите нужную клавишу, а затем клавишу Enter: ");
		ch = (char) System.in.read();
		// Преобразование типов требуется потому, что вводимый символ представляется целочисленным значением.

		System.out.println("Вы нажали клавишу " + ch);
	}
}

