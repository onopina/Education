package exceptions_12.exceptions_12_4;

public class Utils {
    public void setUpAlertTime(int startTime, int endTime) {
        try {
            if (startTime < 0 || startTime > 24 || endTime < 0 || endTime > 24) {
                throw new IncorrectTimeException("The alert time should be between 0 and 24 hours");
            }
            if (startTime > endTime || startTime == endTime){
                throw new IncorrectTimeException("The end time must be greater than the start time");
            }
            else System.out.println("The start time of the Alert: " + startTime + "; The end time of the Alert: " + endTime);
        }
        catch (IncorrectTimeException e){
            System.out.println(e.getMessage());
        }
    }
}
