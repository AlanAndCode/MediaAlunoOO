public class Main {
  public static void main(String[] args) {

    String[] disciplinas = {"Matemática", "Física", "Química"};
    double [] nota1 = {3.5, 10.0, 9.5};
    double [] nota2 = {3.5, 4.0, 4.5};
    Aluno aluno = new Aluno("João", "Engenharia", disciplinas, 12345, nota1, nota2);

    // Utilizando os métodos get para obter informações
    System.out.println("Nome: " + aluno.getNome());
    System.out.println("Curso: " + aluno.getCurso());
    for (String disciplina : aluno.getDisciplinas()) {
        System.out.println("- " + disciplina);
    }
    System.out.println("Matrícula: " + aluno.getMatricula());
    System.out.println("Nota 1: " + aluno.getNota1());
    for (Double n1 : aluno.getNota1()) {
        System.out.println("- " + n1);
    }
    System.out.println("Nota 2: " + aluno.getNota2());
    for (Double n2 : aluno.getNota2()) {
        System.out.println("- " + n2);
    }

    // Verificando se o aluno está aprovado
    aluno.Aprovado();
  }

}