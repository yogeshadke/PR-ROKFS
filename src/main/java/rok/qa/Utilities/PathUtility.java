package rok.qa.Utilities;

import java.io.File;

public class PathUtility {

    // Method to get the project root directory
    public static String getProjectRoot() {
        return System.getProperty("user.dir");
    }

    // Method to get the path of a specific folder inside the project
    public static String getFolderPath(String folderName) {
        return getProjectRoot() + File.separator + folderName;
    }

    // Method to get the path of a file inside a specific folder
    public static String getFilePathInFolder(String folderName, String fileName) {
        return getFolderPath(folderName) + File.separator + fileName;
    }
}
