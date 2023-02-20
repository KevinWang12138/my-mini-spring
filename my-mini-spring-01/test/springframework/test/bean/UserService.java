package springframework.test.bean;

public class UserService {
    private String name;
    public UserService(String name){
        this.name=name;
    }
    public void hello(){
        System.out.println(this.name);
    }
}
