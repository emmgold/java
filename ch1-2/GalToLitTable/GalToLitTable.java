class GalToLitTable {
	public static void main(String args[]) {
		double gallons, liters;

		for(gallons = 0; gallons <= 100; gallons++) {
			liters = gallons * 3.7854;
			System.out.format("%.3f галлонам соответствует %.3f литров%n", gallons, liters);
			if(gallons % 10 == 0)
				System.out.println();
		}
	}
}

