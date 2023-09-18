package org.example.Validaciones;

import org.example.Utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioMembresiaValidacionTest {

    UsuarioMembresiaValidacion usuarioMembresiaValidacion;

    @BeforeEach
    public void configurarPrueba(){
        System.out.println("Se esta ejecutando la prueba");
        this.usuarioMembresiaValidacion = new UsuarioMembresiaValidacion();
    }

    @Test
    public void validarPruebaSobrePasaTope(){
        Double prueba = 3000000.0;
        Exception respuesta = Assertions.assertThrows(Exception.class,()-> usuarioMembresiaValidacion.validarTopePago(prueba));
        Assertions.assertEquals(Mensaje.TOPEPAGO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNoSobrepasaTope(){
        double prueba = 90000.0;
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.usuarioMembresiaValidacion.validarTopePago(prueba));
        Assertions.assertTrue(respuesta);
    }

}