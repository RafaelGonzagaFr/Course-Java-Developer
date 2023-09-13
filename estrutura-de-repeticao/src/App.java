public class App {
    public static void main(String[] args) throws Exception {
        //for
        for(int i = 0; i < 10; i++){
            System.out.print("\t"+i);
        }

        System.out.println("\n\n");

        //for em arrays
        String alunos[] = {"Rafael", "Mateus", "Lucas"};
        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno);
        }
    }
}
