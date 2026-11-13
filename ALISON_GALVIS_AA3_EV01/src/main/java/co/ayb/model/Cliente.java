package co.ayb.model;

/** Modelo que representa un cliente. */
public class Cliente {
    private String nombres, apellidos, cedula, telefono;

    public Cliente() {}
    public String getNombres(){ return nombres; }
    public void setNombres(String v){ nombres=v; }
    public String getApellidos(){ return apellidos; }
    public void setApellidos(String v){ apellidos=v; }
    public String getCedula(){ return cedula; }
    public void setCedula(String v){ cedula=v; }
    public String getTelefono(){ return telefono; }
    public void setTelefono(String v){ telefono=v; }
}
