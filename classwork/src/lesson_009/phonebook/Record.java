package lesson_009.phonebook;

import java.util.ArrayList;
public class Record {
    private String name;
    private String phone;

    public Record(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Object[] test (){

        ArrayList<String> list = new ArrayList();
        list.add(name);
        list.add(phone);
        return new ArrayList[]{list};
    }
}
