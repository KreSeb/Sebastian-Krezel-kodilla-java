package Users;

public class User {
    private String name, surname, sex, mail;
    private int age;

    public User(String name, String surname, int age, String sex, String mail) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.mail = mail;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getSex() {
        return this.sex;
    }

    public String getMail() {
        return this.mail;
    }

    public int getAge() {
        return this.age;
    }

    public void login() {
        System.out.println("Podaj imię i nazwisko logowania: ");
    }

    public void delAccount() {
        System.out.println("Konto zostało usunięte");
    }
}
