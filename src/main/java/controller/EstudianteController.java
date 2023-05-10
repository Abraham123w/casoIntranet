package controller;

import Model.Carrera;
import Model.Estudiante;
import Model.dao.CarreraDao;
import Model.dao.EstudianteDao;
import data.DBConnector;
import data.DBGenerator;
import org.jooq.DSLContext;
//import Model.data.DBGenerator;

public class EstudianteController {


    public static boolean registrarEstudiante(String nombre, String rut, String matricula, String codigoCarrera) throws ClassNotFoundException {
        // Se establece una conexión con la base de datos llamada "Universidad"
        DSLContext query = DBGenerator.conectarBD("Universidad");
        // Se valida si ya existe un estudiante registrado con el mismo RUT en la base de datos
        if(!EstudianteDao.validarExistenciaEstudiante(query,"rut",rut)){
            // Si no existe, se busca la carrera correspondiente al código de carrera ingresado
            Carrera carrera =CarreraDao.buscarCarrera(query,codigoCarrera);
            // Se crea un objeto Estudiante con los datos ingresados y la carrera obtenida
            Estudiante estudiante= new Estudiante(rut,nombre,matricula,carrera);
            // Se agrega el estudiante a la base de datos ojo se envian query u objeto estudiante
            EstudianteDao.agregarEstudiante(query,estudiante);
            // Se cierra la conexión con la base de datos
            DBConnector.closeConnection();
            // Se retorna verdadero, indicando que el registro fue exitoso
            return true;
        }
        else{
            // Si ya existe un estudiante con el mismo RUT, se cierra la conexión y se retorna falso
            DBConnector.closeConnection();
            return false;
        }
    }

    public static String[][] mostrarEstudiantesPorCarrera(String codigo) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("Universidad");
        String[][] datosEstudiantes= EstudianteDao.obtenerEstudiantesCursoCodigo(query,codigo);
        DBConnector.closeConnection();
        return datosEstudiantes;
    }
    public static String[][] mostrarEstudiantesPorNombre(String codigo, String nombre) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("Universidad");
        String[][] datosEstudiantes = EstudianteDao.obtenerEstudiantesCursoNombre(query,nombre,codigo);
        DBConnector.closeConnection();
        return datosEstudiantes;
    }
}
