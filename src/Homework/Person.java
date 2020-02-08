package Homework;

public class Person {

    private int age;
    private String name;
    private String nationality;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    String getNationality() {
        return nationality;
    }

    void setNationality(String nationality) {
        this.nationality = nationality;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return nationality != null ? nationality.equals(person.nationality) : person.nationality == null;

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Homework.Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
