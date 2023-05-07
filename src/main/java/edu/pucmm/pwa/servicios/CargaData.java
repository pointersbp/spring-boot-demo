package edu.pucmm.pwa.servicios;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by vacax on 26/09/16.
 */
@Service
public class CargaData {

    @Autowired
    ProfesorServices profesorServices;

    @PostConstruct
    public void cargarInformacionInicio(){
        System.out.println("Simulando la carga de información.....");
    }

}
