public class ForEmArrays {
    public static void main(String[] args) {
        
         String alunos1[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	        for (int i=0; i<alunos1.length; i++) {
		        System.out.println("O aluno no indice " + i + " é " + alunos1[i]);
	        }
        System.out.println();
        String alunos [] =  {"FELIPE","JONAS","JULIA"};
        System.out.println("Apenas os nomes dos alunos: ");
	    for(String aluno : alunos) { // essa linha pode ser traduzida como "para cada aluno no array alunos"
	        System.out.println(aluno);
	    }
    }
}
