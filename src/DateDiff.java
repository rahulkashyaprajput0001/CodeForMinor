/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDiff {
    public static void main(String[] args) throws ParseException {
        String timeArray[] = {"23:05:02", "23:04:59", "23:04:31", "12:36:07", "08:59:01", "00:00:00"};
        String givenTime = "23:05:38";
        findTimeDiff(timeArray, givenTime);
    }

    static public void findTimeDiff(String timeArray[], String givenTime) throws ParseException {
        String resArray[] = new String[6];
        long second;long minute;long hour;
        for (int i = 0; i < timeArray.length; i++) {
            String timeArrayEle = timeArray[i];

            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            Date date1 = format.parse(timeArrayEle);
            Date date2 = format.parse(givenTime);
            long durationInMillis = date2.getTime() - date1.getTime();
            hour = (durationInMillis / (1000 * 60 * 60)) % 24;
            minute = (durationInMillis / (1000 * 60)) % 60;
            second = (durationInMillis / 1000) % 60;
            //   System.out.println(hour+":"+minute+":"+second);
            if (hour > 0) {
                resArray[i] = hour + " hours ago";
            } else if (minute > 0) {
                resArray[i] = minute + " minute ago";
            } else {
                resArray[i] = second + " seconds ago";

            }
        }
        for (int i = 0; i < resArray.length; i++) {
            System.out.println(resArray[i] + " ");
        }
    }
}
