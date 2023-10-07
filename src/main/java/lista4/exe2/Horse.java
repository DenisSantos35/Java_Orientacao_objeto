
package lista4.exe2;


public final class Horse extends Animal{
    private boolean competitor;

    public Horse() {
    }

    public Horse(String name, float number, boolean competitor) {
        super(name, number);
        this.setCompetitor(competitor);
    }

    public boolean isCompetitor() {
        return competitor;
    }

    public final void setCompetitor(boolean competitor) {
        this.competitor = competitor;
    }

    @Override
    public String toString() {
        return "Horse{" + "competitor=" + competitor + super.toString() + '}';
       
    }
    
    @Override
    public  String move(){
        return "Trots";
    }
       
}
