public class Atividade_0_Question4 {
    public static void main(String[] args){
        Carro4 carro = new Carro4();
        carro.ano = 2012;
        carro.cor = "Vermelho";
        carro.marca = "Fiat";
        carro.modelo = "Grand Siena";
        carro.preco = 74000;

        carro.exibirDetalhes();
        carro.desconto();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.idade = 22;
        pessoa1.nome = "Thiago";

        pessoa1.exibirInformacoes();
        pessoa1.alterarIdade();
        pessoa1.exibirInformacoes();
    }
}
