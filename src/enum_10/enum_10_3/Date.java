package enum_10.enum_10_3;

public class Date {

    private Month month;
    private int day;
    private int year;
    private Weekday weekday;

    public Date(Month month, int day, int year, Weekday weekday) {
        this.month = month;
        this.day = day;
        this.year = year;
        this.weekday = weekday;
    }

    @Override
    public String toString() {
        return month + " " + day + ", " + year + ", " + weekday;
    }
}
