package composite.example01;

public class File implements Component {
    private String name;
    private long size;

    public File(String name, long size) {
        super();
        this.name = name;
        this.size = size;
    }

    @Override
    public long totalSize() {
        return size;
    }

    @Override
    public void showProperty() {
        System.out.println("FileLeaf [name=" + name + ", size=" + size + "]");
    }
}
