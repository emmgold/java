// Класс, реализующий очередь для хранения символов

class Queue {
	char q[];
	int putloc, getloc;

	Queue (int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}

	void put(char ch) {


		q[putloc++] = ch;

		if (putloc == q.length) putloc = 0;
		if (putloc == getloc) {
			getloc++;
			if (getloc == q.length) getloc = 0;
		}
	}

	char get() {
		if (getloc == q.length) getloc = 0;

		if(getloc == putloc) {
			System.out.println(" - Очередь пуста");
			return (char) 0;
		}

		return q[getloc++];
	}
}

class QDemo {
	public static void main(String args[]) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(6);

		char ch;
		int i;

		System.out.println("использование очереди bigQ для сохранения алфавита");

		for(i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i));

		System.out.print("Содержимое очереди bigQ: ");
		for(i = 0; i < 26; i++) {
			ch = bigQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}

		System.out.println("\n");

		System.out.println("использование очереди smallQ для генерации ошибок");

		for(i = 0; i < 8; i++) {
			System.out.print("Попытка сохранения " + (char) ('Z' - i));

			smallQ.put((char) ('Z' - i));

			System.out.println();
		}

		System.out.println();

		System.out.print("Содержимое smallQ: ");
		for(i = 0; i < 8; i++) {
			ch = smallQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
	}
}