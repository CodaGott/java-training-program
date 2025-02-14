package interfaces;

public class UserServiceImpl implements UserService {


    @Override
    public void createUser(UserDto user) {
        User u = new User();
        u.setName(user.getName());

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(String email) {

    }

    @Override
    public User getUser(String email) {
        return null;
    }
}
