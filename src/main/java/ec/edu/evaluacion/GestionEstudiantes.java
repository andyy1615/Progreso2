package ec.edu.evaluacion;

import java.util.ArrayList;
import java.util.List;

public class GestionEstudiantes {
    private ArrayList<Estudiante> estudiantes;

    public GestionEstudiantes() {


    }

    private void precargarEstudiantes() {
        estudiantes.add(new Estudiante(101, "Ana Torres", "Software", 8.5));
        estudiantes.add(new Estudiante(102, "Juan Pérez", "TI", 7.2));
        estudiantes.add(new Estudiante(103, "Carla López", "Computación", 9.1));
        estudiantes.add(new Estudiante(104, "Luis Mena", "Software", 6.8));
        estudiantes.add(new Estudiante(105, "María Ruiz", "TI", 8.9));
    }

    public boolean agregarEstudiante(Estudiante estudiante) {

    }

    public Estudiante buscarPorCodigoSecuencial(int codigo) {



    }

    public Estudiante buscarPorNombreSecuencial(String nombre) {

    }

    public Estudiante buscarPorCodigoBinario(int codigo) {

    }

    public ArrayList<Estudiante> ordenarPorPromedioDescendente() {

    }

    public ArrayList<Estudiante> ordenarPorCodigoAscendente() {

    }

    public int contarRecursivo(int indice) {

    }

    public double sumaPromediosRecursiva(int indice) {

    }

    public double promedioGeneralRecursivo() {

    }

    public double mayorPromedioRecursivo(int indice) {

    }


}
