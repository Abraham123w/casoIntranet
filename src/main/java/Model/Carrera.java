package Model;

import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private String codigo;
    private int semestres;
    private ArrayList<Estudiante> estudiantes;

    public Carrera(String nombre, String codigo, int semestres) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestres = semestres;
        estudiantes = new ArrayList<Estudiante>();
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        // Verifica si el estudiante ya existe en la carrera
        for (Estudiante e : estudiantes) {
            if (e.getRut().equals(estudiante.getRut())) {
                return false;
            }
        }
        estudiantes.add(estudiante);
        return true;
    }

    public boolean eliminarEstudiante(String rut) {
        // Busca y elimina el estudiante con el rut indicado
        for (Estudiante e : estudiantes) {
            if (e.getRut().equals(rut)) {
                estudiantes.remove(e);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}

