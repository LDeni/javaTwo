package server;

import java.util.ArrayList;
import java.util.List;

public class SimpleAuthService implements AuthService{

    private class UserData {
        String login;
        String password;
        String nickName;

        public UserData(String login, String password, String nickName) {
            this.login = login;
            this.password = password;
            this.nickName = nickName;
        }
    }

    List<UserData> users;

    public SimpleAuthService() {
        users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(new UserData("login" + i, "pass" + i, "nick" + i));
        }
        users.add(new UserData("a", "a", "a"));
        users.add(new UserData("b", "b", "b"));
        users.add(new UserData("c", "c", "c"));
    }

    @Override
    public String getNickByLoginAndPassword(String login, String password) {
        for(UserData user : users){
            if(user.login.equals(login) && user.password.equals(password)){
                return user.nickName;
            }
        }
        return null;
    }
}
