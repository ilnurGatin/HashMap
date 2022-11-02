import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Иван Иванов", "+79957893651");
        phoneBook.addContact("Иван Петров", "+79957893652");
        phoneBook.addContact("Иван Сидоров", "+79957893653");
        phoneBook.addContact("Иван Котов", "+79957893654");
        phoneBook.addContact("Иван Песов", "+79957893655");
        phoneBook.addContact("Иван Канарейкин", "+79957893656");
        phoneBook.addContact("Иван Смит", "+79957893657");
        phoneBook.addContact("Иван Томсон", "+79957893658");
        phoneBook.addContact("Иван Эвессон", "+79957893659");
        phoneBook.addContact("Иван Чукотов", "+79957893610");
        phoneBook.addContact("Иван Зайцев", "+79957893611");
        phoneBook.addContact("Иван Сталин", "+79957893612");
        phoneBook.addContact("Иван Ленин", "+79957893613");
        phoneBook.addContact("Иван Троцкий", "+79957893614");
        phoneBook.addContact("Иван Львов", "+79957893615");
        phoneBook.addContact("Иван Ледорубов", "+79957893616");
        phoneBook.addContact("Иван Умаров", "+79957893617");
        phoneBook.addContact("Иван Кадыров", "+79957893618");
        phoneBook.addContact("Иван Глушко", "+79957893619");
        phoneBook.addContact("Иван Александров", "+79957893620");
        phoneBook.addContact("Иван Иванченко", "+79957893621");

        System.out.println(phoneBook);

        //Task 3

        TaskThree taskThree = new TaskThree();
        taskThree.addData("два", 2);
        taskThree.addData("три", 3);
        taskThree.addData("четыре", 4);
        taskThree.addData("пять", 5);
        taskThree.addData("шесть", 6);

        System.out.println(taskThree);

        taskThree.addData("семь", 7);
        taskThree.addData("пять", 1);

        System.out.println(taskThree);

    }
}
