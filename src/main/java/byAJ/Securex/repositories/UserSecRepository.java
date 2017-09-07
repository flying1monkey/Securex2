package byAJ.Securex.repositories;

import byAJ.Securex.models.UserSec;
import org.springframework.data.repository.CrudRepository;

public interface UserSecRepository extends CrudRepository<UserSec,Long>
{
    UserSec findByUsername(String username);
}
