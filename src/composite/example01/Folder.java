package composite.example01;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component{
    private List<Component> files = new ArrayList<>();

    public Folder(List<Component> files) {
        this.files = files;
    }

    @Override
    public void showProperty() {
        for (Component file : files) {
            file.showProperty();
        }
    }

    @Override
    public long totalSize() {
        long total = 0;
        for (Component file : files) {
            total += file.totalSize();
        }
        return total;
    }
}
