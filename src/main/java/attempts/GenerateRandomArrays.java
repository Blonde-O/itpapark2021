package attempts;

import java.util.*;

public class GenerateRandomArrays {
    public static void main(String[] args) {
        int n = 5;
        int [] array = new int [n];
        Random random = new Random();
        List<int[]> listOfBoundedContacts = new ArrayList<>();

        for (int i =0; i< array.length; i++){
            int m = random.nextInt(100000)+99000;
            array[i] = m;
        }
        System.out.println(Arrays.toString(array)+ "\n");

        for (int i=0; i<n; i++){
            int a = random.nextInt(n);
            int [] randomArray = new int [a];
            for (int j=0; j< randomArray.length; j++){
                int b= random.nextInt(a);
                randomArray[j]= array[b];
            }
            listOfBoundedContacts.add(randomArray);
            System.out.println(Arrays.toString(randomArray));

        }
        System.out.println("------------------");
        //System.out.println(listOfBoundedContacts);

        ListIterator<int[]> interating = listOfBoundedContacts.listIterator();
        /*while (interating.hasNext()){
            System.out.println(listOfBoundedContacts);
        }*/

        Object[] unitedArray = listOfBoundedContacts.toArray();

        for (int i=0; i< unitedArray.length; i++){
            System.out.println(unitedArray[i]);
        }



    }


}
