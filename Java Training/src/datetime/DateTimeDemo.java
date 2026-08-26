package datetime;
import java.time.*;
public class DateTimeDemo { public static void main(String[] args){LocalDate today=LocalDate.now();LocalDateTime now=LocalDateTime.now();System.out.println(today);System.out.println(now);System.out.println(today.plusDays(7));} }
