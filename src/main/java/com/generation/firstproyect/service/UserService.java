package com.generation.firstproyect.service;

import java.util.List;

import com.generation.firstproyect.model.User;

public interface UserService {
    //esta funcion me traerá TODOS los usuarios que tenga
    List<User> getAll();

    //esta funcion me dejará agregar usuarios
    void add(User user);

    //esta funcion me deja eliminar eliminar usuarios
    void remove (User user);

    // esta funcion me permite obtener el tamaño del arreglo y map
    int size();
    
    // esta funcion me permite obtener un usuario segun su posicion
    User getUser(int position);
    
}
