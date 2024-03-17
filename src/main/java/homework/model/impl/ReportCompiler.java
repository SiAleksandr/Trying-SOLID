package homework.model.impl;

import homework.model.User;
import homework.model.UserService;
public class ReportCompiler implements UserService{

    @Override
    public void action(User u) {
        System.out.println("Report for user: " + u.getName());
    }
}
