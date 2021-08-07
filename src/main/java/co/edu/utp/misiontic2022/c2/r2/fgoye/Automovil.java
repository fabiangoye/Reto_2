package co.edu.utp.misiontic2022.c2.r2.fgoye;

public class Automovil extends Vehiculo {

    

    
         

    public Automovil (String marca, String modelo, Double precioBase, TipoTransmision tipoTransmision,
      boolean vidriosElectricos, boolean aireAcondicionado ){
          this.marca = marca;
          this.modelo = modelo;
          this.precioBase = precioBase;
          this.tipoTransmision = tipoTransmision;
          this.vidriosElectricos = vidriosElectricos;
          this.aireAcondicionado = aireAcondicionado;

      

      }
    


    public Double calcularPrecio(){
        Double incTransmision = precioBase * 0.05;
        Double incVidriosElect = 400000d;
        Double incAire =3000000d;
        Double precioBaseC = 0.0;

        if( tipoTransmision ==TipoTransmision.AUTOMATICA){
             if ((vidriosElectricos == true) && (aireAcondicionado == true) ){ 
                    precioBaseC = precioBase + incTransmision + incVidriosElect + incAire;
                
            }else if ((vidriosElectricos == true) && (aireAcondicionado == false)) { 
                    precioBaseC = precioBase + incTransmision + incVidriosElect;
                
            }else if ((vidriosElectricos == false) && (aireAcondicionado == true)) {
                precioBaseC = precioBase + incTransmision  + incAire;
            }else {
                precioBaseC = precioBase + incTransmision;
             }
        }else if ((vidriosElectricos == true) && (aireAcondicionado == true) ){ 
            precioBaseC = precioBase + incVidriosElect + incAire;
        
            }else if ((vidriosElectricos == true) && (aireAcondicionado == false)) { 
                precioBaseC = precioBase + incVidriosElect;
        
            }else if ((vidriosElectricos == false) && (aireAcondicionado == true)) {
                precioBaseC = precioBase + incAire;
            }else {
                precioBaseC = precioBase;
            }
                
        return precioBaseC;// return del metodo calcularPrecio
    

    }

    public Double calcularPorcentajeImpuesto(Double impuesto, Double precioBaseC){
        Double precio = 0.0;
        if (impuesto != 0.0){
            precio = precioBaseC - (precioBaseC * impuesto);
        }
        return precio;
    }


}
