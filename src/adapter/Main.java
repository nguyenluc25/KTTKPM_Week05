package adapter;

public class Main {
    public static void main(String[] args) {
        XMLTarget target = new TranslatorAdapter(new JSONAdaptee());
        target.processData("data");
    }
}
