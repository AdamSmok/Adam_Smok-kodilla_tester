package com.kodilla.testcontainers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode;
import org.testcontainers.containers.DefaultRecordingFileFactory;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class BrowserTest {

    private BrowserWebDriverContainer<?> browserContainer;

    @BeforeEach
    public void setUp() {
        browserContainer = new BrowserWebDriverContainer<>()
                .withCapabilities(new ChromeOptions())
                .withRecordingMode(VncRecordingMode.RECORD_ALL, new File("./build/"))
                .withRecordingFileFactory(new DefaultRecordingFileFactory());
        browserContainer.start();
    }

    @Test
    public void chromeTest() throws IOException {
        RemoteWebDriver driver = browserContainer.getWebDriver();
        driver.get("http://host.docker.internal:55000/");
        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,
                new File("./build/screenshots/" + screenshot.getName()));
    }

    @AfterEach
    public void tearDown() {
        if (browserContainer != null) {
            browserContainer.stop();
        }
    }
}
