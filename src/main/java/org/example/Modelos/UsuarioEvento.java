package org.example.Modelos;

public class UsuarioEvento extends Usuario{

    private Double costoPorEvento;

    public UsuarioEvento() {
    }

    public UsuarioEvento(Integer id, String documento, String nombres, String correo, Integer ubicacion, Double costoPorEvento) {
        super(id, documento, nombres, correo, ubicacion);
        this.costoPorEvento = costoPorEvento;
    }

    public Double getCostoPorEvento() {
        return costoPorEvento;
    }

    public void setCostoPorEvento(Double costoPorEvento) {
        this.costoPorEvento = costoPorEvento;
    }

    public void calcularDescuento(){}

}
