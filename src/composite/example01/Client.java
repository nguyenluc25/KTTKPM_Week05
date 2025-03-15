package composite.example01;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Component file1 = new File("file 1", 10);
        Component file2 = new File("file 2", 5);
        Component file3 = new File("file 3", 12);

        List<Component> files = Arrays.asList(file1, file2, file3);
        Component folder = new Folder(files);
        folder.showProperty();
        System.out.println("Total Size: " + folder.totalSize());
        
    }
}
