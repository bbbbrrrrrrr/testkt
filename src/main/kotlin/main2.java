public class main2 {
    public static void createAndPrintPerson(){
        String name = "Ben";
        Person person = new Person(name);

        System.out.println(person.getName());
    }
    public static void main(String[] args) {
         createAndPrintPerson();
    }
}
