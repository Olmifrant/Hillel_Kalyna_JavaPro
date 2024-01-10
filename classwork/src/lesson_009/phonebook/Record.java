package lesson_009.phonebook;

public class Record {
    private String name;
    private String phone;

    public Record(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String[] test (){

        String[] str = new String[2];
        str[0] = name;
        str[1] = phone;
        return str;
    }
}
