
package lista4.exe1;

public final class Assistente extends Funcionario{
    
    private float horaExtra;

    public Assistente() {
        super();
    }

    public Assistente(float horaExtra, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario);      
        this.setHoraExtra(horaExtra);
    }  

    public float getHoraExtra() {
        return horaExtra;
    }

    public final void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }
    
    @Override
    public  float calculaSalario(){
        return this.salario + ((this.salario * 10)/100);
    };

    @Override
    public String toString() {
        return "Assistente{" + "horaExtra=" + horaExtra + super.toString() + '}';
    }
    
    
}
