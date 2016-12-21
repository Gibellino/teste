package aulas;

public class MomentoAvaliacao {

	private Aluno aluno = new Aluno();
	private int nota, dificuldade;
	private String data;

	public MomentoAvaliacao(Aluno aluno, int nota, int dificuldade, String data) {
		this.aluno = aluno;
		this.nota = nota;
		this.dificuldade = dificuldade;
		this.data = data;
	}
}
