package Services;

import Entities.User;
import Mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// AuthServiceImpl.java
@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String authenticate(String username, String password) {
        // Perform authentication logic here (e.g., check credentials against the database)
        User user = userMapper.findByUsername(username);

        if (user != null && password.equals(user.getPassword())) {
            // Generate JWT token
            return generateJwtToken(username);
        }

        return null;
    }

    private String generateJwtToken(String username) {
        // Implement JWT token generation logic here
        // You can use libraries like jjwt for this purpose
        return "your_generated_jwt_token";
    }
}
