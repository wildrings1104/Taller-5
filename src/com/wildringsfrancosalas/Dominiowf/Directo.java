package com.wildringsfrancosalas.Dominiowf;

public class Directo extends Empleado {
    private long salarioWildrings;

    public Directo(String nombreWildrings, long salarioWildrings) {
        super(String.valueOf(nombreWildrings));
        this.salarioWildrings = salarioWildrings;
    }

    @Override
    public Long calcularSalarioFranco() {
        return (salarioWildrings - calcularPensionFranco()) - calcularSaludFranco();
    }

    public long calcularSaludFranco(){
        return (long) (0.05 * salarioWildrings);
    }

    public long calcularPensionFranco(){
        return (long) (0.065 * salarioWildrings);
    }

    public long getSalarioWildrings() {
        return salarioWildrings;
    }

    public void setSalarioWildrings(long salarioWildrings) {
        this.salarioWildrings = salarioWildrings;
    }
}
