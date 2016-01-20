class Phone {
	public static void main(String args[]) {
		String numbers[][] = {
			{"Tom", "555-55-51"},
			{"Mary", "555-55-52"},
			{"John", "555-55-53"},
			{"Rachel", "555-55-54"}
		};

		int i;

		if(args.length != 1)
			System.out.println("использование: java Phone <имя>");
		else {
			for(i = 0; i < numbers.length; i++) {
				if(numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0] + ":" + numbers[i][1]);
					break;
				}
			}
			if(i == numbers.length)
				System.out.println("имя не найдено :/");
		}
	}
}