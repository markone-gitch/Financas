import java.util.Scanner;

class Financas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Registro[] receitas = new Registro[5];
        Registro[] despesas = new Registro[20];
        int opcao = 1;
        int qtd_receitas = 0;
        for(int i = 0; i<5; i++) {
            receitas[i] = new Registro();
        }
        int qtd_despesas = 0;
        for(int i = 0; i<20; i++) {
            despesas[i] = new Registro();
        }
        
        // Leitura dos registros de Receitas
        System.out.printf("Leitura de receitas\n\n");
        for(int i = 0; i<5; i++) {
            System.out.println("Receita n. " + (i+1));
            receitas[i].readRegister();
            qtd_receitas++;
            System.out.print("Continuar a ler registro de Receita(1-sim/2-nao): ");
            opcao = ler.nextInt();
            if(opcao == 2) break;
        }

        // Leitura dos registros de Despesas
        System.out.printf("\nLeitura de despesas\n\n");
        for(int i = 0; i<20; i++) {
            System.out.println("Despesa n. " + (i+1));
            despesas[i].readRegister();
            qtd_despesas++;
            System.out.print("Continuar a ler registro de Despesa(1-sim/2-nao): ");
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
        System.out.printf("Total de Receitas: R$ %.2f\n", totalReceitas);
        
        // Exibicao de despesas e total
        System.out.println();
        double totalDespesas = 0.0;
        for(int i = 0; i<qtd_despesas; i++) {
          System.out.println("Despesa n. " + (i+1));
          despesas[i].showRegister();
          totalDespesas += despesas[i].getValor();
        }
        System.out.println();
        System.out.printf("Total de Despesas: R$ %.2f\n", totalDespesas);
        
        System.out.println();
        double resultado = totalReceitas - totalDespesas;
        if(resultado >= 0)
            System.out.printf("Saldo credor em R$ %.2f\n", resultado);
        else System.out.printf("Saldo devedor em R$ %.2f\n", resultado);
        
        ler.close();
        
    }
}
