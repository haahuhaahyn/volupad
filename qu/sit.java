import java.util.ResourceBundle;

public class MyApp {
  public static void main(String[] args) {
    ResourceBundle bundle = ResourceBundle.getBundle("Messages");

    System.out.println(bundle.getString("greeting"));
    System.out.println(bundle.getString("farewell"));
  }
}
