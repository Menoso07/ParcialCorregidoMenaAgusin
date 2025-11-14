package parcial;

import java.util.Objects;

public class Plato {
    private String name ;
    private double price ;
    private TipoPreparacion tipoPreparacion ; 
    
    //constructor 
    public Plato(String name, double price, TipoPreparacion tipoPreparacion) {
        //no pude hacer funcionar que tire exception si se incicializa sin valores.
        //if (name == null || tipoPreparacion == null) {  
        //    throw new ConstructorVacioException("datos ");
        //}
        this.name = name ;
        this.price = price ;
        this.tipoPreparacion = tipoPreparacion ;
    }  
         

    //todos los getters 
    public String getName(){
        return name ;
    }
  
    public double getPrice(){
        return price ;
    }

    public TipoPreparacion getTipoPreparacion(){
        return tipoPreparacion ; 
    }

    //genero el hashcode unico al obj
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
    }
    
    //comparo 2 platos 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plato other = (Plato) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
    //printeo los detalles del plato inputeado
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plato{");
        sb.append(System.lineSeparator());
        sb.append(" name= ").append(name);
        sb.append(System.lineSeparator());
        sb.append(", price= ").append(price);
        sb.append(System.lineSeparator());
        sb.append(", tipoPreparacion= ").append(tipoPreparacion);
        sb.append(System.lineSeparator());        
        sb.append(" }");
        return sb.toString();
    }  
}
