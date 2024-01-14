package lesson_009.phonebook;

import java.util.ArrayList;
public class Record {
    private String name;
    private int  phone;

    public Record(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        return "Entry{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phone +
                '}';
    }



//    public Object[] test (){
//
//        ArrayList<String> list = new ArrayList();
//        list.add(name);
//        list.add(phone);
//        return new ArrayList[]{list};
//    }
}
