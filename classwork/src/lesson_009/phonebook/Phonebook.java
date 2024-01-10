package lesson_009.phonebook;


import java.util.*;

class Phonebook {

    HashMap<String, String> contacts = new HashMap<>();
    {{
        contacts.put("Tony","06380842201");
        contacts.put("Ezekial", "0635318574");
        contacts.put("Marcus", "0951304574");
    }}


//    Phonebook() {
//        this.contacts = new HashMap<>();
//    }


    public void list()
    {
        if( this.contacts.isEmpty() )
        {
            System.out.println("Пусто");
        }
        else
        {
           System.out.println(contacts);

        }
    }


    public void add(String name, String num) {

        contacts.put(name,num);

    }
    public void show() { }
    public void edit() { }
    public void delete() { }

}
