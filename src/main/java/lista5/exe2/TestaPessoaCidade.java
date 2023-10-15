package lista5.exe2;

public class TestaPessoaCidade {

    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();
        
        fulano.come(); //Comer
        fulano.respira();//Respirar
        fulano.vota();//Votar
        fulano.getRg();//Mostrar numero RG
        fulano.getCPF();//Mostra numero CPF
        fulano.pagaIR();//Pagar imposto de renda
        fulano.trabalha();//Trabalhar
        fulano.ensina();//Ensinar
              
        Cidade rp = new Cidade();
        
        rp.contrata(fulano); //Ensinar, Trabalhar
        rp.contrata((Empregado)fulano); //Trabalhar
        rp.cobraDe(fulano); //Pagar imposto de renda
        rp.registra(fulano); //Mostrar numero RG
        rp.alimenta(fulano); //Comer
        
        
    }
    
}
