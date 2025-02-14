package interfaces;

import java.util.List;

public interface UserService {

    void createUser(UserDto user);
    void updateUser(User user);
    void deleteUser(String email);
    User getUser(String email);

    default List<User> getUsers() {
        return null;
    }
}
