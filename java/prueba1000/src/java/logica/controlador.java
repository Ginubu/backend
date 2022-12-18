//es un main 


package logica;

import java.util.List;
import persistance.ctrPerci;


public class controlador {
    ctrPerci ctrP = new ctrPerci();
    
    public void crearPersona(Persona per){
        ctrP.crearPersona(per);
    }
    
    public void eliminarPersona(int id){
        ctrP.eliminarPersona(id);
    }
    
    public void eliminarPersona(Persona per){
        ctrP.eliminarPersona(per);
    }
    
    public List<Persona> traerPersonas(){
        return ctrP.traerPersonas();
    }
}
