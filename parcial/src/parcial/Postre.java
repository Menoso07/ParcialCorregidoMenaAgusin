package parcial;

public class Postre extends Plato implements Decoracion {
    
    private boolean tieneAzucar ; 
    
    public Postre(String name, double price,TipoPreparacion tipoPreparacion,boolean tieneAzucar) {
        super(name, price, tipoPreparacion) ;
        this.tieneAzucar = tieneAzucar ;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Postre{ ");
        sb.append(" tieneAzucar= ").append(tieneAzucar);
        sb.append(" }");
        sb.append(System.lineSeparator());
        return sb.toString();
    }
    
    @Override
    public void decorar(){
       System.out.println("Esto es: "+this.getName()+" soy una "+this.getClass().getSimpleName()+" ya me decoraron");  
    }
    
}
