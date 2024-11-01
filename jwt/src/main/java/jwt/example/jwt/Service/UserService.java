package jwt.example.jwt.Service;

import jwt.example.jwt.Entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<UserEntity> store=new ArrayList<>();
    public  UserService() {
        store.add(new UserEntity(UUID.randomUUID().toString(), "John Doe", "johndoe@example.com"));
        store.add(new UserEntity(UUID.randomUUID().toString(), "Mukund Kumar", "kumarmukund632@gmail.com"));
        store.add(new UserEntity(UUID.randomUUID().toString(), "Venkata Srinivasan", "venkatasrinivasan@gmail.com"));
    }
    public List<UserEntity> getUsers() {
        return this.store;
    }
}
