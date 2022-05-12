/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author rahul.kashyap
 */
public class Zill {
    public static void main(String[] args) {
        /* System.out.println(Calendar.DATE+"--");
         Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
         System.out.println(Calendar.DATE+"--");
        cal.add(Calendar.MINUTE, -5);
        cal.add(Calendar.HOUR, 1);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        System.out.println(Calendar.DATE+"--");
        System.out.println(cal.getTime());*/
         Calendar cal = Calendar.getInstance();
         cal.add(Calendar.DATE, 3);
        
    }
}
