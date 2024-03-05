import com.zhangdapao.ui.GameJFrame;
import com.zhangdapao.ui.LoginJFrame;
import com.zhangdapao.ui.RegisterJFrame;

public class App {
    public static void main(String[] args){
        //  创建主界面
        new GameJFrame();
        //创建登录界面
        new LoginJFrame();
        //创建注册界面
        new RegisterJFrame();
    }
}
