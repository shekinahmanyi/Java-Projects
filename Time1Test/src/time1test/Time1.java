/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package time1test;
class Time1 {
    private int hour; //0-23
 private int minute; //0-59
 private int second; //0-59
 public void setTime(int h, int m, int s) {
 hour = ((h >= 0 && h < 24) ? h : 0); //validate hour
 minute = ((m >= 0 && m < 60) ? m : 0); //validate minute
 second = ((s >= 0 && s < 60) ? s : 0); //validate second
 }
 //convert to string in universal time format HH:MM:SS
 public String toUniversalString() {
 return String.format("%02d:%02d:%02d", hour,minute,second);
 }
 //convert to string in universal time format H:MM:SS AM or PM
    @Override
 public String toString(){
 return String.format("%d:%02d:%02d %s",
 ((hour == 0 || hour == 12)? 12 : hour % 12),
 minute,second, (hour < 12 ? "AM" : "PM"));
}
}
