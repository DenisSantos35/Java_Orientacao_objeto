
package lista4.exe1;

public final class Gerente extends Funcionario {
    private float bonus;
    
    public Gerente(){
        super();
    }
    
    public Gerente(String nome, String endereco, String cpf, float salario, float bonus){
        super(nome, endereco, cpf, salario);
        this.setBonus(bonus);        
    }
    
    public final void setBonus(float bonus){
        this.bonus = bonus;
    }
    
    public float getBonus(){
        return this.bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonus=" + bonus + super.toString() +'}';
    }
    
    @Override
    public  float calculaSalario(){
        return this.salario + this.bonus;
    };
    
    
    
    
}
