package restApiTest_components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserData {
    public int id;
    public String email;
    public String first_name;
    public String last_name;
    public String avatar;
}
