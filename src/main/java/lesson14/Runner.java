package lesson14;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        int leftLimit = 1040; // letter 'a'
        int rightLimit = 1103; // letter 'z'
        int targetStringLength = 3;
        String generatedString;
        long number;
        Random random = new Random();
        List<ProfileOfSubscriber> subscriberList = new ArrayList<>();
        List<Long> boundedListOfSubscribers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            subscriberList.add(ProfileOfSubscriber.generateSubscriber());

        }
        //System.out.println(subscriberList);

        for (ProfileOfSubscriber subscriber: subscriberList){
            int a = random.nextInt(10);
            for (int i=0; i<a; i++){
                ProfileOfSubscriber randomSubscriber= subscriberList.get(random.nextInt(subscriberList.size()));

                subscriber.setLinkedSubscribers(randomSubscriber.getPhone());



            }
            boundedListOfSubscribers.addAll(subscriber.getLinkedSubscribers());
            System.out.println(subscriber.getLinkedSubscribers());

        }
       // System.out.println(subscriberList);
       System.out.println(boundedListOfSubscribers);

        HashMap<Long, Integer> map = new HashMap<>();

        for (Long i : boundedListOfSubscribers) {
            Integer value = map.get(i);
            if (value == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++value);
            }
        }
        System.out.println(map);

        map.entrySet().stream() // https://ru.stackoverflow.com/questions/330039/Сортировка-map-по-значению-java
                .sorted(Map.Entry.<Long, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
        Long popularNumber = (Long) map.keySet().toArray()[0];
        System.out.println("\n" +popularNumber);









       /* private static ProfileOfSubscriber generateSubscriber () {

            generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            number = random.nextLong();
            ProfileOfSubscriber subscriber = new ProfileOfSubscriber(generatedString, number);
        }*/
    }
}

