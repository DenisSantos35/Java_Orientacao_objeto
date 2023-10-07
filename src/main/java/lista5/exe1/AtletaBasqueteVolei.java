
package lista5.exe1;

public class AtletaBasqueteVolei implements JogadorBasquete, JogadoVolei{

    @Override
    public void arremessar() {
            System.out.println("Atleta arremessando");
    }

    @Override
    public void fazerBandeja() {
        System.out.println("Atleta fazendo bandeja");
    }

    @Override
    public void enterrar() {
        System.out.println("Atleta enterrando");
    }

    @Override
    public void sacar() {
        System.out.println("Atleta sacando");
    }

    @Override
    public void rodizio() {
        System.out.println("Atleta fazendo rodizio");
    }

    @Override
    public void cortar() {
        System.out.println("Atleta cortando");
    }
    
}
