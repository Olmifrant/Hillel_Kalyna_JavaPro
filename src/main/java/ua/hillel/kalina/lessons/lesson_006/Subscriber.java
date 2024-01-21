package ua.hillel.kalina.lessons.lesson_006;

public class Subscriber {
    private int id;
    private String lastName;
    private String firstName;
    private String city;
    private String phoneNumb;
    private double balanse;
    private int cityCallMin;
    private int interCityCall;
    private int traffic;
    private  int cityLimit = 200;
    private   int interCityLimit= 50;


    public Subscriber(int id, String lastName, String firstName,
                      String city, String phoneNumb, double balanse, int cityCallMin,
                      int interCityCall, int traffic) {

        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.phoneNumb = phoneNumb;
        this.balanse = balanse;
        this.cityCallMin = cityCallMin;
        this.interCityCall = interCityCall;
        this.traffic = traffic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public double getBalanse() {
        return balanse;
    }

    public void setBalanse(double balanse) {
        this.balanse = balanse;
    }

    public int getCityCallMin() {
        return cityCallMin;
    }

    public void setCityCallMin(int cityCallMin) {
        this.cityCallMin = cityCallMin;
    }

    public int getInterCityCall() {
        return interCityCall;
    }

    public void setInterCityCall(int interCityCall) {
        this.interCityCall = interCityCall;
    }

    public int getTraffic() {
        return traffic;
    }

    public void setTraffic(int traffic) {
        this.traffic = traffic;
    }

    public int getCityLimit() {
        return cityLimit;
    }

    public void setCityLimit(int cityLimit) {
        this.cityLimit = cityLimit;
    }

    public int getInterCityLimit() {
        return interCityLimit;
    }

    public void setInterCityLimit(int interCityLimit) {
        this.interCityLimit = interCityLimit;
    }

    @Override
    public String toString() {
        return "Абонент " +
                " " + id +
                ",   Фамилия:  " + lastName  +
                ",   Имя:  "  + firstName  +
                ",   Город:  " + city  +
                ",   Номер телефона:  " + phoneNumb  +
                ",   Баланс:  "  + balanse +
                ",   Городские звонки:  " + cityCallMin +
                ",   Междугородние звонки:  " + interCityCall +
                ",   Траффик:  " + traffic;

    }
}
