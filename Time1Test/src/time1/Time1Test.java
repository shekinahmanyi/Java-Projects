/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package time1;
public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1(); //invoke Time1's constructor
 //output string representations of time
 System.out.print("Initial Universal Time: ");
 System.out.println(time.toUniversalString());
 System.out.print("Initial Standard Time: ");
 System.out.println(time.toString());
 System.out.println();
 //change time and output updated time
 time.setTime(15, 35, 12);
 System.out.print("Universal Time after setTime: ");
 System.out.println(time.toUniversalString());
 System.out.print("Standard Time after setTime: ");
 System.out.println(time.toString());
 System.out.println();
 //set time to invalid values and output updated time
 time.setTime(99, 99, 99);
 System.out.print("Universal Time after Invalid Setting: ");
 System.out.println(time.toUniversalString());
 System.out.print("Standard Time after Invalid Setting: ");
 System.out.println(time.toString());
 System.out.println();
    }
}
