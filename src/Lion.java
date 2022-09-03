public class Lion extends Animal {
    private String Damage;

    public Lion(int age, String name, String damage) {
        super(age, name);
        this.Damage = damage;
    }
    public String getDamage() {
        return Damage;
    }


    @Override
    public void print() {

        System.out.println(getInfo() + Damage);
    }
}
