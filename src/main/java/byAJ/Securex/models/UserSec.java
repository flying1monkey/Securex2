package byAJ.Securex.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class UserSec
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<RoleSec> roles;

    public UserSec()
    {
        this.roles=new ArrayList<RoleSec>();
    }
    public void addRole(RoleSec role)
    {
        this.roles.add(role);
    }

    public long getUserId()
    {
        return userId;
    }

    public void setUserId(long userId)
    {
        this.userId = userId;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Collection<RoleSec> getRoles()
    {
        return roles;
    }

    public void setRoles(Collection<RoleSec> roles)
    {
        this.roles = roles;
    }
}
