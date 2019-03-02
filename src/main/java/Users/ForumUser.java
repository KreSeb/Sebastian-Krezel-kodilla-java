package Users;

public class ForumUser extends User {
    private String userName;
    private int postsNumner;
    private boolean checkLogin;

    public ForumUser(String userName, int postsNumner, boolean checkLogin, String name, String surname, int age, String sex, String mail) {
        super(name, surname, age, sex, mail);
        this.userName = userName;
        this.postsNumner = postsNumner;
        this.checkLogin = checkLogin;
    }

    public void postPublic() {
        System.out.println("Właśnie opublikowałeś swój " + this.postsNumner + 1 + "post");
    }

    public void postComment() {
        System.out.println("Skomentowałeś post innego użytkownika");
    }

    public String userPresentation() {
        String userData = "Użytkownik: " + getName() + " " + getSurname() + ", Nick: " + userName;
        return userData;
    }


}
