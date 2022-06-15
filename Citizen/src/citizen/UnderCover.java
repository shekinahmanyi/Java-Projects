/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citizen;
public class UnderCover extends Citizen {
public String name;
public UnderCover(String alias, Citizen c) {
super(alias);
this.name = alias;
}
public static void main(String[] args) {
    Citizen oldme = new Citizen ("Jack Average");
    Citizen newme = new UnderCover("John Anonymous" ,oldme);
    newme.report();
}
}
