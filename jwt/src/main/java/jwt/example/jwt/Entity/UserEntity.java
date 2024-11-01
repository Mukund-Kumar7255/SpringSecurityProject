package jwt.example.jwt.Entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntity {

    private String userId;
    private String name;
    private String email;
}
