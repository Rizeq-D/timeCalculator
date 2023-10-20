public class CalcYearsAndDays {

    public static void printYearsDaysSeconds(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {
            long hours = minutes / 60;
            long seconds = minutes * 60;
            long days = hours / 24;
            long years = days / 365;

            System.out.println(minutes + " Minutes = "  + seconds + " Seconds " + hours + " Hours "
                    + days + " Days " + years + " Years ");
        }
    }
}