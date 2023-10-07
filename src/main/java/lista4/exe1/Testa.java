
package lista4.exe1;

public class Testa {
    
    public static void show(Funcionario objeto){
        System.out.println(objeto.toString());
        System.out.println(objeto.calculaSalario());
    }

    public static void main(String[] args) {
        
        Assistente objAssistente = new Assistente(5, "Denis","João Traficante", "383716", 1000);
        show(objAssistente);
        
        Gerente objGerente  = new Gerente("Marcos", "Higino Archetti", "384716", 2000, 3000);
        show(objGerente);
        
        Diretor objDiretor = new Diretor(15000, "Pedro", "Pedro Barbosa", "383718", 6000);
        show(objDiretor);
       
    }
    
}
