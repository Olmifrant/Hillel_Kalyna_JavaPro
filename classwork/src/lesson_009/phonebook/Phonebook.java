package lesson_009.phonebook;

import java.util.*;
class Phonebook {

    List<String> contacts = new ArrayList<>();

    {
        {
            contacts.add("Tony 06380842201");
            contacts.add("Ezekial 0635318574");
            contacts.add("Marcus 0951304574");
            contacts.add("Ali 0638084228");
            contacts.add("Ali 0685217485");
        }
    }

    public void list() {

        if (this.contacts.isEmpty()) {
            System.out.println("Справочник пуст");
        } else {
          System.out.println(contacts);
        }
    }

    public void add(String name, String phone) {

        Record record = new Record(name, phone);

        contacts.add(Arrays.toString(record.test()));
    }

    public void find(String name) {

        String[] arr = new String[contacts.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = contacts.get(i);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toString().contains(name.toString())) {
                System.out.println(arr[i]);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("В справочнике нет таких контактов");
        }
    }


    public void findAll(String name) {

        String[] arr = new String[contacts.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = contacts.get(i);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toString().contains(name.toString())) {
                System.out.println(arr[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В справочнике нет таких контактов");
        } else {
            System.out.println("Всего найдено " + count + " контаков");
        }
    }

}
