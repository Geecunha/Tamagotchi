public class Tamagotchi {
    private String nome;
    private Necessidades necessidades;

    public Tamagotchi(String nome) {
        this.nome = nome;
        this.necessidades = new Necessidades();
    }

    public String getNome() {
        return this.nome;
    }

    public void alimentar() {
        this.necessidades.setFome(this.necessidades.getFome() + 2);
        System.out.println(" ");
        System.out.println(this.nome + " foi alimentado!");
        System.out.println("Nível de fome: " + this.necessidades.getFome());
    }

    public void brincar() {
        this.necessidades.setDiversao(this.necessidades.getDiversao() + 2);
        System.out.println(" ");
        System.out.println(this.nome + " se divertiu brincando!");
        System.out.println("Nível de diversão: " + this.necessidades.getDiversao());
    }

    public void socializar() {
        this.necessidades.setSocial(this.necessidades.getSocial() + 2);
        System.out.println(" ");
        System.out.println(this.nome + " socializou com você!");
        System.out.println("Nível de socialização: " + this.necessidades.getSocial());
    }

    public void limpar() {
        this.necessidades.setHigiene(this.necessidades.getHigiene() + 2);
        System.out.println(" ");
        System.out.println(this.nome + " tomou banho e está limpo!");
        System.out.println("Nível de higiene: " + this.necessidades.getHigiene());
    }

    public void descansar() {
        this.necessidades.setEnergia(this.necessidades.getEnergia() + 2);
        System.out.println(" ");
        System.out.println(this.nome + " dormiu e recuperou energia!");
        System.out.println("Nível de energia: " + this.necessidades.getEnergia());
    }

    public void status() {
        System.out.println("=== Status de " + this.nome + " ===");
        System.out.println("Fome: " + this.necessidades.getFome());
        System.out.println("Diversão: " + this.necessidades.getDiversao());
        System.out.println("Social: " + this.necessidades.getSocial());
        System.out.println("Higiene: " + this.necessidades.getHigiene());
        System.out.println("Energia: " + this.necessidades.getEnergia());
    }

    public void passarTempo() {
        this.necessidades.passarTempo();
        System.out.println(" ");
        System.out.println(this.nome + " passou um tempo...");
    }

    public boolean estaVivo() {
        if (this.necessidades.getFome() <= 0) {
            System.out.println(" ");
            System.out.println(this.nome + " morreu de fome!");
            return false;
        } else if (this.necessidades.getHigiene() <= 0) {
            System.out.println(" ");
            System.out.println(this.nome + " ficou doente e morreu!");
            return false;
        } else if (this.necessidades.getEnergia() <= 0) {
            System.out.println(" ");
            System.out.println(this.nome + " ficou irritado e morreu de cansaço mental!");
            return false;
        } else {
            if (this.necessidades.getSocial() <= 0) {
                System.out.println(" ");
                System.out.println(this.nome + " ficou triste e pode ter depressão!");
            }

            if (this.necessidades.getDiversao() <= 0) {
                System.out.println(" ");
                System.out.println(this.nome + " ficou irritado e pode ter burnout!");
            }

            return true;
        }
    }
}