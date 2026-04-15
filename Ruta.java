
package com.mdcg.fase3marcoscervantes;

public class Ruta {
    
    private int idRuta;
    private String destino;
    private double distanciaKm;
    private String tiempoEstimado;

    public Ruta(int idRuta, String destino, double distanciaKm, String tiempoEstimado) {
        this.idRuta = idRuta;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.tiempoEstimado = tiempoEstimado;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public String getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void mostrarInformacion() {
        System.out.println("ID Ruta: " + idRuta);
        System.out.println("Destino: " + destino);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Tiempo estimado: " + tiempoEstimado);
    }
}
