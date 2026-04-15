package com.mdcg.fase3marcoscervantes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoPrueba {

    @Test
    public void testCrearPedido() {

        Pedido pedido = new Pedido(
                1,
                "Empresa Ejemplo",
                "Monterrey",
                1000.0,
                "2026-04-18",
                "Pendiente"
        );

        assertEquals(1, pedido.getIdPedido());
        assertEquals("Empresa Ejemplo", pedido.getCliente());
        assertEquals("Monterrey", pedido.getDestino());
        assertEquals(1000.0, pedido.getPesoMercancia());
        assertEquals("2026-05-20", pedido.getFechaEntrega());
        assertEquals("Pendiente", pedido.getEstatus());
    }
}