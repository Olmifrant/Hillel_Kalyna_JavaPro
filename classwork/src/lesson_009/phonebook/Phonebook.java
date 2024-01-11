package lesson_009.phonebook;

import java.util.*;
class Phonebook {

    List<String> contacts = new ArrayList<>();

    {
        {
            contacts.add("Tony 06380842201");
            contacts.add("Ezekiel 0635318574");
            contacts.add("Marcus 0951304574");
            contacts.add("Marcus 0501254785");
            contacts.add("Ali 0638084228");
            contacts.add("Ali 0685217485");
            contacts.add("Ali 0951304585");
        }
    }

    public List list() {

        return contacts;
    }

    public void add(String name, String phone) {

        Record record = new Record(name, phone);

        contacts.add(Arrays.toString(record.test()));
    }

    public List find(String name) {

        List list = new ArrayList();

        for (String st : contacts){
            if (st.toUpperCase().contains(name.toUpperCase())){
                list.add(st);
                break;
            }
        }
        return list;
    }

    public List findAll(String name) {

        List list = new ArrayList();

        for (String st : contacts){
            if (st.toUpperCase().contains(name.toUpperCase())){
                list.add(st);
            }
        }
      return list;
    }

}
