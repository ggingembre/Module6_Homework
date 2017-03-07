package Tasks4_5_6;

/**
 * Created by Guillaume Gingembre on 06/03/2017.
 */
public final class User { // class is immutable, so made it final

    private long id;
    private String firstName;
    private String lastName;
    private int salary;
    private int balance;

    // constructor with all fields

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    // override print and equals methods

    @Override
    public String toString() {
        return "User id: " + id + "\nFirst name: " + firstName + "\nLast name: " + lastName + "\nSalary: " +
                salary + "\nBalance: " + balance + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (salary != user.salary) return false;
        if (balance != user.balance) return false;
        if (!firstName.equals(user.firstName)) return false;
        return lastName.equals(user.lastName);
    }

    // get and set methods

    // class immutable, so no set methods

    public long getId() {
        return id;
    }

    ////public void setId(long id) {
    //    this.id = id;
    //}

    public String getFirstName() {
        return firstName;
    }

    //public void setFirstName(String firstName) {
    //    this.firstName = firstName;
    //}

    public String getLastName() {
        return lastName;
    }

    //public void setLastName(String lastName) {
    //    this.lastName = lastName;
    //}

    public int getSalary() {
        return salary;
    }

    //public void setSalary(int salary) {
    //    this.salary = salary;
    //}

    public int getBalance() {
        return balance;
    }

    //public void setBalance(int balance) {
    //    this.balance = balance;
    //}
}
