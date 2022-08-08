package Examen;

public class Cliente extends Person {
    private String nombre_persona;
    private String telefono_de_contacto;

    private Empresa empresa;
    public Cliente(String nombre_persona, String telefono_de_contacto) {
        this.nombre_persona = nombre_persona;
        this.telefono_de_contacto = telefono_de_contacto;
    }
    
    @Override
    public void mostrar()
    {
        
    }
}
