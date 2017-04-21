public class Main{
	public static void main(String[] args) {
	  //Testes -- Usei printf pra facilitar na hora de ler as saídas no console
	  
	  Aluno a1 = new Aluno();
	  Aluno a2 = new Aluno();
	  Aluno a3 = new Aluno();
	  Aluno a4 = new Aluno();
	  Aluno a5 = new Aluno();
	  a1.setNome("João");
	  a2.setNome("José");
	  a3.setNome("Bernardo");
	  a4.setNome("Vinicius");
	  a5.setNome("Coelhinho da Pascoa");
	  Vetor lista = new Vetor();
	  System.out.println("Size: " + lista.tamanho() + '\n'); //Quantidade de elementos na nossa lista!
	  lista.adiciona(a1);
	  lista.adiciona(a2);
	  System.out.println("Size: " + lista.tamanho() + '\n'); //Quantidade de elementos na nossa lista!
	  lista.adiciona(0,a3); //Não é possível, pois a posição 0 já foi alocada 
	  System.out.printf("%s \n\n",lista); //Mostrar a lista
	  lista.adiciona(3,a4);
	  System.out.printf("%s \n\n",lista); //Mostrar a lista
	  lista.adiciona(a5); //Será adicionado na posição 2, pois a mesma está vazia lista[2] == null //
	  System.out.printf("%s \n\n",lista); //Mostrar a lista
	  System.out.printf("%s \n\n",lista.pega(0)); //Mostra o que está na posição "0"
	  System.out.printf("%s \n\n",lista.pega(2)); //Posição "2"
	  System.out.printf("%s \n\n",lista.pega(7));
	  lista.remove(0); //Remove o elemento que está na posição 0 -> [null,José,Coelhinho,...]
	  System.out.printf("%s \n\n",lista.pega(0)); //Mostra o que está na posição 0 agora
	  System.out.printf("%s \n\n",lista);
	  if(lista.contem(a2)){ //Verifica se o elemento a2 está na lista -> a2 >>"José"
	    System.out.println("José está presente!" + '\n');
	  }
	  Aluno a10 = new Aluno();
	  a10.setNome("Masanori");
	  lista.adiciona(9,a10);
	  System.out.printf("%s \n\n",lista); //Mostrar a lista
	  Aluno a6 = new Aluno();
	  a6.setNome("Capaldão");
	  lista.adiciona(a6); //Será adicionado na posição 0, pois a mesma está vazia!
	  System.out.printf("%s \n\n",lista); //Mostrar a lista
	  if(lista.contem("Capaldão")){ //Verifica se "Capaldão" está na lista
	    System.out.println("Capaldão está presente!" + '\n');
	  }
	  System.out.println("Size: " + lista.tamanho() + '\n'); //Quantidade de elementos na nossa lista!
	  
	  
	}
}
