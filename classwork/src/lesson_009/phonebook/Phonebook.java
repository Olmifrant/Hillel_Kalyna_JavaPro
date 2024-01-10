package lesson_009.phonebook;

import java.util.*;
class Phonebook {

    List<String> contacts = new ArrayList<>();

    {
        {
            contacts.add("Tony 06380842201");
            contacts.add("Ezekiel 0635318574");
            contacts.add("Marcus 0951304574");
            contacts.add("Ali 0638084228");
            contacts.add("Ali 0685217485");
            contacts.add("Ali 0951304585");
        }
    }

    public List list() {

        if (this.contacts.isEmpty()) {
        }
        return contacts;
    }

    public void add(String name, String phone) {

        Record record = new Record(name, phone);

        contacts.add(Arrays.toString(record.test()));
    }

    public List find(String name) {

        String[] arr = new String[contacts.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = contacts.get(i);
        }

        List list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toString().contains(name.toString())) {

                list.add(arr[i]);
                //System.out.println(arr[i]);
                break;
            }
        }
        return list;
    }

    public List findAll(String name) {

        String[] arr = new String[contacts.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = contacts.get(i);
        }

        List list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toString().contains(name.toString())) {
                list.add(arr[i]);

            }
        }
      return list;
    }

}
