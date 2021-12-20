package lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        int leftLimit = 1040; // letter 'a'
        int rightLimit = 1103; // letter 'z'
        int targetStringLength = 3;
        String generatedString;
        long number;
        Random random = new Random();
        List<ProfileOfSubscriber> subscriberList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            subscriberList.add(ProfileOfSubscriber.generateSubscriber());

        }
        //System.out.println(subscriberList);

        for (ProfileOfSubscriber subscriber: subscriberList){
            int a = random.nextInt(10);
            for (int i=0; i<a; i++){
                ProfileOfSubscriber randomSubscriber= subscriberList.get(random.nextInt(subscriberList.size()));

                subscriber.setLinkedSubscribers(randomSubscriber.getPhone());


            }
            System.out.println(subscriber.getLinkedSubscribers());
        }
       // System.out.println(subscriberList);





       /* private static ProfileOfSubscriber generateSubscriber () {

            generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            number = random.nextLong();
            ProfileOfSubscriber subscriber = new ProfileOfSubscriber(generatedString, number);
        }*/
    }
}

