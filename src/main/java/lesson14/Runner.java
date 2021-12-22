package lesson14;

import java.util.*;

public class Runner {

    public static Long [] getPopularNumber(Long[] a) {
        long count = 1, tempCount;
        long popular = a[0];
        long temp;
        for (int i = 0; i < (a.length - 1); i++) {
            temp = a[i];
            tempCount = 0;
            for (int j = 1; j < a.length; j++) {
                if (temp == a[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return new Long[]{popular, count};
    }

    public static void main(String[] args) {
        long startTime;
        long f;
        long b = 1;
        Random random = new Random();
        List<ProfileOfSubscriber> subscriberList = new ArrayList<>();
        List<Long> boundedContacts = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            subscriberList.add(ProfileOfSubscriber.generateSubscriber());
        }

        for (ProfileOfSubscriber subscriber : subscriberList) {
            int a = random.nextInt(300);
            for (int i = 0; i < a; i++) {
                ProfileOfSubscriber randomSubscriber = subscriberList.get(random.nextInt(subscriberList.size()));
                subscriber.setLinkedSubscribers(randomSubscriber.getPhone());
            }
            boundedContacts.addAll(subscriber.getLinkedSubscribers());
        }

        Long[] arrayOfBoundedContacts = new Long[boundedContacts.size()];
        for (int i = 0; i < boundedContacts.size(); i++) {
            arrayOfBoundedContacts[i] = boundedContacts.get(i);
        }
        System.out.println("Решение через массив");
        startTime = System.currentTimeMillis();
        Long[] result = getPopularNumber(arrayOfBoundedContacts);
        System.out.print("Наиболее популярный номер +7" + result[0] + " встречается " + result[1]+ " раз. ");
        for (ProfileOfSubscriber subscriber : subscriberList) {
            if (subscriber.getPhone() == result[0]) {
                System.out.println("Он принадлежит абоненту " + subscriber.getFio());
            }
        }
        double time = (double) (System.currentTimeMillis() - startTime) / 1000;

        System.out.println("Время выполнения программы " + time + " секунд.");
        System.out.println("----------------");

        System.out.println("Решение через коллекцию");
        Set<Long> frequencyOfNumbers = new HashSet<>(boundedContacts);
        startTime = System.currentTimeMillis();
        for (Long x : frequencyOfNumbers) {
            while (Collections.frequency(boundedContacts, x) > b) {
                b = Collections.frequency(boundedContacts, x);
            }
        }

        for (Long x : frequencyOfNumbers) {
            if (Collections.frequency(boundedContacts, x) == b) {
                System.out.print("Наиболее популярный номер +7" + x + " встречается " + Collections.frequency(boundedContacts, x) + " раз. ");
                f = x;
                for (ProfileOfSubscriber subscriber : subscriberList) {
                    if (subscriber.getPhone() == f) {
                        System.out.println("Он принадлежит абоненту " + subscriber.getFio());
                    }
                }
            }
        }

        time = (double) (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("Время выполнения программы " + time + " секунд.");
    }
}
