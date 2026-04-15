/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mdcg.fase3marcoscervantes;

public class Pedido {

    private int idPedido;
    private String cliente;
    private String destino;
    private double pesoMercancia;
    private String fechaEntrega;
    private String estatus;

    public Pedido(int idPedido, String cliente, String destino, double pesoMercancia, String fechaEntrega, String estatus) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.destino = destino;
        this.pesoMercancia = pesoMercancia;
        this.fechaEntrega = fechaEntrega;
        this.estatus = estatus;
    }
    
    public int getIdPedido() {
        return idPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDestino() {
        return destino;
    }

    public double getPesoMercancia() {
        return pesoMercancia;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public void mostrarInformacion() {
        System.out.println("ID Pedido: " + idPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Destino: " + destino);
        System.out.println("Peso de Mercancia: " + pesoMercancia + " kg");
        System.out.println("Fecha de Entrega: " + fechaEntrega);
        System.out.println("Estatus: " + estatus);
    }
}
