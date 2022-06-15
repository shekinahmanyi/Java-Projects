/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package citizens;
public class Citizens {
    protected String name;
    public Citizens(String s) {
     name = s; 
    }
    protected String getName() {
    return name;
    }
    public void report() {
        System.out.println("I am " + name);
    }
}
