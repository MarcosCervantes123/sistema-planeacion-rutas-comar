

package com.mdcg.fase3marcoscervantes;

public class Unidad {
    
    private int idUnidad;
    private String operador;
    private double capacidadMaxima;
    private boolean disponible;

    public Unidad(int idUnidad, String operador, double capacidadMaxima, boolean disponible) {
        this.idUnidad = idUnidad;
        this.operador = operador;
        this.capacidadMaxima = capacidadMaxima;
        this.disponible = disponible;
    }

    public int getIdUnidad() {
        return idUnidad;
    }

    public String getOperador() {
        return operador;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInformacion() {
        System.out.println("ID Unidad: " + idUnidad);
        System.out.println("Operador: " + operador);
        System.out.println("Capacidad Maxima: " + capacidadMaxima + " kg");
        System.out.println("Disponible: " + disponible);
    }
}
