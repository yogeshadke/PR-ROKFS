package Wrapper;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload {

    // Method to upload a file using the Robot class
    public static void uploadFile(String filePath) {
        try {
            // Set the clipboard with the file path
            setClipboardData(filePath);

            // Create a Robot object
            Robot robot = new Robot();

            // Open the file upload dialog (you may need to customize this based on your application)
            openFileUploadDialog(robot);

            // Paste the file path from the clipboard
            pasteClipboardData(robot);

            // Press Enter to confirm the file upload
            pressEnter(robot);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to set the clipboard data
    private static void setClipboardData(String data) {
        StringSelection stringSelection = new StringSelection(data);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    // Method to open the file upload dialog (customize based on your application)
    private static void openFileUploadDialog(Robot robot) {
        // Example: Press Ctrl + O to open the dialog
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Wait for a short duration (customize based on your application)
        robot.delay(1000);
    }

    // Method to paste data from the clipboard
    private static void pasteClipboardData(Robot robot) {
        // Example: Press Ctrl + V to paste
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Wait for a short duration (customize based on your application)
        robot.delay(1000);
    }

    // Method to press Enter key
    private static void pressEnter(Robot robot) {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void main(String[] args) {
        // Example usage: Provide the dynamic file path
        String filePath = "C:\\path\\to\\your\\file.txt";
        uploadFile(filePath);
    }
    
    //File Upload By Using Element
    public static void uploadFile(WebDriver driver, By fileInputLocator, String filePath) {
        WebElement fileInput = driver.findElement(fileInputLocator);
        fileInput.sendKeys(filePath);
    }
}

