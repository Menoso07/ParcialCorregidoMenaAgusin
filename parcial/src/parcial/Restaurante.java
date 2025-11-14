package parcial;

import java.util.ArrayList;

public class Restaurante {
    //defino los arrays
    private ArrayList<Plato> lista ;
    
    public Restaurante(){
        this.lista = new ArrayList();
    }
    
    //primer funcion
    public void agregarPlato(Plato plato){
        if (this.lista.contains(plato)){
            throw new mismoNombreYComidaException("El plato: "+plato.getName()+"ya está en la lista");
        }
        this.lista.add(plato) ;
        System.out.println("Plato agregado Exitosamente");
        
    }
    //func mostrar
    public void mostrarPlatos(){
        System.out.println("Platos del restoran");
        System.out.println("+++++++++++++++++++++");
        System.out.println("cantidad de comidas ingresados: "+ this.lista.size());
        
        for (Plato plato : this.lista){
            System.out.println(plato);
            System.out.println("+++++++++++++");
            //System.out.println("")
                  
        }           
    }
    //filtro según interfaces 
    public void prepararPlatos(){
        for (Plato plato : this.lista){
            if (plato instanceof Preparacion){
                ((Preparacion) plato).preparar();
            }
            else{
                System.out.println("No se puede preparar el plato: "+plato.getName());
            }
        }
    }  
    
    public void decorarPlatos(){
        for (Plato plato : this.lista){
            if (plato instanceof Decoracion){
                ((Decoracion) plato).decorar();
            }
            else{
                System.out.println("No se puede decorar el plato: "+plato.getName());
            }
        }
    }    
    //filtro segun enum
    public void filtrarPorTipoPreparacion(TipoPreparacion tipoPreparacion){
        System.out.println("Platos segun tipo preparacion: " + tipoPreparacion);
        for(Plato plato : this.lista){
            if(plato.getTipoPreparacion().equals(this)){
                System.out.println(plato);
            }
        }
    }
    //filtro segun tipo de plato 
    public void filtrarPorTipoPlato(String filtroPlato){
        System.out.println("Tipos de platos segun: " + filtroPlato);
        for(Plato plato : this.lista){
            if(plato != null){
                //Switch xq es mas eficiente/rapido que un if, elif, else
                switch (filtroPlato){
                    case "Entrada":
                        if(plato instanceof Entrada entrada){
                            System.out.println(entrada);
                        }
                        break ;
                    case "PlatoPrincipal" :
                        if(plato instanceof PlatoPrincipal platoprincipal){
                            System.out.println(platoprincipal);
                        }
                        break ;
                    case "Postre" :
                        if(plato instanceof Postre postre){
                            System.out.println(postre);
                        }
                        break ;
                }
            }else{
                //preparar una excepcion para aca 
                System.out.println("No hay ningun plato");
            }
        }
    }
}