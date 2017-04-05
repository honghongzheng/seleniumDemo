package me.zhaopeng.demo.zzsh;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

import org.openqa.selenium.support.ui.ExpectedCondition;  
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // 如果你的 FireFox 没有安装在默认目录，那么必须在程序中设置  
//        System.setProperty("webdriver.gecko.driver", "/Applications/Firefox.app/Contents/MacOS/firefox"); 
        System.setProperty("webdriver.chrome.driver", "/Applications/Google\\ Chrome.app/Contents/MacOS/Google\\ Chrome");

        System.out.println("Helo");

        // 创建一个 FireFox 的浏览器实例  
        WebDriver driver = new ChromeDriver();  
//        WebDriver driver = new FirefoxDriver();  
  
        // 让浏览器访问 Baidu  
        driver.get("http://www.baidu.com");  
        // 用下面代码也可以实现  
//         driver.navigate().to("http://www.baidu.com");  
  
        // 获取 网页的 title  
        System.out.println("1 Page title is: " + driver.getTitle());  
  
        // 通过 id 找到 input 的 DOM  
        WebElement element = driver.findElement(By.id("kw"));  
  
        // 输入关键字  
        element.sendKeys("zTree");  
  
        // 提交 input 所在的  form  
        element.submit();  
           
        // 通过判断 title 内容等待搜索页面加载完毕，间隔10秒  
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {  
//            public Boolean apply(WebDriver d) {  
//                return d.getTitle().toLowerCase().endsWith("ztree");  
//            }  
//        });  
  
        // 显示搜索结果页面的 title  
        System.out.println("2 Page title is: " + driver.getTitle());  
           
        //关闭浏览器  
        driver.quit();  
    }
}
