package com.csaba79coder.openapispringangular.controller;

import com.csaba79coder.api.UserApi;
import com.csaba79coder.model.NewUserModel;
import com.csaba79coder.model.UserModel;
import com.csaba79coder.openapispringangular.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final UserService userService;


    @Override
    public ResponseEntity<UserModel> addNewUser(NewUserModel body) {
        return ResponseEntity.status(201).body(userService.addNewUser(body));
    }

    @Override
    public ResponseEntity<List<UserModel>> renderAllUsers() {
        return ResponseEntity.status(200).body(userService.finalAllUsers());
    }
}
