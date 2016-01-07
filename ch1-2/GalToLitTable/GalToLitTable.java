class GalToLitTable {
	public static void main(String args[]) {
		double gallons, liters;

		for(gallons = 0; gallons <= 100; gallons++) {
			liters = gallons * 3.7854;
			System.out.println(gallons + " галлонам соответствует " + liters + " литров");
			if(gallons % 10 == 0)
				System.out.println();
		}
	}
}

