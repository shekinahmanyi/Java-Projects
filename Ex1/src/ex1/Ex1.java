/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;
public class Ex1 {
    public static void main(String[] args) {
       int x =10;
       int y = new Ex1().change(x);
        System.out.print(x +" " + y + "**");
        int i,a=1,b=0;
        for(i=0;i<5;i++) { a =a*2; b++; }
        System.out.println(i +" " +a + "" + b);
    }
    int change(int x) {x=5; return x;}
}
