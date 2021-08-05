package co.edu.utp.misiontic2022.c2.r2.fgoye;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

import java.util.GregorianCalendar;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws ParseException{
       // PRUEBA calcularDescuento de la clase vehiculo ---> Aprobada
      
      Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse("17/07/2021");// cambiar Date y Pedido por var
      Pedido pedido = new Pedido(fecha, "Cesar Díaz");
      pedido.adicionarVehiculo(new Automovil("BMW", "i8", 300_000_000d, TipoTransmision.MANUAL, true, true));
      
      Automovil obj = new Automovil();
      System.out.println(obj.calcularDescuento(fecha)); 
      
    }
}
