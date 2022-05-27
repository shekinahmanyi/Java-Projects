/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rolldie;
import java.io.PrintStream;
import java.util.Random;
public class Rolldie {
    public static void main(String[] args) {
     Random randomNumbers = new Random();
 int freq1 = 0;
 int freq2 = 0;
 int freq3 = 0;
 int freq4 = 0;
 int freq5 = 0;
 int freq6 = 0;
 int face;
 for (int roll=1;roll<=10000;roll++) {
 face = 1 + randomNumbers.nextInt(6);
 switch (face) {
 case 1:
 ++freq1;
 break;
 case 2:
 ++freq2;
 break;
 case 3:
 ++freq3;
 break; 
 case 4:
 ++freq4;
 break;
 case 5:
 ++freq5;
 break;
 case 6:
 ++freq6;
 break;
 }
 }
 System.out.println("Face\tFrequency");
  System.out.printf("1\t%d\n2\t%d\n3\t%d"
                + "\n4\t%d\n5\t%d\n6\t%d\n",
                freq1,freq2,freq3,freq4,freq5,freq6); /*printf*/
    }  
}
