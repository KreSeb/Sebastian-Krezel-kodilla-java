package Users;

        import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {

        ForumUser forumUser = new ForumUser("Ender", 5, true, "Andrew", "Carnagie", 13, "male", "ender13@outlook.com");
        System.out.println(forumUser.userPresentation());
        System.out.println(forumUser.getMail());
    }
}
