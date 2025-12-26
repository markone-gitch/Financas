import java.util.Scanner;

class Financas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Registro[] receitas = new Registro[5];
        int opcao = 1;
        int qtd_receitas = 0;
        for(int i = 0; i<5; i++) {
            receitas[i] = new Registro();
        }
        
        // Leitura dos registros de Receitas
        for(int i = 0; i<5; i++) {
            receitas[i].readRegister();
            qtd_receitas++;
            System.out.print("Continuar a ler registro de Receita(1-sim/2-nao): ");
            opcao = ler.nextInt();
            if(opcao == 2) break;
        }
        
        // Exibicao de receitas e total
        System.out.println();
        double totalReceitas = 0.0;
        for(int i = 0; i<qtd_receitas; i++) {
          System.out.println("Receita n. " + (i+1));
          receitas[i].showRegister();
          totalReceitas += receitas[i].getValor();
        }
        System.out.println();
        System.out.println("Total de Receitas: " + totalReceitas);
        
        ler.close();
        
    }
}
