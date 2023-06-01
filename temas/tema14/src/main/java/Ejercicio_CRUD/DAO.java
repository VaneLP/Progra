package Ejercicio_CRUD;

import java.util.List;
import java.util.Optional;

public interface DAO<T> { //le indicamos una T para poder posteriormente indicar el tipo de dato que vayamos a usar
    Optional<T> obtener(String id);
    List<T> obtenerTodos();

    void guardar(T t);
    void actualizar(T t);
    void borrar(T t);

}
