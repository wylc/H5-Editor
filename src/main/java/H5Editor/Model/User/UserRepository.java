package H5Editor.Model.User;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MrCJ on 2016/12/8.
 */

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

    @Query("select u from User u where u.type = 1 and u.userId = ?1")
    User getUserById(long userId);

    @Query("select u from User u where u.type = 1")
    List<User> getAllUser();

    @Modifying // 不添加该注释，抛出org.hibernate.hql.QueryExecutionRequestException: Not supported for DML operations
    @Transactional  // 不添加该注释，抛出InvalidDataAccessApiUsageException: Executing an update/delete query
    @Query("update User u set u.username = ?2, u.password = ?3, u.email = ?4," +
            "u.tel = ?5, u.type = ?6, u.available = ?7" +
            " where u.userId = ?1")
    void modifyUserById(long userId, String username, String password, String email,
                        String tel, int type, boolean available);
}
