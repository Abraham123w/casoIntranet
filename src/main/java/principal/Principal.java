package principal;

//import Model.dao.CarreraDao;
//import Model.dao.EstudianteDao;

//import Model.data.DBGenerator;
import controller.EstudianteController;
import data.DBGenerator;
import gui.VentanaBienvenida;

public class Principal {
  public static void main(String[] args) throws ClassNotFoundException {
        DBGenerator.iniciarBD("Universidad");
        VentanaBienvenida ventanaBienvenida = new VentanaBienvenida();
    }


}
//Resumen 3. estamos implementando las ventanas cambiamos la dimencion de un arreglo relaicionado a los atributos de estudiante
//quiza nos pueda traer complicaciones mas adelante
//Resumen 2. paso uno metodo registrar estudiante en gui recibiendo solo los atributos y enviandolos a controller para verificacion
/* en controller se verifican los datos y si es correcto usando metodos de dao, se crea un objeto  se envian el objeto mas el
 query(conexión con la base de datos) a dao para anadir.*/


/*RESUMEN 1 VENTANA LLAMA METODOS CONTROLLER(REGISTRAR ESTUDIANTE) Y CONTROLLER A ESTUDIANTE DAO PARA FINALMENTE REGISTRAR
EL ESTUDIANTE
 */
