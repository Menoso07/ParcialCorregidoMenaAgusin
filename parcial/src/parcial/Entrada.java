package parcial;

public class Entrada extends Plato implements Preparacion, Decoracion{
    
    private int cantidadIngredientes ;
    
    public Entrada(String name, double price, TipoPreparacion tipoPreparacion, int cantidadIngredientes) {
        super(name, price, tipoPreparacion);
        this.cantidadIngredientes = cantidadIngredientes ; 
    }
    
    //implemento interfaces
    @Override 
    public void preparar(){
       System.out.println("Esto es: "+this.getName()+" soy una "+this.getClass().getSimpleName()+" ya me prepararon");  
    }
    
    @Override 
    public void decorar(){
        System.out.println("Esto es: "+this.getName()+" soy un "+this.getClass().getSimpleName()+" ya me decoraron");
    }
    //printeo
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Entrada{ ");
        sb.append(" cantidadIngredientes= ").append(cantidadIngredientes);
        sb.append(System.lineSeparator());
        return sb.toString();
    }
  
}
