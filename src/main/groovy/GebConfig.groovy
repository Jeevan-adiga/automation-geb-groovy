import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

baseUrl = "http://a.testaddressbook.com/"

driver = {
    DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome()
    WebDriverManager.chromedriver().setup()
    RemoteWebDriver webDriver = new ChromeDriver(desiredCapabilities)
    webDriver
}

waiting {
    timeout = 45
    retryInterval = 0.5
    includeCausesInMessage = true
    presets {
        veryslow {
            timeout = 60
            retryInterval = 1
        }
        slow {
            timeout = 30
            retryInterval = 1
        }
        quick {
            timeout = 10
            retryInterval = 0.5
        }
        veryquick {
            timeout = 1
            retryInterval = 0.1
        }
    }
}