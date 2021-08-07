package co.edu.utp.misiontic2022.c2.r2.fgoye;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected Double precioBase;
    protected Date fecha;

    protected TipoTransmision tipoTransmision;
    protected boolean vidriosElectricos;
    protected boolean aireAcondicionado;



    public Vehiculo(){
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.tipoTransmision = tipoTransmision;
        this.aireAcondicionado = aireAcondicionado;
        this.vidriosElectricos = vidriosElectricos;
        
    }

    public Vehiculo(String marca, String modelo, Double precioBase){
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.tipoTransmision = tipoTransmision;
        this.aireAcondicionado = aireAcondicionado;
        this.vidriosElectricos = vidriosElectricos;
    }

    public Double calcularDescuento(Date fecha){

        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(fecha);
        int mes = cal.get(Calendar.MONTH);
        Double impuesto = 0.0;

        if (marca == "BMW" && mes == Calendar.JULY){ 
            impuesto = 0.15;
       } else if((marca == "Suzuki") && (mes == Calendar.JUNE)) {
           impuesto = 0.1;
   }
        return impuesto;
    }   

    /*public Double calcularPrecio(){
        if( tipoTransmision ==TipoTransmision.AUTOMATICA){
             if ((vidriosElectricos == true) && (aireAcondicionado == true) ){ 
                    precioBase = precioBase + incTransmision + incVidriosElect + incAire;
                
            }else if ((vidriosElectricos == true) && (aireAcondicionado == false)) { 
                    precioBase = precioBase + incTransmision + incVidriosElect;
                
            }else if ((vidriosElectricos == false) && (aireAcondicionado == true)) {
                precioBase = precioBase + incTransmision  + incAire;
            }else {
                precioBase = precioBase + incTransmision;
             }
        }else if ((vidriosElectricos == true) && (aireAcondicionado == true) ){ 
            precioBase = precioBase + incTransmision + incVidriosElect + incAire;
        
            }else if ((vidriosElectricos == true) && (aireAcondicionado == false)) { 
                precioBase = precioBase + incTransmision + incVidriosElect;
        
            }else if ((vidriosElectricos == false) && (aireAcondicionado == true)) {
                precioBase = precioBase + incTransmision  + incAire;
            }else {
                precioBase = precioBase + incTransmision;
            }
        

            
                 
        return precioBase;// return del metodo calcularPrecio
    

    }*/

}
