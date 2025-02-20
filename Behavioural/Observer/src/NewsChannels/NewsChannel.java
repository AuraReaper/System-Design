package NewsChannels;

import Subscription.Subscriber;

public interface NewsChannel {
    public void add(Subscriber sub);
    public void remove(Subscriber sub);
    public void notifySubscribers();
    public void getUpdate();
}
