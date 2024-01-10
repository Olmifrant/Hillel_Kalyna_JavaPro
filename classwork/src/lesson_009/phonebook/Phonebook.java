package lesson_009.phonebook;

import java.util.*;
class Phonebook {

    List<String> contacts = new ArrayList<>();
//    {{
//        contacts.add("Tony 06380842201");
//        contacts.add("Ezekial 0635318574");
//        contacts.add("Marcus 0951304574");
//
//    }}


    public void list()
    {
        if( this.contacts.isEmpty() )
        {
            System.out.println("Пусто");
        }
        else
        {
           //System.out.println(contacts);

           String[] arr = new String[contacts.size()];
           //System.out.println(lis);

            for (int i = 0; i <arr.length ; i++) {
                arr[i] = contacts.get(i);

            }
            System.out.println(Arrays.toString(arr));

        }
    }

    //Record record = new Record();
    public void add(String name, String phone) {

        Record record = new Record(name,phone);
        //System.out.println(Arrays.toString(record.test()));

        contacts.add(Arrays.toString(record.test()));

    }

    public void show(String name) {





    }
    public void edit() { }
    public void delete() { }

}
