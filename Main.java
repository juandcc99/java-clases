public class Main{
    
    public static void main(String[] args){
        /* CODE */
        // Jugador jugador = new Jugador();
        // jugador.jugar();
        
        Cliente cliente = new Cliente("Juan", "Almansa", 10000);
        
        // System.out.println(cliente.getNombre());
        // System.out.println(cliente.getCiudad());
        // System.out.println(cliente.getPresupuesto());
        
        cliente.setCiudad("Sevilla");
        
        System.out.println(cliente.getCiudad());
        cliente.fichaCliente();
        
        Cliente cliente2 = new Cliente("Vass", "Valencia", 12000);
        cliente2.fichaCliente();
    }
    
}//cierra la clase
