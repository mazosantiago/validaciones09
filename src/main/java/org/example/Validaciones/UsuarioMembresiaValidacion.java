package org.example.Validaciones;

import org.example.Modelos.UsuarioMembresia;
import org.example.Utilidades.Mensaje;

public class UsuarioMembresiaValidacion {

    public  Boolean validarTopePago(Double pagoMensual) throws Exception{

        if(pagoMensual <= 0 || pagoMensual >= 100000){
            throw new Exception(Mensaje.TOPEPAGO.getMensaje());
        }
        return true;
    }

}
