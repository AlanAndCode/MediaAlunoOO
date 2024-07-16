public class Aluno{
private String nome;
private String curso;
private String[] disciplinas;
private int matricula;
private double[] nota1, nota2;




  public Aluno(String nome, String curso, String[] disciplinas, int matricula, double[] nota1, double[] nota2){
    this.nome = nome;
    this.curso = curso;
    this.disciplinas = disciplinas;
    this.matricula = matricula;
    this.nota1 = nota1;
    this.nota2 = nota2;
  }
public String getNome() {
	return nome;
}

public void setNome(String nome){
  this.nome = nome;
}

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso){
    this.curso = curso;
  }

  public String[] getDisciplinas() {
    return disciplinas;
  }

  public void setDisciplinas(String[] disciplinas) {
    this.disciplinas = disciplinas;
  }

  public int getMatricula(){
    return matricula;
  }

  public void setMatricula(int matricula){
    this.matricula = matricula;
  }

  public double[] getNota1(){
    return nota1;
  }

  public void setNota1(double[] nota1){
    this.nota1 = nota1;
  }

  public double[] getNota2(){
    return nota2;
  }

  public void setNota2(double[] nota2){
    this.nota2 = nota2;
  }

  public void Aprovado() {
    for (int i = 0; i < disciplinas.length; i++) {
        double media = (nota1[i] + nota2[i]) / 2.0;
        System.out.print("Disciplina: " + disciplinas[i] + " - ");
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

  }
  }
