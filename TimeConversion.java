import java.util.*;

class TimeConversion {
    public static void main(String[] args) {
        String s = "12:45:54PM";
        // 12:04:47AM
        // 12:36:56PM
        String hour = s.substring(0, 2);
        String ampm = s.substring(8, 10);

        if(ampm.equals("AM") && hour.equals("12")){
            System.out.println("Happening");
            hour = "00";
        }else if(ampm.equals("PM")&& (Integer.parseInt(hour) < 12)){
            int currentHour = Integer.parseInt(hour)+12;
            hour = ""+currentHour;
        }
        // hour.replace("12", "00");
        System.out.println(hour);


    }
}