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
		double triangleBase = scanner.nextDouble();
		
		System.out.println("please input dimensons for triangle A");
		System.out.println("height?");
		double triangleHeight = scanner.nextDouble();
		
		System.out.println("please input dimensons for triangle A");
		System.out.println("side one length?");
		double triangleSideOneLen = scanner.nextDouble();
		
		System.out.println("please input dimensons for triangle A");
		System.out.println("side two length?");
		double triangleSideTwoLen = scanner.nextDouble();
		
		System.out.println("please input dimensons for triangle A");
		System.out.println("side 3 length?");
		double triangleSideThreeLen = scanner.nextDouble();
	
		
		Triangle triangleA = new Triangle(triangleBase, triangleHeight, triangleSideOneLen, triangleSideTwoLen, triangleSideThreeLen);
		
		double triangleAArea = triangleA.findArea();
		System.out.println(" ");
		System.out.println("computing area of triangle A");
		wait(5);
		System.out.println("*******************************************");
		System.out.println("the area of triangle A is " + triangleAArea);
	}

}
