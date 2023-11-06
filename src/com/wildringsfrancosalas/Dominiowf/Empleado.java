package com.wildringsfrancosalas.Dominiowf;

public abstract class Empleado {

    private String empleadoWildrings;

    public Empleado(String empleadoWildrings) {
        this.empleadoWildrings = empleadoWildrings;
    }

    public abstract Long calcularSalarioFranco();

    @Override
    public String toString() {
        return "Empleado{" +
                "empleadoWildrings='" + empleadoWildrings + '\'' +
                '}';
    }

    public String getEmpleadoWildrings() {
        return empleadoWildrings;
    }

    public void setEmpleadoWildrings(String empleadoWildrings) {
        this.empleadoWildrings = empleadoWildrings;
    }
}
