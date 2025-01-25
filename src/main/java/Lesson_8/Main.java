package Lesson_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hello!");
        list.add("Name");
        list.add("Yes");
        list.add("No");
        list.add("Ball Ball");
        list.add("Sun");
        list.add("day");
        list.add("fly");
        list.add("Hello!");
        list.add("Green");
        list.add("day");
        list.add("Cat");
        list.add("No");
        list.add("Dog");
        list.add("swim");
        list.add("table");
        list.add("swim");

        Set<String> uniqueList = new HashSet<>();
        uniqueList.addAll(list);
        System.out.println(uniqueList);


        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Ivanov", "81234569899");
        phoneDirectory.add("Sidorov", "8989776698");
        phoneDirectory.add("Brown", "88756453447");
        phoneDirectory.add("Ivanov", "8123450906");
        phoneDirectory.add("Rebrov", "81234598876");

        phoneDirectory.get("Sidorov");
    }
}
