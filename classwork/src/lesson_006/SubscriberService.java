package lesson_006;

public interface SubscriberService {

    void cityCalls(Subscriber[] subscribers );
    void interCity(Subscriber[] subscribers);
    void subscriber(Subscriber[] subscribers, String firstLetter);
    void traffic(Subscriber[] subscribers , String city);
    void negativeBal(Subscriber[] subscribers);
}
