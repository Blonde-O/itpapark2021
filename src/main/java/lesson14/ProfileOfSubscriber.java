package lesson14;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class ProfileOfSubscriber {

    private final String fio;
    private final long phone;
    private Set<Long> linkedSubscribers = new HashSet<Long>();
    static int leftLimit = 1040; // letter 'a'
    static int rightLimit = 1064; // letter 'z'
    static int targetStringLength = 3;
    static Random random = new Random();

    public ProfileOfSubscriber(String fio, long phone) {
        this.fio = fio;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public void setLinkedSubscribers(long phone) {
        linkedSubscribers.add(phone);
    }

    public long getPhone() {
        return phone;
    }

    public Set<Long> getLinkedSubscribers() {
        return linkedSubscribers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileOfSubscriber that = (ProfileOfSubscriber) o;
        return phone == that.phone && Objects.equals(fio, that.fio) && Objects.equals(linkedSubscribers, that.linkedSubscribers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, phone);
    }

    public static ProfileOfSubscriber generateSubscriber() {

            String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            long number = (random.nextInt(99999998))+9040000001L;
            ProfileOfSubscriber subscriber = new ProfileOfSubscriber(generatedString, number);
        return subscriber;
    }

    @Override
    public String toString() {
        return "ProfileOfSubscriber{" +
                "fio='" + fio + '\'' +
                ", phone=" + phone +
                ", linkedSubscribers=" + linkedSubscribers +
                '}';
    }
}
