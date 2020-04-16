 
package aula;

 
public class Aula {

    
    public static void main(String[] args) {
     
         Caneta c1 = new Caneta();
         c1.cor = "Azul";
         //c1.ponta = 0.5f;
         c1.tampar() ;
         c1.status();
         c1.rabiscar();
         
         Caneta c2 = new Caneta();
         c2.cor = "rosa";
         //c2.ponta = 0.6f;
         c2.modelo = "Lalala";
         c2.status();
         c2.destampar() ;
         c2.rabiscar();
    }
    
}
