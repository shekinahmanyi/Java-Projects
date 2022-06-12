/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndvectorcomputations;


public class Vectors {
    
    public static void main(String[] args) {
		double[] coord1 = {2.5, 3, 3.5};
		double[] coord2 = {3, 2.3, 3.5};
		double[] coord3 = {2.5, 3, 3.5, 4};
		double[] coord4 = {2.5, 4, 3, 3.5};
		
		NDVector v1 = new NDVector(coord1);
		NDVector v2 = new NDVector(coord2);
		NDVector v3 = new NDVector(coord3);
		NDVector v4 = new NDVector(coord4);
		
		NDVectorComputations ndvc = new NDVectorComputations();
		
		System.out.print("Vector v1 is: "); v1.displayVector();
		System.out.print("Vector v2 is: "); v2.displayVector();
		System.out.print("Vector v3 is: "); v3.displayVector();
		System.out.print("Vector v4 is: "); v4.displayVector();
		
		System.out.printf("%s %.2f\n", "The magnitude of V1 is: ", ndvc.computeMagnitude(v1));
		
		System.out.printf("%s %.2f\n", "V1.V2 is: ", ndvc.computeDotProduct(v1, v2));
		System.out.printf("%s %.2f\n", "V3.V4 is: ", ndvc.computeDotProduct(v3, v4));
		
		NDVector result;
		
		result = ndvc.subtractVectors(v1, v2);
		System.out.printf("%s ", "V1 - V2 is");
		if (result != null)
			result.displayVector();

		System.out.printf("%s ", "V1 + V2 is");
		result = ndvc.addVectors(v1, v2);
		if (result != null)
			result.displayVector();

		System.out.printf("%s ", "V3 + V4 is");
		result = ndvc.addVectors(v3, v4);
		if (result != null)
			result.displayVector();

		System.out.printf("%s ", "V2 + V3 is");
		result = ndvc.addVectors(v2, v3);
		if (result != null)
			result.displayVector();
	}

    }
    

