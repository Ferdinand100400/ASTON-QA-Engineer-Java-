package Lesson_8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hello!");
        list.add("Name");
        list.add("Yes");
        list.add("No");
        list.add("Ball Ball");
        list.add("No");
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
        list.add("day");
        list.add("day");
        list.add("swim");

        HashMap<String, Integer> nonUniqueMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    list.remove(j);
                    j--;
                    nonUniqueMap.put(list.get(i), count);
                }
            }
        }

        for (Map.Entry<String, Integer> map : nonUniqueMap.entrySet()) {
            list.remove(map.getKey());
            System.out.println("Кол-во повторений слова " + map.getKey() + ": " + map.getValue());
        }

        System.out.print("Слова без повторений: ");
        System.out.print(list);
        System.out.println("\n");


        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Ivanov", "81234569899");
        phoneDirectory.add("Sidorov", "8989776698");
        phoneDirectory.add("Brown", "88756453447");
        phoneDirectory.add("Ivanov", "8123450906");
        phoneDirectory.add("Rebrov", "81234598876");

        phoneDirectory.get("Sidorov");
    }
}
