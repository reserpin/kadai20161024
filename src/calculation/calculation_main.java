package calculation;

import java.util.Scanner;;
public class calculation_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("nuber > ");
		int n = Integer.parseInt(scan.next());
		System.out.print("nuber > ");
		int m = Integer.parseInt(scan.next());
		
		calculation_lib clib = new calculation_lib(n,m);
		int p = clib.getPlus();
		System.out.print(p);
		p = clib.getMinus();
		System.out.print(p);
		p = clib.getDivide();
		System.out.print(p);
		p = clib.getProduct();
		System.out.print(p);
		p = clib.getMod();
		System.out.print(p);
	}

}
