package gnu.gnuspring;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    int id;
    String username;
    String password;
    String email;
}
