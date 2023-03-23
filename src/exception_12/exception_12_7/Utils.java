package exception_12.exception_12_7;

public class Utils {
    public void setUpTime(int hours, int minutes, int seconds) {
        try{
            if (hours < 0 || hours > 24){
                throw new IncorrectTimeException("The hours should be between 0 and 24");
            }
            if (minutes < 0 || minutes > 60) {
                throw new IncorrectTimeException("The minutes should be between 0 and 60");
            }
            if (seconds < 0 || seconds > 60) {
                throw new IncorrectTimeException("The seconds should be between 0 and 60");
            }
            System.out.println("The current time is: " + hours + ":" + minutes + ":" + seconds);
        }
        catch (IncorrectTimeException e){
            System.out.println(e.getMessage());
            try {
                if (hours < 0 || hours > 24){
                    throw new IncorrectTimeException("The hours should be between 0 and 24");
                }
            }
            catch (IncorrectTimeException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
