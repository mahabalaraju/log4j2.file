package com.worker.Service;

import com.worker.Entity.User;
import com.worker.dto.userRegistration;

public interface userService {
User save(userRegistration  reg);
}
