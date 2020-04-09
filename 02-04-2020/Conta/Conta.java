 
package testeconta;

 
class Conta {
    String titular;
    int numero;
    String Agencia;
    double saldo;
    Data dataDeAbertura;
    
    
   boolean saca(double valor){
     if (this.saldo > valor) {
            this.saldo -= valor;
            return true;
        }
         return false;
    }
    void deposita(double valor){
     this.saldo += valor;
    }
     double calculoRendimento(){
        this.saldo = this.saldo*0.1;  
         return this.saldo;
      }
        String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.titular;
             dados += "\nNúmero: " + this.numero;
             return dados;
    }
     
     
}
