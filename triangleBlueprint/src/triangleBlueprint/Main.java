package triangleBlueprint;

import java.util.Scanner;
/**
 * @author corey
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please input dimensons for triangle A");
		System.out.println("base?");
		double userTriangleBase = scanner.nextDouble();
		
		System.out.println("please input dimensons for triangle A");
		System.out.println("height?");
		double userTriangleHeight = scanner.nextDouble();
		
		System.out.println("please input dimensons for triangle A");
		System.out.println("side one length?");
		double userTriangleSideOneLen = scanner.nextDouble();
		
		System.out.println("please input dimensons for triangle A");
		System.out.println("side two length?");
		double userTriangleSideTwoLen = scanner.nextDouble();
		
		System.out.println("please input dimensons for triangle A");
		System.out.println("side 3 length?");
		double userTriangleSideThreeLen = scanner.nextDouble();
	
		
		Triangle triangleA = new Triangle(userTriangleBase, userTriangleHeight, userTriangleSideOneLen, userTriangleSideTwoLen, userTriangleSideThreeLen);
		
		double triangleAArea = triangleA.findArea();
		System.out.println(triangleAArea);
	}

}
