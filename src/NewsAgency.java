import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    public String agencyName;
    private List<Subscriber> subscriberList = new ArrayList<>();
    private String news;

    public NewsAgency(String agencyName) {
        this.agencyName = agencyName;
    }
    
    public void printAgencyName() {
        System.out.printf("%n This is %s News Agency.",agencyName);
    }

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public void publishNews(String news) {
        this.news = news;
        System.out.printf("%n [%s] Breaking News : %s",LocalDate.now(),news);
        notifySubscribers();
    }

    public void notifySubscribers() {
        for(Subscriber s: subscriberList) {
            s.update(news);
        }
    }
    
}