package com.ams.amsapi.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.amsapi.model.Users;
import com.ams.amsapi.repository.UsersRepository;

@Service
public class UsersBusiness {

    private UsersRepository usersRepository;

    @Autowired
    public UsersBusiness(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Boolean authenticate(Users authenticate) {
        // Busca o usuário pelo nome de usuário
        Users user = usersRepository.findByUsername(authenticate.getUsername());

        if (user != null && user.getPassword().equals(authenticate.getPassword())) {
            return true; // Senha válida
        } else {
            return false; // Senha inválida ou usuário não encontrado
        }
    }
    
    public Users findByUsername(String username) {
    	return usersRepository.findByUsername(username);
    }
}
