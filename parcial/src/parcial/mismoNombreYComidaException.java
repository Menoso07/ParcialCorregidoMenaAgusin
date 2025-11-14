package parcial;

public class mismoNombreYComidaException extends RuntimeException {
    
    public mismoNombreYComidaException(){
        
        //super();
    }
    
    public mismoNombreYComidaException(String mensaje){
        super(mensaje);
    }
}
