package com.mdcg.fase3marcoscervantes;

public class Fase3MarcosCervantes {

    public static void main(String[] args) {
        
        Pedido pedido1 = new Pedido(
                12,
                "Empresa Ejemplo 1",
                "Escobedo",
                650,
                "2026-04-15",
                "Pendiente"
        );
Unidad unidad1 = new Unidad(
                101,
                "Juan Perez",
                1500.0,
                true
        );

        Ruta ruta1 = new Ruta(
                1,
                "Escobedo",
                25.5,
                "45 minutos"
        );

        SistemaPlaneacion sistema = new SistemaPlaneacion();

        pedido1.mostrarInformacion();
        System.out.println("----------------------");
        unidad1.mostrarInformacion();
        System.out.println("----------------------");
        ruta1.mostrarInformacion();
        System.out.println("----------------------");

        sistema.asignarRuta(pedido1, ruta1);
        System.out.println("----------------------");
        sistema.asignarUnidad(pedido1, unidad1);
    }
}
