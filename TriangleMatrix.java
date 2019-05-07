package dailyStudy;

import java.util.Scanner;
import java.util.*;

public class MainTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the size of matrix you wanna created!");
		int size = in.nextInt();
		//Create the triangle matrix
		int[][] triangleMatrix = new int[size][];
		for(int i = 0; i < size; i++) {
			triangleMatrix[i] = new int[i + 1];
		}
		//assign the value to this matrix
		for(int i=0; i<triangleMatrix.length; i++) {
			for(int j=0; j<triangleMatrix[i].length; j++) {
				triangleMatrix[i][j] = j+1;
				System.out.print(triangleMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
