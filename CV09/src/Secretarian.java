public class Secretarian {
    private String nickname;
    private String email;
    private char[] password;
    private int age;

    public Secretarian(String nickname, String email, char[] password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }




    @Override
    public String toString() {
        return "Secretarian{" +
                "nickname='" + nickname + '\'' +
                ", email='" + email +
                '}';
    }
}
