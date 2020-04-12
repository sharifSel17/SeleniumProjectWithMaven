import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sharif.ny\\IdeaProjects\\SeleniumProject\\src\\drivers\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get("https://github.com/");
        obj.close();
    }
}
