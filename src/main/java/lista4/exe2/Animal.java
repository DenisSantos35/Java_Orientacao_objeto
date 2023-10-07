
package lista4.exe2;

public abstract class Animal {    
    protected String name;
    protected float age;

    public Animal() {
    }

    public Animal(String name, float age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public final void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", number=" + age + '}';
    }
    
    public abstract String move();
    
    
    
}
