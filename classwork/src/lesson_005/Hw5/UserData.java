package lesson_005.Hw5;

public class UserData {

    private final String name;
    private final String middleName;
    private String surname;
    private String jobTitle;
    private final String dayOfBirth;
    private final String monthOfBirth;
    private final int yearOfBirth;
    private  String phone;
    private String email;
    private int age;

    public UserData(String name, String middleName, String surname, String jobTitle,
                    String dayOfBirth, String monthOfBirth, int yearOfBirth,
                    String phone, String email) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.phone = phone;
        this.email = email;
        this.age = (2023 - yearOfBirth );
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printUserInfo() {

        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество; " + middleName);
        System.out.println("Должность; " + jobTitle);
        System.out.println("Дата рождения: " + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth);
        System.out.println("Возраст: " + age);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Эл.почта: " + email);
        System.out.println();

    }
}