class User
{
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phoneNo;
    private final String address;
    private User(Builder b)
    {
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.age = b.age;
        this.phoneNo = b.phoneNo;
        this.address = b.address;
    }
    static class Builder
    {
        private String firstName;
        private String lastName;
        private int age;
        private String phoneNo;
        private String address;
        Builder(String fName, String lName)
        {
            firstName = fName;
            lastName = lName;
        }
        Builder age(int a)
        {
            this.age = a;
            return this;
        }
        Builder phoneNo(String pNo)
        {
            this.phoneNo = pNo;
            return this;
        }
        Builder address(String add)
        {
            this.address = add;
            return this;
        }
        public User build()
        {
            return new User(this);
        }
    }
    public String toString()
    {
        return "firstName : "+firstName+", lastName : "+lastName+", age : "+age+", phoneNo : "+phoneNo+ ", address : "+address;
    }
}
public class Cake
{
    public static void main(String[] args)
    {
        User obj1 = new User.Builder("A","S1").age(25).build();
        System.out.println(obj1);

    }
}
