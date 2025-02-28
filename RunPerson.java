public class RunPerson{
    public static void main(String[] args) {
        Person per1 = new Person("Anna", 20, "student");
        Person per2 = new Person("Alex", 35, "Java developer");
        Person per3 = new Person("Mila", 35, "doctor");


        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);

        System.out.println();

        per2.setProfession("Project manager");
        System.out.println("After changing profession");
        System.out.println(per2);
    }
}
