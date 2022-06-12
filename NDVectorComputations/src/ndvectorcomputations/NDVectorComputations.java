/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ndvectorcomputations;
import static java.lang.Math.*;
/**
 *
 * @author SHEKINAH ACHIDI
 */
public class NDVectorComputations {

    double computeMagnitude(NDVector v) {
		double sum = 0;
		double[] coordinates = v.getCoordinates();
		
		for(int i = 0; i < coordinates.length; i++) {
			sum += pow(coordinates[i], 2);
		}
		
		return sqrt(sum);
	}
	
	double computeDotProduct(NDVector v1, NDVector v2) {
		double sum = 0;
		double[] coordinates1 = v1.getCoordinates();
		double[] coordinates2 = v2.getCoordinates();
		

		if (coordinates1.length != coordinates2.length) {
			System.out.print("The 2 vectors must have the same dimensions to compute theirr dot product");
			return 0;
		} else {
			for (int i = 0; i < coordinates1.length; i++) 
				sum += coordinates1[i] * coordinates2[i];
			return sum;
		}
	}
	
	NDVector subtractVectors(NDVector v1, NDVector v2) {
		double[] coordinates1 = v1.getCoordinates();
		double[] coordinates2 = v2.getCoordinates();

		if (coordinates1.length == coordinates2.length) {
			double[] coordinates3 = new double[coordinates1.length];
			
			for (int i = 0; i < coordinates3.length; i++) 
				coordinates3[i] = coordinates1[i] - coordinates2[i];
			
			NDVector result = new NDVector(coordinates3);
			
			return result;
		} else {
			System.out.print("The 2 vectors must have the same dimensions to subtract them");
			return null;
		}
	}
	
	NDVector addVectors(NDVector v1, NDVector v2) {
		double[] coordinates1 = v1.getCoordinates();
		double[] coordinates2 = v2.getCoordinates();

		if (coordinates1.length == coordinates2.length) {
			double[] coordinates3 = new double[coordinates1.length];
			
			for (int i = 0; i < coordinates3.length; i++) 
				coordinates3[i] = coordinates1[i] + coordinates2[i];
			
			NDVector result = new NDVector(coordinates3);
			
			return result;
		} else {
			System.out.println("The 2 vectors must have the same dimensions to add them");
			return null;
		}
	}
}
