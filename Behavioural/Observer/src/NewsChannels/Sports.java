package NewsChannels;

import Subscription.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Sports implements NewsChannel {

    private List<Subscriber> subscriber ;

    public Sports() {
        this.subscriber = new ArrayList<Subscriber>();
    }

    @Override
    public void add(Subscriber sub) {
        subscriber.add(sub);
    }

    @Override
    public void remove(Subscriber sub) {
        subscriber.remove(sub);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber sub : subscriber) {
            sub.update();
        }
    }

    @Override
    public void getUpdate() {
        notifySubscribers();
    }
}
