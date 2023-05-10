package controller;

import Model.Carrera;
import Model.dao.CarreraDao;
import data.DBConnector;
import data.DBGenerator;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;

public class CarreraController {


   public static boolean añadirCarrera(String nombreCarrera, String codigoCarrera, int cantSemestres) throws ClassNotFoundException {
        // Se conecta a la base de datos Universidad
        DSLContext query = DBGenerator.conectarBD("Universidad");

        // Verifica si la carrera ya existe en la base de datos
        if(!CarreraDao.validarExistenciaCarrera(query,"codigo",codigoCarrera)){
            // Crea un objeto Carrera con los datos ingresados
            Carrera carrera = new Carrera(nombreCarrera, codigoCarrera, cantSemestres);

            // Agrega la carrera a la base de datos
            CarreraDao.agregarCarrera(query, carrera);

            // Cierra la conexión a la base de datos
            DBConnector.closeConnection();

            // Retorna true si se agrega la carrera correctamente
            return true;
        }
        else{
            // Retorna false si la carrera ya existe
            return false;
        }
    }
    public static Object[] getCodigoCarreras() throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("Universidad");
        Object[] carreras = CarreraDao.getCodigoCarreras(query);
        DBConnector.closeConnection();
        return carreras;
    }
}

