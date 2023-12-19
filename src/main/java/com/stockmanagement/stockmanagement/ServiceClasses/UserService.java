package com.stockmanagement.stockmanagement.ServiceClasses;

import com.stockmanagement.stockmanagement.DtoClasses.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO addUser(UserDTO userDTO);
    UserDTO getUser(Integer user_id);
    UserDTO updateUser(Integer user_id, UserDTO userDTO);
    String deleteUser(Integer user_id);

    String deleteAllUsers();

    List<UserDTO> searchByUsername(String username);

    boolean userExists(String username, String email);

    List<UserDTO> getAllUsers();
}
