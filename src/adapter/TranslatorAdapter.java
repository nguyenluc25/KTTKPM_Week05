package adapter;

public class TranslatorAdapter implements XMLTarget {
    private JSONAdaptee adaptee;

    public TranslatorAdapter(JSONAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void processData(String data) {
        adaptee.processXML(data);
    }

    // Chuyển đổi XML sang JSON
    public void processDataXML(String data) {
        System.out.println("Dữ liệu XML: " + data);
        System.out.println("Dữ liệu JSON: " + "<JSON>" + data + "</JSON>");
    }
}
