package co.edu.utp.misiontic2022.c2.r2.fgoye;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Vehiculo {
    protected String marca = null;
    protected String modelo = null;
    protected Double precioBase = null;
    



    public abstract Double calcularPrecio();
    
 
    public abstract Double calcularPorcentajeImpuesto();

    public Double calcularDescuento(Date fecha){
        

        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(fecha);

        marca = getMarca();
        
        int mes = cal.get(Calendar.MONTH);
        
        Double impuesto = 0.090;
         
       
        if (marca == "BMW" && mes == Calendar.JULY){ 
             impuesto = 0.15;
        } else if((marca == "Suzuki") && (mes == Calendar.JUNE)) {
            impuesto = 0.1;
    }/*
    if (mes == Calendar.JULY){
        impuesto = 0.15;
    }else if ( mes == Calendar.JUNE){
        impuesto = 0.1;
    }*/
        return impuesto;
    }



    public  String getMarca() {
        return marca;
    }


    public  void setMarca(String marca) {
        this.marca = marca;
    }


    public  String getModelo() {
        return modelo;
    }


    public  void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public  Double getPrecioBase() {
        return precioBase;
    }


    public  void setPrecioBase(Double precioBase) {
       this.precioBase = precioBase;
    }


   



    
    
}
