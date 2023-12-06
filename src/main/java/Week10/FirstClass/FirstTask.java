package Week10.FirstClass;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CanSendMessage
{ }
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface RequiresPermission
{
    int level () default 0;
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface UserPermission
{
    int level () default 0;
}
@UserPermission(level = 1)
class User
{
    private String username;
    public User(String username){
        this.username=username;
    }
    public String getUsername(){
        return this.username;
    }

}
@UserPermission(level = 2)
class Admin
{
    private String username;
    public Admin(String username){
        this.username= username;
    }
    public String getUsername(){
        return this.username;
    }

}


public class FirstTask {
    @CanSendMessage
    @RequiresPermission(level=1)
    public void sendMessage(User user, String name){
        System.out.println("User" + user.getUsername());
    }
    @CanSendMessage
    @RequiresPermission(level = 2 )
    public void sendMessage(Admin admin, String message){
        System.out.println("Admin "+ admin.getUsername());
    }

    public static void main(String[] args) {
        FirstTask t1 = new FirstTask();
        User u1 = new User("User");
        Admin a1 = new Admin("Admin");
        t1.sendMessage(u1,"Something");
        t1.sendMessage(a1,"SomethingElse");
    }

}
