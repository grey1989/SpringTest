package org.test.springTest.DAO;

import org.springframework.stereotype.Service;
import org.test.springTest.model.User;

@Service
public interface UserDao {
    User getUserByName(String username);
}
