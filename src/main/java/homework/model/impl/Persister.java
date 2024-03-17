package homework.model.impl;

import homework.model.User;
import homework.model.UserService;

public class Persister implements UserService {
    @Override
    public void action(User u) {
        System.out.println("Save user: " + u.getName());
    }
}
