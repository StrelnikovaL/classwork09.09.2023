public class Task6 {
	public static void main(String[] args) {
	int r=4;
	int x =Integer.parseInt(args[0]);
	int y =Integer.parseInt(args[1]);
	//int x = 5;
	//int y = 4;
	if ((x*x+y*y)<=r*r && ((4>=x&&x>=0) && (0>=y&&y>=(-4)) || (4>=y&&y>=2) && (4>=x&&x>=(-4)))) {
		System.out.println("True");
	} else {
		System.out.println("False");
	}
	}
}