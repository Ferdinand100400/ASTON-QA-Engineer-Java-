package Lesson_4;


public class Person {
    private String surname;
    private String post;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Person(String surname, String post, String email, String phoneNumber, double salary, int age) {
        this.surname = surname;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void infoPerson() {
        System.out.println("фио:" + surname + "\nдолжность:" + post + "\nemail:" + email + "\nтелефон:" + phoneNumber
                + "\nзарплата:" + salary + "\nвозраст:" + age);
    }
}
