package Tasks4_5_6;

import java.util.Arrays;

/**
 * Created by Guillaume Gingembre on 07/03/2017.
 */
public class UsersMain {

    public static void main(String[] args) {
        User testUser1, testUser2, testUser3, testUser4, testUser5;
        User[] testUserArray = new User[5];

        // creating test users
        testUser1 = new User(111, "Elena", "Izotova", 1000, 5000);
        testUser2 = new User (112, "Guillaume", "Gingembre", 1000,2000);
        testUser3 = new User(111, "Elena", "Izotova", 1000, 5000);
        testUser4 = new User(113, "Charles", "Galant", 800, 2000);
        testUser5 = new User(114, "Franck", "Mbunto", 500, 500);

        // Populate array
        testUserArray[0] = testUser1;
        testUserArray[1] = testUser2;
        testUserArray[2] = testUser3;
        testUserArray[3] = testUser4;
        testUserArray[4] = testUser5;

        // test unique user

        User [] uniqueUsers;
        uniqueUsers = UserUtils.uniqueUsers(testUserArray);

        System.out.println("The length of the array before running the function is: " + testUserArray.length + "\n");
        for (int i = 0; i < uniqueUsers.length; i++){
            System.out.println(uniqueUsers[i]);
        }
        System.out.println("UniqueUsers method successfully tested, the new length of the array is " + uniqueUsers.length +"\n" );

        // test User[] usersWithConditionalBalance(User[] users, int balance)
        User[] conditionalUsers;
        int condBalance = 1000;
        conditionalUsers = UserUtils.usersWithConditionalBalance(testUserArray,condBalance);

        if (conditionalUsers.length == 0) {
            System.out.println("There is no user with a balance of " + condBalance + "\n");
        }else{
            System.out.println("Users with a balance of " + condBalance + ": \n");
            for (int i = 0; i < conditionalUsers.length; i++){
                System.out.println(conditionalUsers[i]);
            }
        }

        condBalance = 2000;
        conditionalUsers = UserUtils.usersWithConditionalBalance(testUserArray,condBalance);

        if (conditionalUsers.length == 0) {
            System.out.println("There is no user with a balance of " + condBalance + "\n");
        }else{
            System.out.println("Users with a balance of " + condBalance + ": \n");
            for (int i = 0; i < conditionalUsers.length; i++){
                System.out.println(conditionalUsers[i]);
            }
        }

        System.out.println("ConditionalBalance method successfully tested. Now testing paySalary method. \n");

        // method User[]  paySalaryToUsers(User[] users)

        User[] paidUsers;
        paidUsers = UserUtils.paySalaryToUsers(testUserArray);
        for (int i = 0; i < paidUsers.length; i++){
            System.out.println(paidUsers[i]);
        }

        System.out.println("PaySalary method successfully tested. Now testing getUsersId. \n");

        long[] userIDs;
        userIDs = UserUtils.getUsersId(testUserArray);
        for (int i = 0; i < userIDs.length; i++){
            System.out.println(userIDs[i]);
        }

        System.out.println("getUsersID method successfully tested. Now testing deleteEmptyUsers. \n");

        // testing deleteEmptyUsers

        User[] testLongArray = new User[10];
        testLongArray[1] = testUser1;
        testLongArray[3] = testUser2;
        testLongArray[5] = testUser3;
        testLongArray[7] = testUser4;
        testLongArray[9] = testUser5;

        System.out.println("Before running method: " + Arrays.toString(testLongArray));

        User[] cleanArray;
        cleanArray = UserUtils.deleteEmptyUsers(testLongArray);

        System.out.println("After running method: " + Arrays.toString(cleanArray));




    }
}
