package Lesson_8;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {

    private List<String> surnames = new ArrayList<>();
    private List<String> phoneNumbers = new ArrayList<>();

    public void add(String surname, String phoneNumber) {
        surnames.add(surname);
        phoneNumbers.add(phoneNumber);
    }

    public void get(String surname) {
        List<String> phoneNumber = new ArrayList<>();
        for (int i = 0; i < surnames.size(); i++) {
            if (surnames.get(i).equals(surname)) {
                phoneNumber.add(phoneNumbers.get(i));
            }
        }
        System.out.println(phoneNumber);
    }
}
