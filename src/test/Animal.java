
package test;


public class Animal {
    
    protected String name;
    protected String type;
    protected int age;
    protected double weight;
    protected boolean fly;
    protected int id;
    static protected int n = 1;
    
    {
        this.name = "No name";
        this.type = "No type";
        this.fly = false;  
        this.id = n++;
    }

    public Animal() {
    }

    public Animal(String name, String type, int age, double weight, boolean fly) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        this.fly = fly;
    }
    

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", type=" + type + ", age=" + age + ", weight=" + weight + ", fly=" + fly + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }
    
    public void showId(){
        System.out.println(this.id);
    }
    
    
}
