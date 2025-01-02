/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
public class Date {
    public static void main(String[] args) {
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("dd/MM/YYYY");
        String currentdate=format.format(date);
        System.out.println(currentdate);
        LocalTime tim=LocalTime.now();
        System.out.println(tim);
    }
    
}
