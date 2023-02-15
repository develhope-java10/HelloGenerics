public class Main {
    public static void main(String[] args) {


        Converter <String, Integer> converter = new Converter("Mario", 34);
        String att1=converter.getS();
        Integer att2= converter.getT();

        Converter <Double, String> converter2 = new Converter(0.34, "Rosa");
        Double att3=converter2.getS();
        String att4= converter2.getT();
    }
}
