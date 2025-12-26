import java.util.Scanner;

class Registro {
    private String descricao;
    private double valor;
    Scanner ler;
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void readRegister() {
        ler = new Scanner(System.in);
        System.out.print("Descricao: ");
        this.setDescricao(ler.next());
        System.out.print("Valor: ");
        this.setValor(ler.nextDouble());
    }
    
    public void showRegister() {
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Valor: " + getValor());
    }
}
