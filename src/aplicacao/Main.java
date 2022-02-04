package aplicacao;

import entidades.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite a nota do 1° trimestre: ");
        aluno.setNotaTrimestre1(scanner.nextDouble());

        System.out.println("Digite a nota do 2° trimestre: ");
        aluno.setNotaTrimestre2(scanner.nextDouble());

        System.out.println("Digite a nota do 3° trimestre: ");
        aluno.setNotaTrimestre3(scanner.nextDouble());

        System.out.printf("Nota final: %.2f", aluno.notaFinal());

        if (aluno.notaFinal() >= 60) {
            System.out.println("\nO aluno está aprovado!");
        } else {
            System.out.printf("\nReprovado. Faltam %.2f pontos para aprovação", aluno.pontosFaltantes());
        }
    }
}
