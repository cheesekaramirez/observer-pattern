public class NotifyingSubscribersDemo {
    public static void main(String[] args) {
        NewsAgency na = new NewsAgency("COMP News");

        Subscriber p = new Subscriber("Princess");
        Subscriber c = new Subscriber("Clark");
        Subscriber n = new Subscriber("Nena");
        Subscriber a = new Subscriber("Anthony");
        
        na.subscribe(p);
        na.subscribe(c);
        na.subscribe(n);
        na.subscribe(a);
        System.out.println();
        na.publishNews("RAM Prices Are Going Up Again!");
        System.out.println();
        na.unsubscribe(p);
        System.out.println();
        na.publishNews("New Component-Based JavaScript Framework Just Dropped!");

    }
}
