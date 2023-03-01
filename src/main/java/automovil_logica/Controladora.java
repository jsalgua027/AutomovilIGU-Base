package automovil_logica;

import automovil_persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    // vamos a conectar la controladora de la logica que recibe los datos de la igu y se los pasamos a la controladora de la persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String matricula, int cantPuertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setMatricula(matricula);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAutomovil(auto);
        
    }
    // este metod llama a la persistencia parar traer los autos

    public List<Automovil> traerAutos() {
        
        return controlPersis.traerAutos();
        
    }
    
    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }
    
    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAutos(idAuto);
    }
    
    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String matricula, int cantPuertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setMatricula(matricula);
        auto.setCantPuertas(cantPuertas);
        
       // le pido a la persistencia que lo modificque
       controlPersis.modificarAuto(auto);
        
    }
    
}
