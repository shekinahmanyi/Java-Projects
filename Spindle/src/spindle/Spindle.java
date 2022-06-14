/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spindle;

public class Spindle {

    public static void main(String[] args) {
       int [] a = new int[] {1,2,3,4};
       int b =5, c=6;
       Fold.multilate(a,b,c);
        System.out.printf("%d %d %d\n",a[0],b,c);
    } 
}
class Fold {
    static void multilate(int[] a, int b, int c){
        a[0]=7; b=8; c=9;
    }
}
