package com.wildringsfrancosalas.Dominiowf;

public class Vendedor extends Directo {
    private long ventasDelMesWildrings;

    public Vendedor(String nombreWildrings, long salarioWildrings, long ventasDelMesWildrings) {
        super(nombreWildrings, salarioWildrings);
        this.ventasDelMesWildrings = ventasDelMesWildrings;
    }

    @Override
    public Long calcularSalarioFranco() {
        return getSalarioWildrings() + calcularComisionFranco();
    }

    public long calcularComisionFranco(){
        long comision = 0;
        if (getSalarioWildrings() < 999999){
            comision = (long) ((ventasDelMesWildrings * 0.04));
        } else {
            comision = (long) ((ventasDelMesWildrings * 0.035));
        }
        return comision;
    }

    public long getVentasDelMesWildrings() {
        return ventasDelMesWildrings;
    }

    public void setVentasDelMesWildrings(long ventasDelMesWildrings) {
        this.ventasDelMesWildrings = ventasDelMesWildrings;
    }
}