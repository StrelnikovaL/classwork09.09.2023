public class Task10T2 {
	public static void main(String[] args) {
		int a = 8;
		for (int i = 1; i <= a; i++){
			for (int j = 1; j <= a-i; j++){
				System.out.print('*');
			}
			System.out.println('*');
		}
	}
}