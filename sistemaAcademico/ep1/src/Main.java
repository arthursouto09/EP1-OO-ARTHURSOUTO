//package aluno;
import aluno.Aluno;
import aluno.AlunoNormal;
import materia.Disciplina;
import materia.Nota;
//package materia;

import aluno.Aluno;
import aluno.AlunoNormal;
import materia.Disciplina;
import materia.Nota;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = null;
        Disciplina disciplina = null;
        Nota nota = null;

        while (true) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Disciplina");
            System.out.println("3. Cadastrar Nota");
            System.out.println("4. Mostrar Dados do Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    aluno = new AlunoNormal(nome, matricula, curso);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome da disciplina: ");
                    String nomeDisc = scanner.nextLine();
                    System.out.print("Código da disciplina: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Total de aulas: ");
                    int totalAulas = scanner.nextInt();
                    scanner.nextLine();
                    disciplina = new Disciplina(nomeDisc, codigo, totalAulas);
                    System.out.println("Disciplina cadastrada com sucesso!");
                    break;
                case 3:
                    System.out.print("Nota P1: ");
                    double p1 = scanner.nextDouble();
                    System.out.print("Nota P2: ");
                    double p2 = scanner.nextDouble();
                    System.out.print("Nota P3: ");
                    double p3 = scanner.nextDouble();
                    System.out.print("Nota Atividades: ");
                    double atividades = scanner.nextDouble();
                    System.out.print("Nota Trabalhos: ");
                    double trabalhos = scanner.nextDouble();
                    scanner.nextLine();
                    nota = new Nota(p1, p2, p3, atividades, trabalhos);
                    System.out.println("Notas cadastradas com sucesso!");
                    break;
                case 4:
                    if (aluno != null) {
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("Matrícula: " + aluno.getMatricula());
                        System.out.println("Curso: " + aluno.getCurso());
                    } else {
                        System.out.println("Nenhum aluno cadastrado.");
                    }
                    if (disciplina != null) {
                        System.out.println("Disciplina: " + disciplina.getNome());
                        System.out.println("Código: " + disciplina.getCodigo());
                        System.out.println("Total de aulas: " + disciplina.getTotalAulas());
                    }
                    if (nota != null) {
                        System.out.println("Média Simples: " + nota.calculaMediaSimples());
                        System.out.println("Média Ponderada: " + nota.calculaMediaPonderada());
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}