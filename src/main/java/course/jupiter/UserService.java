package course.jupiter;

import course.dto.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class UserService {

    List<User> users = new ArrayList<>();

    public List<User> getAll() {
        return users;
    }

    public boolean add(User user) {
        return users.add(user);
    }

    public Optional<User> login(String userName, String password) {
        return users.stream()
                .filter(user -> user.getName().equals(userName))
                .filter(user -> user.getPassword().equals(password))
                .findFirst();
    }
}
