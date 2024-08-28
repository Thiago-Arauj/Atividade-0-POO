public class Personagem {
    private String nome;
    private Kart kart;
    private int vida = 3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public Kart getKart() {
        return kart;
    }

    public void setKart(Kart kart) {
        this.kart = kart;
    }

    public void acelerar(int gas) {
        kart.velocityMod(gas);
    }

    public void curva(int dir) {
        kart.changeDirection(dir);
    }

    public int getVida() {
        return vida;
    }

    public int modVida(int vida,int curva, int dir) {
        if (curva != dir) {
            this.vida -= 1;
            return 0;
        }
        return 1;
    }
}
