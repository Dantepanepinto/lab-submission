import java.io.File;
import java.io.FileFilter;

public class SubdirectoriesFinder {


    public static File[] getSubdirectories(File directory) {
        File[] subdirectories = directory.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
        return subdirectories;
    }


    public static File[] getSubdirectoriesWithLambda(File directory) {
        File[] subdirectories = directory.listFiles(file -> file.isDirectory());
        return subdirectories;
    }

    public static void main(String[] args) {

        File parentDirectory = new File("/Users/dantepanepinto/Desktop/lab-submission/");
        File[] subdirectories = getSubdirectories(parentDirectory);
        System.out.println("Subdirectories using FileFilter:");
        for (File subdirectory : subdirectories) {
            System.out.println(subdirectory.getAbsolutePath());
        }
        subdirectories = getSubdirectoriesWithLambda(parentDirectory);
        System.out.println("Subdirectories using lambda expression:");
        for (File subdirectory : subdirectories) {
            System.out.println(subdirectory.getAbsolutePath());
        }
    }
}

