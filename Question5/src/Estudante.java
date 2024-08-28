public class Estudante {
    private String nome;
    private int idade;
    private double nota;

    public Estudante(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "Nome='" + nome + '\'' +
                ", Idade=" + idade +
                ", Nota=" + nota +
                '}';
    }
}
