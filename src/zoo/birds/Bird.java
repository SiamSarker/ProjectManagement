package zoo.birds;

import zoo.Animal;


class Bird extends Animal {
    String color;

    Bird(String name, int legs, String color){
        super(name, legs);
        this.color = color;
    }

    void print(){
        System.out.println(name + " " + legs + " " + color);
    }
}
