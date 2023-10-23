
package carritocompra;
public class Usuario {
 
    //Atributos
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
  
    //constructor vacio
    
    public Usuario ()
    {
        this.dni="";
        this.nombre = "";
        this.apellido1="";
        this.apellido2 = "";
      
    }
    
    //Constructor parcial
    public Usuario (String paramDni, String paramNombre)
    {
        this.dni=paramDni;
        this.nombre = paramNombre;
        this.apellido1="";
        this.apellido2 = "";
    }
    
   
    //Constructor completo 
    public Usuario (String paramDni, String paramNombre, String paramApellido1, String paramApellido2)
    {
        this.dni=paramDni;
        this.nombre = paramNombre;
        this.apellido1=paramApellido1;
        this.apellido2 = paramApellido2;
    }
    
    
    //Get y set de dni
    
    public String getDni()
    {
        return this.dni;
    }
    
    public void setDni(String pDni)
    {
        this.dni= pDni;
    }
    
    //Get y set de nombre
    public String getNombre()
    {
        return this.nombre;
    }
    
    
    public void setNombre(String pNombre)
    {
        this.nombre = pNombre;
    }
    
    //Get y set de apellido1
    
    public String getApellido1()
    {
        return this.apellido1 ;
    }
    
    
    public void setApellido1(String pApellido1)
    {
        this.apellido1 = pApellido1;
    }
    //Get y set de apellido2
    
    public String getApellido2()
    {
        return this.apellido2;
    }
    
    public void setApellido2(String pApelldio2)
    {
        this.apellido2 = pApelldio2;
    }
    
    
    
    
    
    
}
