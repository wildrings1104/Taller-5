package com.wildringsfrancosalas.Appwf;

import com.wildringsfrancosalas.Dominiowf.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AplicacionNomina {

    public static void main(String[] args) {

        List <Empleado> empleados = new ArrayList<>();

        Directo empleado1 = new Directo("Juan", 4840000L);
        Vendedor empleado2 = new Vendedor("Julian", 205000, 45510000);
        Freelance empleado3 = new Freelance("Johanna", 71000, 89);
        Vendedor empleado4 = new Vendedor("Carolina", 980000, 35989000);
        Promotor empleado5 = new Promotor("Pedro", 1200, 300, 62);
        Directo empleado6 = new Directo("David", 3975000L);
        Freelance empleado7 = new Freelance("Gustavo", 42500, 65);

        empleados.addAll(Arrays.asList(empleado1, empleado2, empleado3, empleado4, empleado5, empleado6, empleado7));

        Nomina nomina = new Nomina(empleados);

        nomina.calcularNominaFranco();

    }


}
