package com.example.josechavez.proyectoseguros;

/**
 * Created by Josechavez on 02/06/2018.
 */

public class Poliza {
    private String id;
    private String npoliza;
    private String nplaca;
    private String fechainicio;
    private String fechafinal;
    private String nombreAsesor;
    private String id_usuario;

    public Poliza() {
    }

    public Poliza(String id, String npoliza, String nplaca, String fechainicio, String fechafinal, String nombreAsesor, String id_usuario) {
        this.id = id;
        this.npoliza = npoliza;
        this.nplaca = nplaca;
        this.fechainicio = fechainicio;
        this.fechafinal = fechafinal;
        this.nombreAsesor = nombreAsesor;
        this.id_usuario = id_usuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNpoliza() {
        return npoliza;
    }

    public void setNpoliza(String npoliza) {
        this.npoliza = npoliza;
    }

    public String getNplaca() {
        return nplaca;
    }

    public void setNplaca(String nplaca) {
        this.nplaca = nplaca;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(String fechafinal) {
        this.fechafinal = fechafinal;
    }

    public String getNombreAsesor() {
        return nombreAsesor;
    }

    public void setNombreAsesor(String nombreAsesor) {
        this.nombreAsesor = nombreAsesor;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }
    public void guardar(){
        Datos.guardarPoliza(this);
    }
}
