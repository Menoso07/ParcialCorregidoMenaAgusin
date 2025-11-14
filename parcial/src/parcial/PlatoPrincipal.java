package parcial;

public class PlatoPrincipal extends Plato implements Preparacion {
    
    private int tiempoCoccion ;
    
    //constructor
    public PlatoPrincipal(String name, double price,TipoPreparacion tipoPreparacion,int tiempoCoccion) {
        super(name, price, tipoPreparacion);
        this.tiempoCoccion = tiempoCoccion ;
    }
    //implemento interfaz
    @Override 
    public void preparar(){
       System.out.println("Esto es: "+this.getName()+" soy una "+this.getClass().getSimpleName()+" ya me prepararon");  
    }
    //printeo
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("PlatoPrincipal { ");
        sb.append(" tiempoCoccion = ").append(tiempoCoccion);
        sb.append(" }");
        sb.append(System.lineSeparator());
        return sb.toString();
    }   
}
