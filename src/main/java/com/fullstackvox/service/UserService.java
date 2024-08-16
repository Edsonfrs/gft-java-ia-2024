package com.fullstackvox.service;

import com.fullstackvox.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user);

}
