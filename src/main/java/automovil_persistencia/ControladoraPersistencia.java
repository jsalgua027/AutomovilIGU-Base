package automovil_persistencia;

import automovil_logica.Automovil;
import automovil_persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
// creo objeto jpa creado en la persistencia que contiene los metodos nos mapea los datos
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        
        autoJpa.create(auto);
        
    }
// la persostencia se comunica con la base de datos

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
    }
// la persistencia le dice a la base de datos que id borrar; java te obliga a implemtar la excepcion si te equivocas de id, no bloquees el sistema 

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Automovil traerAutos(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }
    
    public void modificarAuto(Automovil auto) {
        
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
