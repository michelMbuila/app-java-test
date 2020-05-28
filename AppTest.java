
public class AppTest {

  private static long id = 0L;

  public static void main(String[] args) {
    create(args);
  }

  private static void create(String [] args) {
    int length = args.length;
    if(length >= 2 ) {
      User user = new User();
      user.setId(id++);
      user.setUsername(args[0]);
      user.setPassword(args[1]);
      user.setActive(args[2] != null ? (Integer.parseInt(args[2]) == 1 ? true : false) : false);
      System.out.println(user);
    } else {
      System.out.println("Parametres insuffissants : " + length);
    }
  }

  static class User {
    private Long id;
    private String username;
    private String password;
    private boolean isActive;

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

    @Override
    public String toString() {
      return "\nID : " + id + "\nUsername : " + username + "\nPassword : " + password + "\nActive : " + (isActive ? "Oui" : "Non");
    }
  }
}
