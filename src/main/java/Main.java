public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 5;
        post.birthday.year = 1997;

    }
}
