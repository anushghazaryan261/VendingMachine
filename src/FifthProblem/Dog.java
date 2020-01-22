package FifthProblem;

import java.util.ArrayList;
import java.util.Random;

public class Dog extends Animal{
    private String name;
    private String breed;
    private double age;

    public Dog(double age) {
        this.age = age;
    }

    public Dog() {
    }
    public Dog(String name,String breed, double age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public void makeSounds(){
        System.out.println("I am barking!!");
    }

    public void printName(){
        System.out.println("My name is: " + name);
    }
    public void giveBirthToOffspring(){
        ArrayList<Puppy> puppies=new ArrayList<>();
        Random rand=new Random();
        int random=rand.nextInt(7);
        while(random==0||random==1){
            random=rand.nextInt(7);
        }
        for(int i=1;i<random;i++){
            Puppy puppy=new Puppy();
            puppies.add(puppy);
        }
    }

}
