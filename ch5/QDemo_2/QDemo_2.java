class Queue {
	char q[];
	int putloc, getloc;

	Queue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}

	void put(char ch) {
		q[putloc++] = ch; // Поместили элемент в очередь

		if(putloc == q.length) {
			putloc = 0;	
		} 	// Дошли до колнца массива, 
			//начинаем заполнение с начала -> закольцевали
		
		if(putloc == getloc) getloc++; 	// Если конец кольцевой очереди
		if(getloc == q.length) getloc = 0;
						// достиг начала, начало сдвигаем
						// теряем данные
	}

	char get() {
		if(getloc == q.length) getloc = 0;

		if(getloc == putloc) {
			System.out.println(" - Очередь пуста");
			return (char) 0;
		}
			return q[getloc++];
	}
}

class QDemo_2 {
	public static void main (String args[]) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(3);
		char ch;
		int i;

		System.out.println("Использование очереди bigQ для сохранения алфавита");
		for (i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i));

		System.out.print("Содержимое очереди bigQ ");
		for (i = 0; i < 26; i++) {
			ch = bigQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}

		System.out.println("\n");

		System.out.println("Использование очереди smallQ для генерации ошибок");
		for (i = 0; i < 9; i++) {
			System.out.print("Попытка сохранения " + (char) ('Z' - i));

			smallQ.put((char) ('Z' - i));

			System.out.println();
		}

		System.out.println();

		System.out.print("Содержимое smallQ: ");
		for(i = 0; i < 3; i++) {
			ch = smallQ.get();

			if(ch != (char) 0) System.out.print(ch);

		}
		System.out.println();
	}
}

