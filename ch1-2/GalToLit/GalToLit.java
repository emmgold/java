/* 
	Программа преобразования галлонов в литры
	Emmanuel Goldstein
	07.01.2016 01:55
*/
class GalToLit {
	public static void main(String args[]) {
		double gallons, liters;

		gallons = 10;

		liters = gallons * 3.7854;

		System.out.println(gallons + " галлонам соответствует " + liters + " литров");
	}
}

