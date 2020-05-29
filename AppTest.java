
import java.util.*;

public class AppTest {

  public static void main(String[] args) {
    create(args);
  }

  private static void create(String [] args) {
    int length = args.length;
    if(length >= 3) {
      User user = new User();
      user.setId(Long.parseLong(args[0]));
      user.setUsername(args[1]);
      user.setPassword(args[2]);
      user.setActive(args[3] != null ? (Integer.parseInt(args[3]) == 1 ? true : false) : false);
      List<Role> roles = Arrays.asList( new Role(1L, "ADMIN"), new Role(2L, "USER"), new Role(3L, "READ-ONLY"));
      user.setRoles(roles);
      System.out.println(user);
    } else {
      System.out.println("Parametres insuffissants : " + length);
    }
  }

  /**  User class **/
  static class User {
    private Long id;
    private String username;
    private String password;
    private boolean isActive;
    private List<Role> roles = new ArrayList<>();

    public User() {}

    public User(Long id, String username, String password, boolean isActive) {
      this.id = id;
      this.username = username;
      this.password = password;
      this.isActive = isActive;
    }

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }

    public boolean isActive() {
      return isActive;
    }

    public void setActive(boolean isActive) {
      this.isActive = isActive;
    }

    public List<Role> getRoles() {
      return roles;
    }

    public void setRoles(List<Role> roles) {
      this.roles = roles;
    }

    @Override
    public String toString() {
      return "\nID : " + id + "\nUsername : " + username + "\nPassword : " + password + "\nActive : " + (isActive ? "Oui" : "Non") + "\nRoles : " + roles;
    }
  }

  /** User's rules **/
  static class Role {
    private Long id;
    private String roleName;

    public Role() {}

    public Role(Long id, String roleName) {
      this.id = id;
      this.roleName = roleName;
    }

    @Override
    public String toString() {
      return "ID : " + id + " - Role : " + roleName;
    }
  }
}
