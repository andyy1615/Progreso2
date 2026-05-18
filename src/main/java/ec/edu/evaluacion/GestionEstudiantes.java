package ec.edu.evaluacion;

import java.util.ArrayList;

public class GestionEstudiantes {
    private ArrayList<Estudiante> estudiantes;
    public GestionEstudiantes() {
        estudiantes = new ArrayList<>();
        precargarEstudiantes();
    }

    private void precargarEstudiantes() {
        estudiantes.add(new Estudiante(101, "Ana Torres", "Software", 8.5));
        estudiantes.add(new Estudiante(102, "Juan Pérez", "TI", 7.2));
        estudiantes.add(new Estudiante(103, "Carla López", "Computación", 9.1));
        estudiantes.add(new Estudiante(104, "Luis Mena", "Software", 6.8));
        estudiantes.add(new Estudiante(105, "María Ruiz", "TI", 8.9));
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        if (buscarPorCodigoSecuencial(estudiante.getCodigo())){
            return false;
        }
        estudiantes.add(estudiante);
        return true;
    }

    public boolean buscarPorCodigoSecuencial(int codigo) {
        for (Estudiante e:estudiantes){
            if (e.getCodigo()==codigo){
                return true;
            }
        }
        return false;
    }

    public Estudiante buscarPorNombreSecuencial(String nombre) {
        for (Estudiante e :estudiantes){
            if (e.getNombre().equalsIgnoreCase(nombre)){
                return e;
            }
        }
        return null;
    }

    public Estudiante buscarPorCodigoBinario(int codigo) {
        ordenarPorCodigoAscendente();
        int inicio=0;
        int fin= estudiantes.size() -1;

        while (inicio<=fin){int medio = (inicio +fin)/2;
            if (estudiantes.get(medio).getCodigo()==codigo){
                return estudiantes.get(medio);
            }
            if (codigo<estudiantes.get(medio).getCodigo()){
                fin=medio-1;
            }else {
                inicio=medio+1;
            }
        }
        return null;
    }

    public ArrayList<Estudiante> ordenarPorPromedioDescendente() {
        for (int i=0;i<estudiantes.size()-1;i++){
            for (int j=0;j<estudiantes.size()-1-i;j++){
                if (estudiantes.get(j).getPromedio()<estudiantes.get(j+1).getPromedio()){
                    Estudiante aux =estudiantes.get(j);
                    estudiantes.set(j,estudiantes.get(j+1));
                    estudiantes.set(j+1,aux);
                }
            }

        }

        return null;
    }

    public ArrayList<Estudiante> ordenarPorCodigoAscendente() {
        for (int i=0;i<estudiantes.size()-1;i++){
            for (int j=0;j<estudiantes.size()-1-1;j++){
                if (estudiantes.get(j).getCodigo()>estudiantes.get(j+1).getCodigo()){
                    Estudiante aux=estudiantes.get(j);
                    estudiantes.set(j,estudiantes.get(j+1));
                    estudiantes.set(j+1,aux);
                }
            }
        }
        return null;
    }

    public int contarRecursivo(int indice) {
        if (indice==estudiantes.size()){
            return 0;
        }
        return 1+ contarRecursivo(indice+1);

    }

    public double sumaPromediosRecursiva(int indice) {
        if (indice==estudiantes.size()){
            return 0;
        }
        return estudiantes.get(indice).getPromedio()+sumaPromediosRecursiva(indice+1);

    }

    public double promedioGeneralRecursivo() {
        if (estudiantes.isEmpty()){
            return 0;
        }
        return sumaPromediosRecursiva(0)/contarRecursivo(0);

    }

    public double mayorPromedioRecursivo(int indice) {
        if (indice==estudiantes.size()-1){
            return estudiantes.get(indice).getPromedio();
        }
        double mayorResto= mayorPromedioRecursivo(indice+1);
        if (estudiantes.get(indice).getPromedio()>mayorResto){
            return estudiantes.get(indice).getPromedio();
        }
        return mayorResto;

    }


}
