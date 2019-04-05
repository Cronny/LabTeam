package com.LabTeam.app;

import java.io.Serializable;
import java.util.List;

import org.primefaces.model.map.Marker;

public class Marcador implements Serializable{

    //Tema tema = new Tema();
    String nombre;
    String descripcion;
    double coordX;
    double coordY;
    String detalles;
    String ubicacion;
    //Comentario comentario;
    
    public Marcador(){}

    public Marcador(/*Tema tema,*/String nombre, String descripcion, double coordX,
		    double coordY, String detalles, String ubicacion/*, Comentario comentario*/){
	//this.tema = tema;
        this.nombre = nombre;
	this.descripcion = descripcion;
	this.coordX = coordX;
	this.coordY = coordY;
	this.detalles = detalles;
	this.ubicacion = ubicacion;
        //this.comentario = comentario;
    }
    /*
    public Tema getTema(){
        return tema;
    }*/
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getCoordX(){
        return coordX;
    }
    public double getCoordY(){
        return coordY;
    }
    public String getDetalles(){
        return detalles;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    /*
    public Comentario getComentario(){
        return comentario;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }*/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
/*
    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }
  */
    
    
}
