
package com.mdcg.fase3marcoscervantes;

public class SistemaPlaneacion {
    
    public void asignarRuta(Pedido pedido, Ruta ruta) {
        System.out.println("Asignando ruta al pedido");
        System.out.println("Pedido con destino final a: " + pedido.getDestino());
        System.out.println("Ruta asignada: " + ruta.getDestino());
    }

    public void asignarUnidad(Pedido pedido, Unidad unidad) {
        System.out.println("Asignando unidad al pedido");
        
        if (unidad.isDisponible() && unidad.getCapacidadMaxima() >= pedido.getPesoMercancia()) {
            System.out.println("Unidad " + unidad.getIdUnidad() + " asignada correctamente.");
            unidad.setDisponible(false);
        } else {
            System.out.println("No se puede asignar la unidad.");
        }
    }
}