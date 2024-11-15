public class PaisesDeAmerica {
    public static void main(String[] args) {
        // Matriz que contiene todos los países de América
        String[] paisesDeAmerica = {
            "Antigua y Barbuda", "Argentina", "Bahamas", "Barbados", "Belice", "Bolivia", "Brasil", 
            "Canadá", "Chile", "Colombia", "Costa Rica", "Cuba", "Dominica", "Ecuador", "El Salvador", 
            "Estados Unidos", "Granada", "Guatemala", "Guyana", "Haití", "Honduras", "Jamaica", 
            "México", "Nicaragua", "Panamá", "Paraguay", "Perú", "República Dominicana", 
            "San Cristóbal y Nieves", "San Vicente y las Granadinas", "Santa Lucía", "Surinam", 
            "Trinidad y Tobago", "Uruguay", "Venezuela"
        };

        // Mostrar todos los países en el listado
        System.out.println("Listado de países de América:");
        int con1=0;
        for (String pais : paisesDeAmerica) {
            con1=con1+1;
            System.out.println(con1 + ". " + pais);
        }
        
        System.out.println("Países de América con 4 letras:");
        for (String pais : paisesDeAmerica) {
            if (pais.length() == 4) { // Verifica si el país tiene 4 letras
                System.out.println("- " + pais);
            }
            
        }
    }
}

