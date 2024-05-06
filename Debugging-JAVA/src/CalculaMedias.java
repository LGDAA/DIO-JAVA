import java.util.Scanner;

public class CalculaMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Luiz", "Maria", "Joao", "Pedro"}; 
        
        double media = calcularMedia(alunos, scan);

        System.out.printf("A media da turma foi: %.2f", media);
    }


public static double calcularMedia(String[] alunos, Scanner scanner) {
    double soma = 0;
    for (String aluno:alunos){
        System.out.println("Digite a nota do aluno " + aluno +":" );
        double nota = scanner.nextDouble();
        soma += nota;
    }
        return soma/alunos.length;
    
}
}

