public class Person {
    private String name;
    private int age;
    private String profession;


    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Name: " + name  +
                ", age: " + age +
                ", profession: " + profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
