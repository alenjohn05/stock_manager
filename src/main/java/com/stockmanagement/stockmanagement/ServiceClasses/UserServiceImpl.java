package com.stockmanagement.stockmanagement.ServiceClasses;

import com.stockmanagement.stockmanagement.DtoClasses.UserDTO;
import com.stockmanagement.stockmanagement.Tables.User;
import com.stockmanagement.stockmanagement.Tables.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        User user = new User();
        return getUserDTO(userDTO, user);
    }

    private UserDTO getUserDTO(UserDTO userDTO, User user) {
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setCreatedAt(userDTO.getCreatedAt());
        user.setPortfolio(userDTO.getPortfolio());
        user.setTransaction(userDTO.getTransaction());
        User savedUser = userRepo.save(user);
        return getUserDTO(savedUser);
    }

    private UserDTO getUserDTO(User savedUser) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(savedUser.getUsername());
        userDTO.setEmail(savedUser.getEmail());
        userDTO.setPassword(savedUser.getPassword());
        userDTO.setCreatedAt(savedUser.getCreatedAt());
        userDTO.setPortfolio(savedUser.getPortfolio());
        userDTO.setTransaction(savedUser.getTransaction());
        return userDTO;
    }

    @Override
    public UserDTO getUser(Integer user_id) {
        User user = userRepo.findById(user_id).isPresent() ? userRepo.findById(user_id).get() : null;
        assert user != null;
        return getUserDTO(user);
    }

    @Override
    public UserDTO updateUser(Integer user_id, UserDTO userDTO) {
        User user = userRepo.findById(user_id).isPresent() ? userRepo.findById(user_id).get() : null;
        assert user != null;
        return getUserDTO(userDTO, user);
    }

    @Override
    public String deleteUser(Integer user_id) {
        User user = userRepo.findById(user_id).isPresent() ? userRepo.findById(user_id).get() : null;
        assert user != null;
        userRepo.delete(user);
        return "User deleted successfully";
    }

    @Override
    public String deleteAllUsers() {
        userRepo.deleteAll();
        return "All users deleted successfully";
    }

    @Override
    public List<UserDTO> searchByUsername(String username) {
        List<User> userList = userRepo.findByUsernameContaining(username);
        return userList.stream()
                .map(this::getUserDTO)
                .collect(Collectors.toList());
    }
    @Override
    public boolean userExists(String username, String email) {
        return userRepo.existsByUsernameOrEmail(username, email);
    }
    @Override
    public List<UserDTO> getAllUsers() {
        List<User> userList = userRepo.findAll();
        return userList.stream()
                .map(this::getUserDTO)
                .collect(Collectors.toList());
    }

}
