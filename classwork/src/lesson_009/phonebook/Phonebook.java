package lesson_009.phonebook;


import java.util.*;

class Phonebook {

    HashMap<String, Integer> contacts = new HashMap<>();


    Phonebook() {
        this.contacts = new HashMap<>();
    }


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


    public void add(String name, int num) {

        contacts.put(name,num);

    }
    public void show() { }
    public void edit() { }
    public void delete() { }

}
