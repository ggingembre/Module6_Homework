package Tasks4_5_6;

import java.util.Arrays;

/**
 * Created by Guillaume Gingembre on 06/03/2017.
 */
public final class UserUtils {

        /* a util class:
    takes no variable;
    cannot be inherited from, so is final;
    we cannot create it, so it has a private constructor;
    contains only static methods;
     */

    // private constructor


    private UserUtils() {}

    // static methods

    public static User[] uniqueUsers(User[] users){

        for (int i = 0; i < users.length; i++) {
            for (int j = i+1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    users = delete(users,j);
                }
            }
        }
        return users;
    }

    public static User[] delete(User [] users, int i){

        User[] copy = new User[users.length-1];
        System.arraycopy(users, 0, copy, 0, i);
        System.arraycopy(users, i+1, copy, i, users.length-i-1);
        return copy;
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance){
        User[] matchingUsers = new User[0];
        int end = users.length;
        for (int i = 0; i < end; i++){
            if (users[i].getBalance() == balance){
                matchingUsers = Arrays.copyOf(matchingUsers, matchingUsers.length + 1);
                matchingUsers [matchingUsers.length-1] = users[i];
            }
        }
    return matchingUsers;
    }

    public static User[]  paySalaryToUsers(User[] users){
        User[] paidUsers = new User[users.length];
        for (int i = 0; i < users.length; i++){
            // create new instance of users, as user is immutable (why make it immutable, if fields change regularly??)
            User paidUser = new User(users[i].getId(),users[i].getFirstName(), users[i].getLastName(),
                    users[i].getSalary(), users[i].getBalance() + users[i].getSalary());
            paidUsers[i] = paidUser;
        }
        return paidUsers;
    }

    public static long[] getUsersId(User[] users){
        long[] userIDs = new long[users.length];
        for (int i = 0; i < users.length; i++){
            userIDs[i] = users[i].getId();
        }
        return userIDs;
    }

    public static User[] deleteEmptyUsers(User[] users){
        for (int i = 0; i < users.length; i++){
            if (users[i] == null){
                users = delete(users,i);
            }
        }
        return users;

        //for (User user : users){
        //    if (user == null){
        //        users = delete(users,i);
        //    }
        //}

    }
}
