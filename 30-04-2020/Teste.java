package teste;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto P1[] = new Produto[10];
        
        P1[0] = new Produto(123, 35f, "Camiseta");
        P1[1] = new Produto(123, 35f, "Calça");
        P1[2] = new Produto(123, 35f, "Shorts");
        P1[3] = new Produto(123, 35f, "meia");
        P1[4] = new Produto(123, 35f, "Moletom");
        P1[5] = new Produto(123, 35f, "Jaqueta");
        P1[6] = new Produto(123, 35f, "Regata");
        P1[7] = new Produto(123, 35f, "Celular");
        P1[8] = new Produto(123, 35f, "Computador");
        P1[9] = new Produto(123, 35f, "Tablet");
        System.out.print("-----------Produto--------------\n");
        
        P1[9].ImprimiProduto();
        
         
        
        Pedidos p1 = new Pedidos();
        
          p1.ImprimiPedidos(); 
        
         
        //Menu
        
        Scanner menu = new Scanner(System.in);
        while (true) {
            System.out.print("|----------------------------------|\n");
            System.out.print("|       Menu de opções:            |\n");
            System.out.print("| 1 - Adicionar item ao pedido.    |\n");
            System.out.print("| 2 - Apresentar o total do pedido.|\n");
            System.out.print("| 3 - Sair                         |\n");
            System.out.print("|Escolha:                          |\n");
            System.out.print("|----------------------------------|\n");

            int opcao = menu.nextInt();

            if (opcao == 3) {
                System.out.print(" Até logo!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nAdicionar item ao pedido");
                    break;

                case 2:
                    System.out.print("\nApresentar o total do pedido.\n");
                    break;

                case 3:
                    System.out.print("\nSair \n");

                    break;
               default:
                    System.out.println("Opção invalida");

                 
            }
        }
    }
}
