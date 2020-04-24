class Main {
		public static int times(int a, int b, int c) {
			c = a + b;
			return a * b;
		}
	
		public static void main(String[] args) throws Exception {
			int a = 1;
			int b = 2;
			int c = 3;
			
			int result = times(a, 5, c);
			
			System.out.println("result = " + result);
			System.out.println("int c = " + c);
		}
}