package methods2_0;

public interface UserInterface {

    void name(String name);

    void email(String email);

    default int age(int age) {
        return age;
    }
}
