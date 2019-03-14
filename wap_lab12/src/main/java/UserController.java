public class UserController {
    User user;

    public UserController(){
        user = new User();
    }

    public boolean checkUser(String name, String pass ) {
        if(name.equals(user.getUserName()) && pass.equals(user.getUserPassword())  ) {
                return true;
        }
        return false;
    }
}
