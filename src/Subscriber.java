public class Subscriber {
    private String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public void update(String news) {
        System.out.printf("%n %s has recieved the news: \"%s\"",subscriberName,news);
    }
    
}