package ua.hillel.kalina.lessons.lesson_005.Hw5;

public class Employee {

    public static void main(String[] args) {

        UserData person1 = new UserData("Леонид", "Макарович", "Кравчук",
                "Президент Украины", "10", "01", 1934
                , "+30500000001", "number1@mail.com");
        UserData person2 = new UserData("Леонид", "Данилович", "Кучма",
                "Президент Украины", "09", "08", 1938,
                "+380500000002", "number2@mail.com");
        UserData person3 = new UserData("Виктор", "Андреевич", "Ющенко",
                "Президент Украины", "23", "02", 1954,
                "+380500000003", "nummer3@mail.com");
        UserData person4 = new UserData("Виктор", "Фёдорович", "Янукович",
                "Президент Украины", "09", "07", 1950,
                "+38050000004", "nummer4@mail.com");
        UserData person5 = new UserData("Пётр", "Алексеевич", "Порошенко",
                "Президент Украины", "26", "09", 1965,
                "+380500000005", "nummer5@Mail.com");

        System.out.println();

        person1.printUserInfo();
        person2.printUserInfo();
        person3.printUserInfo();
        person4.printUserInfo();
        person5.printUserInfo();

        System.out.println("Сотрудник " + person4.getName() + " " + person4.getMiddleName()
        + " " + person4.getSurname() + " изменил(а) свои данные ");

        person4.setJobTitle("Водитель такси");
        person4.setPhone("+78450412579");

        System.out.println("Новые данные сотрудника");
        person4.printUserInfo();


    }
}
