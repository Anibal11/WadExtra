package com.wad.model;
// Generated 12/06/2018 08:59:58 PM by Hibernate Tools 4.3.1



/**
 * Imagen generated by hbm2java
 */
public class Imagen  implements java.io.Serializable {


     private int idImagen;
     private Diagrama diagrama;
     private byte[] img;
     private String nombre;

    public Imagen() {
    }

	
    public Imagen(int idImagen) {
        this.idImagen = idImagen;
    }
    public Imagen(int idImagen, Diagrama diagrama, byte[] img, String nombre) {
       this.idImagen = idImagen;
       this.diagrama = diagrama;
       this.img = img;
       this.nombre = nombre;
    }
   
    public int getIdImagen() {
        return this.idImagen;
    }
    
    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }
    public Diagrama getDiagrama() {
        return this.diagrama;
    }
    
    public void setDiagrama(Diagrama diagrama) {
        this.diagrama = diagrama;
    }
    public byte[] getImg() {
        return this.img;
    }
    
    public void setImg(byte[] img) {
        this.img = img;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


