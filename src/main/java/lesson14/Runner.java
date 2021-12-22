package lesson14;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long f;
        long b = 1;
        Random random = new Random();

        List<ProfileOfSubscriber> subscriberList = new ArrayList<>();
        List<Long> boundedContacts = new ArrayList<>();
        Set<Long> frequencyOfNumbers = new HashSet<>(boundedContacts);

        for (int i = 0; i < 300; i++) {
            subscriberList.add(ProfileOfSubscriber.generateSubscriber());
        }


        for (ProfileOfSubscriber subscriber : subscriberList) {
            int a = random.nextInt(200);
            for (int i = 0; i < a; i++) {
                ProfileOfSubscriber randomSubscriber = subscriberList.get(random.nextInt(subscriberList.size()));
                subscriber.setLinkedSubscribers(randomSubscriber.getPhone());
            }
            boundedContacts.addAll(subscriber.getLinkedSubscribers());
        }

        for (Long x : frequencyOfNumbers) {
            if (Collections.frequency(boundedContacts, x) >= b) {
                b = Collections.frequency(boundedContacts, x);
            }
        }

        for (Long x : frequencyOfNumbers) {
            if (Collections.frequency(boundedContacts, x) == b) {
                System.out.print("Наиболее популярный номер +7" + x + " повторяется " + Collections.frequency(boundedContacts, x) + " раз. ");
                f = x;
                for (ProfileOfSubscriber subscriber : subscriberList) {
                    if (subscriber.getPhone() == f) {
                        System.out.println("Он принадлежит абоненту " + subscriber.getFio());
                    }
                }
            }
        }
        /*for (ProfileOfSubscriber subscriber : subscriberList) {
            if (subscriber.getPhone() == f) {
                System.out.println("Он принадлежит абоненту " + subscriber.getFio());
            }
        }*/

        double time = (double) (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("Время выполнения программы " + time + " секунд.");
    }
}
