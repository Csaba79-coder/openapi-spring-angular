package com.csaba79coder.openapispringangular.util;

import com.csaba79coder.model.NewUserModel;
import com.csaba79coder.model.UserModel;
import com.csaba79coder.openapispringangular.entity.User;
import org.modelmapper.ModelMapper;

public class Mapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static User mapNewUserModelToEntity(NewUserModel model) {
        return modelMapper.map(model, User.class);
    }

    public static UserModel mapUserEntityToUModel(User user) {
        return modelMapper.map(user, UserModel.class);
    }

    private Mapper() {

    }
}
