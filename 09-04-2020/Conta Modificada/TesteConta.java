package testeconta;

public class TesteConta {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.titular = "Andreia Ortiz";
        //c1.numero = 123;
        //c1.Agencia = "12345-6 ";
        //c1.saldo = 1000.00;

        Conta c2 = new Conta();
        c2.titular = "Davi";
        //c2.numero = 321;
        //c2.Agencia = "12345-7 ";
        //c2.saldo = 500;
       // c1.saca(100);
        System.out.println("A conta da titular : " + c1.titular);
        //System.out.println(" Saldo apos Sacar : " + c1.saldo);
        System.out.println("Rendimento Mensal : " + c1.calculoRendimento());

        //c2.deposita(150);
        System.out.println("A conta do titular : " + c2.titular);
        //System.out.println(" Valor Atual apos deposito :" + c2.saldo);
        System.out.println("Rendimento Mensal : " + c2.calculoRendimento());

        if (c1 == c2) {
            System.out.println("São iguais ");
        } else {
            System.out.println("Diferentes ");
        }

    }
}
