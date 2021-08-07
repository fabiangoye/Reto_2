package co.edu.utp.misiontic2022.c2.r2.fgoye;

import java.util.Date;



public class Pedido {
  
    Date fecha;
    String cliente;
    Vehiculo vehiculo; 
    public static int contador = 0;
       

    public Pedido(){}

    public Pedido(Date fecha, String cliente){
        this.fecha = fecha;
        this.cliente = cliente;

} 


    public void adicionarVehiculo(Vehiculo vehiculo){   
        contador ++;


}

    public  Integer calcularCantidadVehiculos(){
        int calculo = contador;
        return contador;
        
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}   
