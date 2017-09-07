package byAJ.Securex.repositories;

import byAJ.Securex.models.RoleSec;
import org.springframework.data.repository.CrudRepository;

public interface RoleSecRepository extends CrudRepository<RoleSec,Long>
{
    RoleSec findByRole(String r);
}
