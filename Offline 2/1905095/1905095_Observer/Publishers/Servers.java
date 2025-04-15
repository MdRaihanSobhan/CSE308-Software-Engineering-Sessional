package Publishers;

import Subscribers.Subscriber;

public interface Servers {
    void subscribe(Subscriber subscriber);
    void notify_All_Subscribers();

}
