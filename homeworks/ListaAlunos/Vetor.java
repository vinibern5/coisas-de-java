import java.util.Arrays;

public class Vetor {
	private Aluno[] alunos = new Aluno[10];
	public void adiciona(Aluno aluno) {
    for(int i=0;i<alunos.length;i++){
      if (alunos[i] == null){
        alunos[i] = aluno;
        break;
       }
      }
        
    }
	
	public void adiciona(int posicao, Aluno aluno) {
    if (alunos[posicao] != null){
      System.out.println("Erro, posição já foi ocupada!");
    }
    else{
      alunos[posicao] = aluno;
    }
	}
	public Aluno pega(int posicao) {
    return null;
	}
	public void remove(int posicao) {
	  return;
	}
	public boolean contem(Aluno aluno) {
    return false;
	}
	public int tamanho() {
    return 0;
	}
	public String toString() {
		return Arrays.toString(alunos);
	}
}
