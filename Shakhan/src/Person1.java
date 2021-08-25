public class Person1 {
    private String name;
    private int age;
    private Address address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person1() {
        this.name = "Tamim";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student1 st = new Student1();
        st.print();

    }
}

class Student1 extends Person1 {
    public void print(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getAddress().postcode);
        System.out.println(getAddress().city);
    }
}

class Address{
    int postcode;
    String city;
}

class Item{

}