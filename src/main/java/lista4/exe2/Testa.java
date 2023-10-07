
package lista4.exe2;

public class Testa {

    public static void mostra(Animal objeto){
        System.out.println(objeto.move());
        System.out.println(objeto.toString());
        
    }
    public static void main(String[] args) {
        
        Snake obj3 = new Snake(true, false,"Naja", 3);
        mostra(obj3);
        Horse obj2 = new Horse("Pé de pano", 6, true);
        mostra(obj2);        
    }
    
}
