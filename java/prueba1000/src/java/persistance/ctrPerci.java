
package persistance;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistance.exceptions.NonexistentEntityException;


public class ctrPerci {
    
    PersonaJpaController persJPA = new PersonaJpaController();
    
    public void crearPersona(Persona per){
        
        persJPA.create(per);
    }
    
    public void eliminarPersona(int id){
        try {
            persJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ctrPerci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPersona (Persona pers){
        try {
            persJPA.destroy(pers.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ctrPerci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Persona> traerPersonas(){
        return persJPA.findPersonaEntities();
    }
}
