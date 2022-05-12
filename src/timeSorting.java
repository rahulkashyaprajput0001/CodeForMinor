import java.util.*; 
import java.io.*;
import java.text.SimpleDateFormat;

class Main {

  
  public static String ArrayChallenge(String[] strArr) throws Exception {
    List <Long> listOfDates = new ArrayList<Long>();
    for(int i =0; i< strArr.length; i++){
      String time1 = strArr[i].substring(0,strArr[i].indexOf("-"));
      String time2 = strArr[i].substring(strArr[i].indexOf("-")+1);
      listOfDates.add(timeParsing(time1));
      listOfDates.add(timeParsing(time2));
    }
    Collections.sort(listOfDates);
    System.out.println(listOfDates);
    Long finalDiff = 0L;
    for (int j=1;j<listOfDates.size()-1;j=j+2){
      Long diff = listOfDates.get(j+1) - listOfDates.get(j);
      if (diff > finalDiff){
        finalDiff = diff;
      }
    }
    Date finalDate = new Date(finalDiff);
    System.out.println(finalDate);
    String str1 =  Integer.toString(finalDate.getHours());
    String str2 = Integer.toString(finalDate.getMinutes());
    System.out.println(str1+":"+str2);
    return str1+":"+str2;
  }

  public static Long timeParsing(String time) throws Exception{
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mma");
    TimeZone timeZone = TimeZone.getTimeZone("IST");
    Date date = sdf.parse(time);
    System.out.println(date);
     System.out.println(date.getTime());
    return date.getTime();
  }
  public static void main (String[] args) throws Exception {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    ArrayChallenge(new String[] {"12:15PM-02:00PM","09:00AM-10:00AM","10:30AM-12:00PM"});
  }
}