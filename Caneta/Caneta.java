 
package aula;

 
class Caneta {
     
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
    System.out.println("Uma caneta " + this.cor);
    System.out.println("Esta tampada " + this.tampada);
    System.out.println("Modelo " + this.modelo);
    System.out.println("Ponta " + this.ponta);
    System.out.println("Carga " + this.carga);
    }
    
    void rabiscar(){
    if (this.tampada == true){
        System.out.println("ERROR");
    }else{
       System.out.println("RABISCAR");
    }
      
    
    }
    void tampar(){
    this.tampada= true;
    }
    
    void destampar(){
    this.tampada= false;
    }
    
}
