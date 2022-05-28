package FactoryMethod;

public class FactoryPachetCazare implements Factory{

    @Override
    public PachetTuristic crearePachet() {
        PachetCazare pachetCazare = new PachetCazare();
        return pachetCazare;
    }
}
