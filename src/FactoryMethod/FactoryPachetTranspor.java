package FactoryMethod;

public class FactoryPachetTranspor implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        PachetTransport pachetTransport = new PachetTransport();
        return pachetTransport;
    }
}
