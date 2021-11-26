public class Cliente{
    
    /*
     * PROPIEDADES
     */
    private String nombre, ciudad;
    private double presupuesto; 
    
    
    /*
     * CONSTUCTOR
     */
    public Cliente(String nombre,String ciudad, double presupuesto){
    	this.nombre=nombre;
	    this.ciudad=ciudad;
	    this.presupuesto=presupuesto;
    }
    
    
    /*
     * GETTER AND SETTER
     */
    public String getNombre(){
        return this.nombre;
    }
    public String getCiudad(){
        return this.ciudad;
    }
    public double getPresupuesto(){
        return this.presupuesto;
    }
    
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public void setCiudad (String ciudad){
        this.ciudad=ciudad;
    }
    public void setPresupuesto (double presupuesto){
        this.presupuesto=presupuesto;
    }
    
    public void fichaCliente(){
        System.out.println("El cliente " +nombre+ "-" +ciudad+ " tiene un presupuesto de " +presupuesto);
    }
}
