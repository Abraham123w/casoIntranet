package principal;

import Model.dao.CarreraDao;
import Model.dao.EstudianteDao;

import controller.EstudianteController;
import gui.VentanaBienvenida;

public class Principal {
    public static void main(String[] args) {

     /*   Automotora automotora= new Automotora();
        automotora= AutomotoraController.cargaMasivaDatos(automotora);
        VentanaMenuBienvenida ventana= new VentanaMenuBienvenida(automotora);*/
        CarreraDao carreraDao= new CarreraDao();
        EstudianteDao estudianteDao= new EstudianteDao();
       //carreraDao = CarreraController.cargaMasivaDeDatos();
      // estudianteDao= EstudianteController.cargaMasivaDeDatos();
        //VentanaBienvenida ventanaBienvenida= new VentanaBienvenida(carreraDAO,EstudianteDao);

    }
}

/*¡Claro! Voy a resumir todo el proceso en pasos claros y ordenados:

1.Se ha definido una entidad llamada Estudiante, que representa a un estudiante en la base de datos.
2.Se ha creado una interfaz EstudianteDAO que define los métodos que se utilizarán para interactuar con la base de datos
de los estudiantes.
3.Se ha creado una clase EstudianteDAOImpl que implementa la interfaz EstudianteDAO y define los métodos para realizar
 operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos de los estudiantes.
4.Se ha creado una clase EstudianteView que define la interfaz gráfica de usuario (GUI) para que el usuario pueda interactuar
con la aplicación.
5.Se ha creado una clase EstudianteController que actúa como intermediario entre la EstudianteView y el EstudianteDAO, y maneja
 las acciones del usuario y la comunicación entre la GUI y la base de datos.
6.En la clase EstudianteView, se han definido los componentes de la GUI, como botones y campos de texto, y se ha creado
una acción para cada botón que llama a un método del controlador.
7.En la clase EstudianteController, se han definido los métodos que manejan las acciones del usuario, se ha utilizado
el EstudianteDAO para realizar operaciones en la base de datos y se ha utilizado la EstudianteView para actualizar la GUI.
8.En la clase App, se ha creado una instancia del DAO y del controlador, y se ha mostrado la vista al usuario.

Con estos pasos, se ha creado una aplicación Java utilizando el patrón de diseño MVC, que incluye un DAO para
manejar las operaciones de la base de datos, una GUI para que el usuario pueda interactuar con la aplicación y
un controlador para manejar las acciones del usuario y comunicarse con el DAO y la GUI.*/