package Les9;

import Les9.utils.Checker;

//test push
import static Les9.UserRepository.*;
import static java.lang.String.valueOf;

public class Demo {
    public static void main(String[] args) {
        /* Company company = new Company(); */
        User user = new User(10, "10", "10");
        User[] users = new User[20];
        users[1] = user;
//        System.out.println(users.length);
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(i, "test" + valueOf(i), "s_test" + valueOf(i));
        }
        System.out.println("4 user " + users[4].getName());
        System.out.println(GetUserNames(users)[6]);
        System.out.println("GetUserIds '8' " + GetUserIds(users)[8]);
        System.out.println("Find name " + getUserNameById(8, users));
        System.out.println(getUserByName("test7", users).getId());
        System.out.println("Find Session 9 " + getUserBySessionId("s_test9", users).getId());

        users[5] = null;
        users[9] = null;
        user = new User(99, "er", "id 99");
        userSave(user, users);
        System.out.println(userSave(user, users).getName());
        System.out.println(users[5].getSessionId());
        user = new User(99, "erNew", "id 99");
        update(user, users);
        System.out.println(users[5].getName());
        delete(4, users);


//        System.out.println(company.countryFounded);
//        System.out.println(company.getName());

        //   company.name ="IBM";
        //      Checker checker = new Checker();
        //      System.out.println(checker.checkCompanyName(company.name));
        //       System.out.println(checker.companyNamesValidatedCount);
        //    company.name="Google";
//        System.out.println(checker.checkCompanyName(company.name));
//        System.out.println(checker.companyNamesValidatedCount);


    }
}
