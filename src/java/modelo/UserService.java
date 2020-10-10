
package modelo;

public class UserService {
   public  UserService(){
   } 

public  java.util.List<werservice.Productos> listar(java.lang.String name) {
        werservice.Servicios_Service service = new werservice.Servicios_Service();
        werservice.Servicios port = service.getServiciosPort();
        return port.listar(name);
    }




   
}
