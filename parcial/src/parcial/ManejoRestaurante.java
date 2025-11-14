package parcial;

public class ManejoRestaurante {
    
    public static void main(String[]args){
        System.out.println("Gestion de restorante");
        
        //instancio restoran (el "controlador")
        Restaurante restaurante = new Restaurante();
        
        //Instancio distintas comidas dentro del try/catch por excepciones
        try {
            Entrada bruschetta = new Entrada("Bruschetta",2300,TipoPreparacion.FRIO,2);
            Entrada pancho = new Entrada("PanchoCompleto",2300,TipoPreparacion.CALIENTE,3);
            PlatoPrincipal fideos = new PlatoPrincipal("FideosConTuco",5700,TipoPreparacion.CALIENTE,90);
            PlatoPrincipal fideos1 = new PlatoPrincipal("FideosConTuco",5700,TipoPreparacion.CALIENTE,90);
            Postre flan = new Postre("Flan",2500,TipoPreparacion.FRIO,true);    
            
            restaurante.agregarPlato(pancho);
            restaurante.agregarPlato(fideos);
            //restaurante.agregarPlato(fideos1);
            restaurante.agregarPlato(flan);
            
            restaurante.mostrarPlatos();
            restaurante.prepararPlatos();
            restaurante.decorarPlatos();
            restaurante.filtrarPorTipoPreparacion(TipoPreparacion.CALIENTE);
            restaurante.filtrarPorTipoPlato("PlatoPrincipal");
            
        }
        catch (mismoNombreYComidaException er){
            System.out.println(er.getMessage());
        }
        
    }
}
