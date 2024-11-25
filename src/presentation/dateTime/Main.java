package presentation.dateTime;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//        System.out.println(date);
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        calendar.add(Calendar.WEEK_OF_MONTH, 1);
//
//        System.out.println(calendar.getTime());
//
//        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
//        System.out.println(dateFormat.format(calendar.getTime()));
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//        System.out.println(simpleDateFormat.format(calendar.getTime()));
//
//        Date newDate = simpleDateFormat.parse("01/01/2000 05:55");
//
//        System.out.println(newDate);

        LocalDate specificDate = LocalDate.of(2022, Month.OCTOBER, 24);
        LocalDate currentDate = LocalDate.now();
        LocalDate date = LocalDate.ofEpochDay(100);

        System.out.println(currentDate);
        System.out.println(date);

        System.out.println(date.getDayOfWeek());



    }
}
