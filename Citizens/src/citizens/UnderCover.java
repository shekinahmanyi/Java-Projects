/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citizens;

public class UnderCover extends Citizens {
    public String name;
public UnderCover(String alias, Citizens c) {
super(c.name);
this.name = alias;
}
public static void main(String[] args) {
    Citizens oldme = new Citizens ("Jack Average");
    Citizens newme = new UnderCover("John Anonymous" ,oldme);
    newme.report();
}
}
