package lesson14;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        int leftLimit = 1040; // letter 'a'
        int rightLimit = 1103; // letter 'z'
        int targetStringLength = 3;
        String generatedString;
        long number;
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        List<ProfileOfSubscriber> subscriberList = new ArrayList<>();
        List <Long> boundedContacts = new ArrayList<>();
        for (int i = 0; i < 3000; i++) {
            subscriberList.add(ProfileOfSubscriber.generateSubscriber());

        }
        //System.out.println(subscriberList);

        for (ProfileOfSubscriber subscriber: subscriberList){
            int a = random.nextInt(500);
            for (int i=0; i<a; i++){
                ProfileOfSubscriber randomSubscriber= subscriberList.get(random.nextInt(subscriberList.size()));

                subscriber.setLinkedSubscribers(randomSubscriber.getPhone());


            }
            //System.out.println(subscriber.getLinkedSubscribers());
            boundedContacts.addAll(subscriber.getLinkedSubscribers());
        }
/*        System.out.println("_____________");
        System.out.println(boundedContacts);
        System.out.println("_____________");
  */      // System.out.println(subscriberList);
        Set<Long> unique = new HashSet<>(boundedContacts);
        long b=1;
        for(Long x: unique){
            if(Collections.frequency(boundedContacts, x)>b){
                b=Collections.frequency(boundedContacts, x);}
               // System.out.println("Число " + x + ": " +Collections.frequency(boundedContacts, x));



        }
        //System.out.println(b);
        for(Long x: unique){

            if(Collections.frequency(boundedContacts, x)==b){
                System.out.println("Наиболее популярный номер +7" + x + " повторяется " +Collections.frequency(boundedContacts, x)+ " раз");
            }


        }






       /* private static ProfileOfSubscriber generateSubscriber () {
            generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            number = random.nextLong();
            ProfileOfSubscriber subscriber = new ProfileOfSubscriber(generatedString, number);
        }*/
        double time = (double)(System.currentTimeMillis() - startTime)/1000;
        System.out.println("Время выполнения программы " +time+ " секунд.");
    }
}
