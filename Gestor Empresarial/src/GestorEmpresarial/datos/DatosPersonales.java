package GestorEmpresarial.datos;

public class DatosPersonales {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String whatsapp;


    protected int getid(){
        return id;
    }
    protected void setid(){
        this.id=5;
    }
    protected String getnombre(){
        return nombre;
    }
    protected void setnombre(){
        this.nombre=nombre;
    }
    protected String getapellido(){
        return apellido;
    }
    protected void setapellido(){
        this.apellido=apellido;
    }
    protected String getCorreo(){
        return correo;
    }
    protected void setCorreo(){
        this.correo=correo;
    }
    protected String getWhatsapp(){
        return whatsapp;
    }
    protected void setWhatsapp(){
        this.whatsapp=whatsapp;
    }
}
