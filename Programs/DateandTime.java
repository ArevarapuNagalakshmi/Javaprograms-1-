package Programs;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateandTime {
    public static void main(String[] args) {
       DateTimeFormatter formatter=DateTimeFormatter.ofPattern("mm/dd/yyyy  HH:mm:ss");
       String date= LocalDateTime.now().format(formatter);
        System.out.println(date);
    }
}
