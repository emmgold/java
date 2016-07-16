class clerscr {
	public static void main(String args[]) {
		
		for(int q = 0; q < 100; q++) 
			System.out.println();

		System.out.print("99%");
		
		for(int q = 99; q > 10; q--){
			for(long i = 0; i < 99999999; i++); 
			for(int x = 0; x < 3; x++)
				System.out.print((char)8 + " " + (char)8);
			System.out.print(q + "%");
		}
		
		System.out.println();
	}
}

