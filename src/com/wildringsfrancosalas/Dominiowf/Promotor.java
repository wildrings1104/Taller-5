package com.wildringsfrancosalas.Dominiowf;

    public  class Promotor extends Empleado{
    private int volantesRepartidosWildrings;
    private long valorVolanteWildrings;
    private int comprasVolanteWildrings;

    public Promotor(String nombreWildrings, int volantesRepartidosWildrings, long valorVolanteWildrings, int comprasVolanteWildrings) {
        super(nombreWildrings);
        this.volantesRepartidosWildrings = volantesRepartidosWildrings;
        this.valorVolanteWildrings = valorVolanteWildrings;
        this.comprasVolanteWildrings = comprasVolanteWildrings;
    }

        @Override
        public Long calcularSalarioFranco() {
            return (long) ((valorVolanteWildrings * volantesRepartidosWildrings) + (15.000 * comprasVolanteWildrings));
        }

        public int getVolantesRepartidosWildrings() {
            return volantesRepartidosWildrings;
        }

        public long getValorVolanteWildrings() {
            return valorVolanteWildrings;
        }

        public int getComprasVolanteWildrings() {
            return comprasVolanteWildrings;
        }

        public void setVolantesRepartidosWildrings(int volantesRepartidosWildrings) {
            this.volantesRepartidosWildrings = volantesRepartidosWildrings;
        }

        public void setComprasVolanteWildrings(int comprasVolanteWildrings) {
            this.comprasVolanteWildrings = comprasVolanteWildrings;
        }
}
