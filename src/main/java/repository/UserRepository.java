package repository;

import dto.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    List<User> userList = new ArrayList<>();

    public UserRepository() {
        userList.add(new User("user","1234"));
        userList.add(new User("admin","1234"));
    }

    public List<User> getUserList() {
        return userList;
    }


}
