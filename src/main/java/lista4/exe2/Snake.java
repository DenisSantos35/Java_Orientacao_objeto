
package lista4.exe2;

public final class Snake extends Animal {
    
    private boolean poisonous, smoke;
    
    public Snake() {
        super();
    }

    public Snake(boolean smoke,boolean poisonous, String name, float number) {
        super(name, number);
        this.setPoisonous(poisonous);
        this.setSmoke(smoke);
    }

    public boolean isPoisonous() {
        return this.poisonous;
    }

    public final void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public boolean isSmoke() {
        return this.smoke;
    }

    public final void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }

    @Override
    public String toString() {
        return "Snake{" + "poisonous=" + poisonous + ", smoke=" + smoke + super.toString() +  '}';
    }
    
    @Override
    public String move(){
        return "Slithering";
    }
     
}
