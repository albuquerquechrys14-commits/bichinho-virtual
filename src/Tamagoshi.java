public class Tamagoshi {
    private String nome;
    private int fome;
    private int energia;
    private String humor;

    @Override
    public String toString() {
        return "Tamagoshi{" +
                "nome='" + nome + '\'' +
                ", fome=" + fome +
                ", energia=" + energia +
                ", humor='" + humor + '\'' +
                '}';
    }

    public Tamagoshi() {
        this("Kibixinha");
    }

    public Tamagoshi(String nome) {
        this.nome = nome;
        this.fome = 50;
        this.energia = 50;
        this.humor = "normal";
    }

    public String getNome(String kibixinha) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void getFome(int fome) {
        if (fome >= 0 && fome <= 100) {
            this.fome = fome;
        } else {
            throw new IllegalArgumentException("Fome deve estar entre 0 e 100");
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100) {
            this.energia = energia;
        } else {
            throw new IllegalArgumentException("A energia deve estar entre 0 e 100");
        }
    }

    public String getHumor(String number) {
        int nivelHumor = this.fome - this.energia;

        if (nivelHumor >= 50) {
            this.humor = "HAPPY HAPPY HAPPY";
        } else if (nivelHumor >= 0) {
            this.humor = "meeeeeeee";
        } else {
            this.humor = "no happy.";
        }

        return this.humor;
    }

    public void getEnergia(int i) {

    }
}