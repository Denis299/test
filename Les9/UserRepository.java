package Les9;

public class UserRepository {
    User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public static String[] GetUserNames(User[] users) {
        String[] userNames = new String[users.length];

        for (int i = 0; i < users.length; i++) {
            userNames[i] = users[i].getName();
        }
        return userNames;
    }


    public static long[] GetUserIds(User[] users) {
        long[] userIds = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            userIds[i] = users[i].getId();
        }
        return userIds;

    }

    public static String getUserNameById(long id, User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (id == users[i].getId()) {
                return users[i].getName();
            }
        }
        return null;
    }

    public static User getUserByName(String name, User[] users) {
        for (int i = 0; i < users.length; i++) {
            System.out.println(name + " " + users[i].getName());
            if (name.equals(users[i].getName())) {
                return users[i];
            }
        }
        return null;
    }

    ;

    public static User findById(long id, User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (!(users[i] == null)) {
                if (id == users[i].getId()) {
                    return users[i];
                }
            }
        }
        return null;
    }

    public static User getUserBySessionId(String sessionId, User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (!(users[i] == null)) {
                if (sessionId.equals(users[i].getSessionId())) {
                    return users[i];
                }
            }
        }
        return null;
    }

    public static User userSave(User user, User[] users) {
        if (findById(user.getId(), users) == null) {
            for (int i = 0; i < users.length; i++) {
                if ((users[i] == null)) {
                    users[i] = user;
                    return users[i];
                }
            }
            return null;
        }
        return user;
    }

    public static User update(User user, User[] users) {
        if (!(findById(user.getId(), users) == null)) {
            for (int i = 0; i < users.length; i++) {
                if (user.getId() == users[i].getId()) {
                    users[i] = user;
                    return users[i];
                }
            }

        }
        return null;
    }

    public static void delete(long id, User[] users) {
        if (!(findById(id, users) == null)) {
            for (int i = 0; i < users.length; i++) {
                if (id == users[i].getId()) {
                    users[i] = null;
                    return;
                }
            }
            return;
        }
    }
}