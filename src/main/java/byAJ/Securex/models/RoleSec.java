package byAJ.Securex.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class RoleSec
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleId;

    @Column(unique = true)
    private String role;

    @ManyToMany(mappedBy="roles")
    private Collection<UserSec> users;

    public RoleSec()
    {
        this.users=new ArrayList<UserSec>();
    }

    public void addUser(UserSec user)
    {
        this.users.add(user);
    }

    public long getRoleId()
    {
        return roleId;
    }

    public void setRoleId(long roleId)
    {
        this.roleId = roleId;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public Collection<UserSec> getUsers()
    {
        return users;
    }

    public void setUsers(Collection<UserSec> users)
    {
        this.users = users;
    }
}
