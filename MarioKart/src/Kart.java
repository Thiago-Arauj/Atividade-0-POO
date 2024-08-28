public class Kart {
    private String cor;
    private int velocidade;
    private Personagem personagem;
    private String direction = "front";

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }



    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }



    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public void velocityMod(int gas){
        this.velocidade += gas;
        if (gas > 0){
            System.out.println("Você acelerou em " + gas + "\nAgora está em " + velocidade);
        } else {
            System.out.println("Você freou e agora está a " + velocidade );
        }
    }

    public void changeDirection(int dir){
        switch (dir){
            case 1:
                this.direction = "front";
                System.out.println("Agora você está virado para frente");
            break;

            case 2:
                this.direction = "left";
                System.out.println("Agora você está virado para esquerda");
            break;

            case 3:
                this.direction = "right";
                System.out.println("Agora você está virado para direita");
            break;
        }
    }


}
