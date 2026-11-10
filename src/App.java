public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema Professor Horista!");

        ProfessorHorista professor = new ProfessorHorista("Montanha");

        ProfessorHorista professor2 = new ProfessorHorista("Pedro");
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Professor: " + professor2.getNome());

    }
}
