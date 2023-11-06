package com.wildringsfrancosalas.Dominiowf;

    public class Freelance extends Empleado {
    long valorHoraWildrings;
    int horasTrabajadasWildrings;

    public Freelance(String nombreWildrings, long valorHoraWildrings, int horasTrabajadasWildrings) {
        super(nombreWildrings);
        this.valorHoraWildrings = valorHoraWildrings;
        this.horasTrabajadasWildrings = horasTrabajadasWildrings;
    }

         @Override
         public Long calcularSalarioFranco() {
         return valorHoraWildrings * horasTrabajadasWildrings;
         }

        public long getValorHoraWildrings() {
            return valorHoraWildrings;
        }

        public int getHorasTrabajadasWildrings() {
            return horasTrabajadasWildrings;
        }

        public void setValorHoraWildrings(long valorHoraWildrings) {
            this.valorHoraWildrings = valorHoraWildrings;
        }

        public void setHorasTrabajadasWildrings(int horasTrabajadasWildrings) {
            this.horasTrabajadasWildrings = horasTrabajadasWildrings;
        }
    }
