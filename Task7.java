public class Task7 {
	public static void main(String[] args) {
		//радиус маленькой окружности
		int r=2;
		//радиус бльшой окружности
		int r2=4;
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		if (((x*x+y*y)<=r*r && y>=(-4) && y<=0 && x>=(-2) && x<=2 )||((x*x+y*y)<=r2*r2 && y>=(-4) && y<=4 && x>=0 && x<=4 && (x*x+y*y)>r*r)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}