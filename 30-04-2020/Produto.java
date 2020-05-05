 
package teste;
 
public class Produto {
   
   // Atributos
    
    private int codigo;
    private float valor;
    private String descriçao;
    
    // Metodos 

    public Produto(int codigo, float valor, String descriçao) {
        this.codigo = codigo;
        this.valor = valor;
        this.descriçao = descriçao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }
    public void ImprimiProduto(){
       System.out.println("Codigo : " + codigo);
       System.out.println("Valor : " + valor);
       System.out.println("Descrição : " + descriçao);
    }
    
     
}
