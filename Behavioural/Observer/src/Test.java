import NewsChannels.NewsChannel;
import NewsChannels.Sports;
import NewsChannels.Tech;
import Subscription.Subscriber;
import Subscription.User;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose News to subscribe to") ;
        System.out.println("1. Tech News") ;
        System.out.println("2. Sports News") ;
        System.out.print("Enter Choice: ") ;
        int choice = sc.nextInt() ;
        switch (choice) {
            case 1:
                System.out.println("Enter your name") ;
                String name = sc.next() ;
                sc.nextLine() ;
                System.out.println("Enter your email") ;
                String email = sc.next() ;
                NewsChannel techNews = new Tech() ;
                Subscriber sub1 = new User(name, email, techNews) ;
                techNews.add(sub1) ;
                System.out.println("Subscribe successfully") ;
                System.out.println("........................") ;
                System.out.println("........................") ;
                System.out.println("........................") ;
                System.out.println("........................") ;
                techNews.getUpdate() ;
                break;
            case 2:
                System.out.println("Enter your name") ;
                name = sc.next() ;
                sc.nextLine() ;
                System.out.println("Enter your email") ;
                email = sc.next() ;
                NewsChannel sportsNews = new Sports() ;
                Subscriber sub2 = new User(name, email, sportsNews) ;
                sportsNews.add(sub2) ;
                System.out.println("Subscribe successfully") ;
                System.out.println("........................") ;
                System.out.println("........................") ;
                System.out.println("........................") ;
                System.out.println("........................") ;
                sportsNews.getUpdate() ;
                break;
            default:
                System.out.println("You are not subscribed to any News Channel") ;
        }
    }
}
