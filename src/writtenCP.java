import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class writtenCP {
    String entryTime = "2026-09-26T18:45:30";
    String exitTime = "2026-09-27T18:45:30";

    public void calculate(String entryTime, String exitTime) {


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
    LocalDateTime entryTimeCov = LocalDateTime.parse(entryTime, formatter);
    LocalDateTime exitTimeCov = LocalDateTime.parse(exitTime, formatter);
    long hours = Duration.between(entryTimeCov,exitTimeCov).toHours();
    System.out.println(hours);
}


}
