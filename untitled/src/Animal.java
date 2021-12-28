public abstract class Animal {
    public String name;
    public int leg;

    public Animal(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    abstract void eat();

    void walk(){
        System.out.println(name+" walks with ");
    }

}
