void main() {

    Tamagoshi t = new Tamagoshi();

    t.getNome("Kibixinha");
    t.getEnergia();
    t.getHumor("50");
    t.getFome(0);

    t.getFome(0);
    t.getHumor("50");
    t.getEnergia(100);
    t.getNome("Kibixinha");

    IO.println(t);

}