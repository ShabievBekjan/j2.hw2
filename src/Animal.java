public class Animal implements Printable{

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;
    @Override
    public void print() {
    }
    public String getInfo() {
        return "Age: " + age +
                "\nName: " + name;
    }

}
