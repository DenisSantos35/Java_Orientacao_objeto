
package lista5.exe2;

public  class Pessoa extends Animal implements Cidadao, Contribuinte, Professor{
    
    @Override
    public void come(){
        System.out.println("Comer");
    };
    
    @Override
    public void respira(){
        System.out.println("Respirar");
    };
    
    @Override
    public void vota(){
        System.out.println("Votar");
    }
    
    @Override
    public void getRg(){
        System.out.println("Mostrar numero RG");
    }

    @Override
    public void getCPF(){
        System.out.println("Mostra numero CPF");
    };

    @Override
    public void pagaIR(){
        System.out.println("Pagar imposto de renda");
    };
    
    @Override
    public void trabalha(){
        System.out.println("Trabalhar");
    }
     @Override
     public void ensina(){
         System.out.println("Ensinar");
     }
   
}
