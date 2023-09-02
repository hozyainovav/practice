package ru.mirea.it.ivbo;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        User user = new User("Иван", "", 23);
        User other = new User("Сергей", "", 20);

        User[] users = { user, other };

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        for (User value : users) {
            System.out.println(value);
        }

        switch (args[0]) {
            case "1": {
                System.out.println("One");
                break;
            }
            default: {
                System.out.println("No arg");
            }
        }

    }
}
