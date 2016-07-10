class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;

	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	int range() {
		return mpg * fuelcap;
	}

	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

class VehConsDemo {
	public static void main(String args[]) {

		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 15, 12);
		
		double gallons;
		int dist = 252;

		gallons = minivan.fuelneeded(dist);

		System.out.println("Для преодоления " + dist +
			" миль мини-фургону требуется " +
			gallons + " галлонов топлива");

		gallons = sportscar.fuelneeded(dist);

		System.out.println("Для преодоления " + dist +
			" миль спортивному автомобилю требуется " +
			gallons + " галлонов топлива");
	}
}
