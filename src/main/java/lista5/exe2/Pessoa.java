
package lista5.exe2;

public  class Pessoa extends Animal implements Cidadao, Contribuinte, Professor{
    private int rg, cpf;
    
    @Override
    public void come(){
        System.out.println("Pessoa comeu");
    };
    
    @Override
    public void respira(){
        System.out.println("Pessoa respirou");
    };
    
    @Override
    public void vota(){
        System.out.println("Pessoa votou");
    }
    
    @Override
    public void getRg(){
        this.rg = (int) (Math.random() * 1000000000);
        System.out.println("Rg" + this.rg);
    }

    @Override
    public void getCPF(){
        this.cpf = (int) (Math.random() * 100000000);
        System.out.println("Cpf" + this.cpf);
    };

    @Override
    public void pagaIR(){
        System.out.println("Pessoa pagou o imposto de renda");
    };
    
    @Override
    public void trabalha(){
        System.out.println("Pessoa trabalhou");
    }
     @Override
     public void ensina(){
         System.out.println("Pessoa ensinou");
     }
   
}
