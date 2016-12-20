package H5Editor.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by MrCJ on 2016/12/8.
 */


@Data
@Entity
public class User {

    @Id
    private int userId;
    private String username;
    private String password;
    private String email;
    private String tel;
    private int type;
    private int available;

    public User(String name,String pass, String email, String tele, int type,int available) {
        this.username=name;
        this.password=pass;
        this.email=email;
        this.tel=tele;
        this.type=type;
        this.available=available;
    }

    @Override
    public String toString() {
        return "username = " + username;
    }
}