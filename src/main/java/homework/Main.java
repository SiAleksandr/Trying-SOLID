package homework;

import homework.model.User;
import homework.model.impl.Persister;
import homework.model.impl.ReportCompiler;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Bob");
        User user2 = new User("Piter");
        Persister persister = new Persister();
        persister.action(user1);
        persister.action(user2);
        ReportCompiler reportCompiler = new ReportCompiler();
        reportCompiler.action(user1);
        reportCompiler.action(user2);
    }
}