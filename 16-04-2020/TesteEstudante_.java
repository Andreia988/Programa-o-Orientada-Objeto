 
package testeestudante_;

import java.util.Scanner;

 
public class TesteEstudante_ {

     
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        Estudante f1 = new Estudante(1, "Andreia Ortiz");
        
        System.out.println("Código: " + f1.getCodigo());
        System.out.println("Nome: " + f1.getNome());  
        
        f1.setNotas(6,7,10);
        
        System.out.printf("Media: %.1f \n", f1.calculaMedia());
        System.out.printf("Media ponto extra: %.1f \n", f1.calculaMedia(1));
        
    }
    
}
         
   

    
 
