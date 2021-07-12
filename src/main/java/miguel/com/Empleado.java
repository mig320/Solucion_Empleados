package miguel.com;

public class Empleado extends Persona {

    private Double sueldoBruto;
    private Directivo categoria;
    private Empresa empresa; 
    
    public Boolean Directivo(){
        Boolean directivo = false;
        if (categoria != null){
            directivo = true;
        }
        
        return directivo;

    }


    public String mostrar() {
        return null;

    }

    public Double calcularSalarioNeto() {
        return null;

    }

}
