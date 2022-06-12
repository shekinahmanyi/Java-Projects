/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndvectorcomputations;
import java.util.Arrays;
/**
 *
 * @author SHEKINAH ACHIDI
 */
 public class NDVector {
    private double[] coordinates;
	
	public NDVector(double[] ar) {
		if (ar.length != 0) {
			coordinates = new double[ar.length];
			
			for (int i = 0; i < ar.length; i++)
				coordinates[i] = ar[i];
		} else {
			System.out.println("Error creating Vector "+ Arrays.toString(ar));
		}
	}

	public double[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}
	
	public void displayVector() {
		System.out.print("(");
		
		int i;
		for (i = 0; i < coordinates.length - 1; i++) {
			System.out.printf("%.2f, ", coordinates[i]);
		}

		System.out.printf("%.2f)\n", coordinates[coordinates.length - 1]);
	}
}
