// Класс, реализующий очередь для хранения символов
// дополнил, теперь это циклическая очередь

class Queue {
	char q[];
	int putloc, getloc;

	Queue (int size) {
		q = new char[size+1];	// создаём массив на 1 больше нужного, чтобы обработать
		putloc = getloc = 0;	// начальный момент, когда начало и конец указывают 
	}							// на один и тот же элемент

	void put(char ch) {	// засовываем новый элемент в циклическую очередь


		q[putloc++] = ch; // взяли и засунули, указатель сместили на следующий элемент

		if (putloc == q.length) putloc = 0; // если указатель вышел за пределы массива,
											// перекинули его на начало массива
											// зациклили очередь

		if (putloc == getloc) {		// если обнаружили начало очереди, 
			getloc++;				// то сместили его вперёд
			if (getloc == q.length) getloc = 0; // если начало очереди вышло за пределы  
		}								// массива, то зациклили его на начало массива
	}

	char get() {
		if (getloc == q.length) getloc = 0;	// если указатель на элемент выходит за максимум 
											// массива то он указывает на начало массива.

		if(getloc == putloc) {	// если начало и конец очереди совпадают, то очередь пуста
			System.out.println(" - Очередь пуста");
			return (char) 0;
		}

		return q[getloc++]; // читаем по очереди, пока не дочитаем до конца очереди
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