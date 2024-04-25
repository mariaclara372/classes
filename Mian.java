class Aluno {
    private final String nome;
    private final int idade;
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matrícula: " + this.matricula);
    }

    public boolean isMaiorIdade() {
        return this.idade >= 18;
    }

    public void atualizarMatricula(String novaMatricula) {
        this.matricula = novaMatricula;
        System.out.println("Matrícula atualizada para: " + novaMatricula);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", 20, "2022001");
        aluno1.mostrarInformacoes();
        System.out.println("É maior de idade? " + aluno1.isMaiorIdade());
        aluno1.atualizarMatricula("2022002");
        aluno1.mostrarInformacoes();
    }
}
