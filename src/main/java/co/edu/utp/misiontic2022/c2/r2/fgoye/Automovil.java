package co.edu.utp.misiontic2022.c2.r2.fgoye;

public class Automovil extends Vehiculo {

    private TipoTransmision tipoTransmision;
    private boolean vidriosElectricos;
    private boolean aireAcondicionado;
    

    public Automovil(){
        /*this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.tipoTransmision = tipoTransmision;
        this.vidriosElectricos = vidriosElectricos;
        this.aireAcondicionado = aireAcondicionado;*/
    }
         

    public Automovil (String marca, String modelo, double precioBase, TipoTransmision tipoTransmision,
      boolean vidriosElectricos, boolean aireAcondicionado ){
          this.marca = marca;
          this.modelo = modelo;
          this.precioBase = precioBase;
          this.tipoTransmision = tipoTransmision;
          this.vidriosElectricos = vidriosElectricos;
          this.aireAcondicionado = aireAcondicionado;

      

      }

    @Override
    public Double calcularPrecio() {
     
    Double precioBase = getPrecioBase();
    double incTransmision = precioBase * 0.05;
    double incVidriosElect = 400000d;
    double incAire =3000000d;
    
    
    if( tipoTransmision ==TipoTransmision.AUTOMATICA){

        if ((vidriosElectricos == true) && (aireAcondicionado == true) ){ 

           precioBase = precioBase + incTransmision + incVidriosElect + incAire;
            
            
        }else if (aireAcondicionado == false) { 
            precioBase = precioBase + incTransmision + incVidriosElect;
            
        }else if (vidriosElectricos == false) {
            precioBase = precioBase + incTransmision  + incAire;
        } 

     }else if ((vidriosElectricos == true) && (aireAcondicionado == true)) {
        precioBase = precioBase + incVidriosElect + incAire; //si transmision es manual

     }else if (aireAcondicionado == false) { 
        precioBase = precioBase +  incVidriosElect;
        
     }else if (vidriosElectricos == false) {
        precioBase = precioBase + incAire;
    } 

    return precioBase;

        
        
        
    }

    @Override
    public Double calcularPorcentajeImpuesto() {
        
        precioBase = calcularPrecio();
        


        

         return null;
    }}

    /**
     *
     */
   /* static Double precioBase = vehiculo.precioBase;

    private static final double inc_t_auto = 0.05 * precioBase;
    private static final int inc_vidElect = 400000;
    private static final int inc_aire = 3000000;
    private static final double impuesto = 0.1 * precioBase;

  
    public Double calcularPrecio( TipoTransmision transmision, Boolean vidriosElectricos, Boolean aireAcondicionado){

        if( transmision ==TipoTransmision.AUTOMATICA){

            if ((vidriosElectricos == true) && (aireAcondicionado == true) ){ 

               precioBase = precioBase + inc_t_auto + inc_vidElect + inc_aire;
                
                
            }else if (aireAcondicionado == false) { 
                precioBase = precioBase + inc_t_auto + inc_vidElect;
                
            }else if (vidriosElectricos == false) {
                precioBase = precioBase + inc_t_auto  + inc_aire;
            } 

         }else if ((vidriosElectricos == true) && (aireAcondicionado == true)) {
            precioBase = precioBase + inc_vidElect + inc_aire; //si transmision es manual

         }else if (aireAcondicionado == false) { 
            precioBase = precioBase +  inc_vidElect;
            
         }else if (vidriosElectricos == false) {
            precioBase = precioBase + inc_aire;
        } 

        return precioBase;
    }
    

    public Double calcularPorcentajeImpuesto() { 
        
        if (precioBase > 60000000){
            precioBase = precioBase + impuesto;
        }

        return precioBase;
    }



}*/
