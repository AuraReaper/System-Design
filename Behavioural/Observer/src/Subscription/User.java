package Subscription;

import NewsChannels.NewsChannel;

public class User implements Subscriber {

    String name;
    String email;
    NewsChannel newsChannel;

    public User(String name, String email , NewsChannel newsChannel) {
        this.name = name;
        this.email = email;
        this.newsChannel = newsChannel;
    }

    @Override
    public void update() {
        sendMail(email, "check out the latest news in your inbox");
    }

    public void sendMail(String email, String message) {
        System.out.println("Sending update mail to " + email);
    }

}
