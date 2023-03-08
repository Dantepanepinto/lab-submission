import java.time.Localdate;
import java.util.ArrayList;

public class Magazine extends Item{
    private LocalDate date;
    private String issueNumber;

    public Magazine(String title, String location, LocalDate date, String issueNumber){
        super(title, location, borrowable: false);
        this.date = date;
        this.issueNumber = issueNumber;
    }

    public Localdate getyear(){
        return date;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public String prettyprint(){
        return null;
    }
}
