package com.wildringsfrancosalas.Dominiowf;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleadosWildrings;

    public Nomina(List<Empleado> empleados) {
        this.empleadosWildrings = empleados;
    }

    public void calcularNominaFranco(){
        listaDirectosFranco();
        listaFreelanceFranco();
        listaPromotoresFranco();
    }

    public void listaDirectosFranco(){
        for (Empleado empleado : empleadosWildrings){
            if (empleado instanceof Vendedor){
                System.out.println(empleado.getEmpleadoWildrings() + " Salario: " + empleado.calcularSalarioFranco() + " Empleado directo vendedor");
            }
            else if (empleado instanceof Directo){
                System.out.println(empleado.getEmpleadoWildrings() + " Salario: " + empleado.calcularSalarioFranco() + " Empleado directo");
            }
        }
    }

    public void listaFreelanceFranco(){
        for (Empleado empleado : empleadosWildrings){
            if (empleado instanceof Freelance){
                System.out.println(empleado.getEmpleadoWildrings() + " Salario: " + empleado.calcularSalarioFranco() + " Empleado freelance");
            }
        }
    }

    public void listaPromotoresFranco(){
        for (Empleado empleado : empleadosWildrings){
            if (empleado instanceof Promotor){
                System.out.println(empleado.getEmpleadoWildrings() + " Salario: " + empleado.calcularSalarioFranco() + " Empleado promotor");
            }
        }
    }

    public List<Empleado> getEmpleadosWildrings() {
        return empleadosWildrings;
    }

    public void setEmpleadosWildrings(List<Empleado> empleadosWildrings) {
        this.empleadosWildrings = empleadosWildrings;
    }

}

