package com.csaba79coder.openapispringangular.service;

import com.csaba79coder.model.NewUserModel;
import com.csaba79coder.model.UserModel;
import com.csaba79coder.openapispringangular.persistence.UserRepository;
import com.csaba79coder.openapispringangular.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserModel addNewUser(NewUserModel newUserModel) {
        return Mapper.mapUserEntityToUModel(userRepository.save(Mapper.mapNewUserModelToEntity(newUserModel)));
    }

    public List<UserModel> finalAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(Mapper::mapUserEntityToUModel)
                .collect(Collectors.toList());
    }
}
