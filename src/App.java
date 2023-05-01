import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        limpa();
        Scanner sc = new Scanner(System.in);
        Funcionario funcio = new Funcionario();
        System.out.print("Informe a quantidade de funcionários: ");
        int quantidadeFuncio = sc.nextInt();
        double somaSalario = 0;
        
        for( int i = 1; i <= quantidadeFuncio; i++){
            limpa();

            System.out.print("Informe o nome do " + i + "º funcionário: ");
            funcio.setNome(sc.next());
            System.out.print("Informe o número da matrícula do(a) funcionário(a) " + funcio.getNome() + ": ");
            funcio.setMatricula(sc.nextInt());
            System.out.print("Informe o salário do(a) funcionário(a) " + funcio.getNome() + ": R$");
            funcio.setSalario(sc.nextDouble());
        
            somaSalario += funcio.getSalario();
            limpa();
        }

        System.out.println("A média salarial é de: " + somaSalario/quantidadeFuncio);
        sc.close();
    }
    public static void limpa(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
