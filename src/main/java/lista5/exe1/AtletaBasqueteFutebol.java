
package lista5.exe1;

public class AtletaBasqueteFutebol implements JogadorBasquete, JogadorFutebol{

    @Override
    public void arremessar() {
        System.out.println("Jogador Arremessando");
    }

    @Override
    public void fazerBandeja() {
        System.out.println("Jogador fazendo bandeja");
    }

    @Override
    public void enterrar() {
        System.out.println("Jogador enterrando");
    }

    @Override
    public void fazerCera() {
        System.out.println("Jogador fazendo cera");
    }

    @Override
    public void fazerGol() {
        System.out.println("Jogador fazendo gol");
    }

    @Override
    public void baterPenalti() {
        System.out.println("Jogador batendo penalti");
    }
    
}
