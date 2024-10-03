public class Necessidades {
    private int fome = 5;
    private int diversao = 5;
    private int social = 5;
    private int higiene = 5;
    private int energia = 5;

    public Necessidades() {
    }

    public int getFome() {
        return this.fome;
    }

    public void setFome(int fome) {
        this.fome = Math.max(0, Math.min(fome, 10));
    }

    public int getDiversao() {
        return this.diversao;
    }

    public void setDiversao(int diversao) {
        this.diversao = Math.max(0, Math.min(diversao, 10));
    }

    public int getSocial() {
        return this.social;
    }

    public void setSocial(int social) {
        this.social = Math.max(0, Math.min(social, 10));
    }

    public int getHigiene() {
        return this.higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = Math.max(0, Math.min(higiene, 10));
    }

    public int getEnergia() {
        return this.energia;
    }

    public void setEnergia(int energia) {
        this.energia = Math.max(0, Math.min(energia, 10));
    }

    public void passarTempo() {
        --this.fome;
        --this.diversao;
        --this.social;
        --this.higiene;
        --this.energia;
    }
}
