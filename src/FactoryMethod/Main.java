package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory pachetCazare = new FactoryPachetCazare();
        PachetTuristic pachetTuristic = pachetCazare.crearePachet();
        pachetTuristic.afiseazaDetalii();
    }
}
