public class Cat extends Animal{
    private String Damage;

    public String getDamage() {
        return Damage;
    }

    public Cat(int age, String name, String damage) {
        super(age, name);
        this.Damage = damage;
    }
    @Override
    public void print() {
        System.out.println(getInfo() + Damage);
    }
}
