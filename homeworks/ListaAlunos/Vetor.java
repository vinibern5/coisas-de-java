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
	    System.out.printf("Erro, posição já foi ocupada!");
		}
	  else{
            alunos[posicao] = aluno;
		}
	}
	public Aluno pega(int posicao) {
          return this.alunos[posicao]; //Testando a keyword this
        }
	public void remove(int posicao) { //Sem this dessa vez
	  alunos[posicao] = null;
	}
	public boolean contem(Aluno aluno) {
	  for(int i=0;i<alunos.length;i++){
	    if(aluno == alunos[i]){
	      return true;
	    }
	  }
          return false;
	}
	
	public boolean contem(String aluno){ //Verificar se dado nome x está na nossa lista
	  for(int i=0;i<alunos.length;i++){
	    if(alunos[i] != null && aluno.equals(alunos[i].getNome())){ //Equals "melhor" que usar == pra comparar string? 
	      return true;
	    }
	  }
          return false;
	}
	
	public int tamanho() { //Outro teste com "this"
	  int size=0;
	  for(int i=0;i<this.alunos.length;i++){
	    if(this.alunos[i] != null){
	      size ++;
	    }
	  }
          return size;
	}
	public String toString() {
          return Arrays.toString(alunos);
	}
}
