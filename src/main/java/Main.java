import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Converter <String, Integer> converter = new Converter("Mario", 34);
        String att1=converter.getS();
        Integer att2= converter.getT();

        Converter <Double, String> converter2 = new Converter(0.34, "Rosa");
        Double att3=converter2.getS();
        String att4= converter2.getT();

        File filex = new File("test.txt");
        ValueWriter <List<Integer>> num = new ValueWriter(List.of(3, 4, 5));

        try {
            num.save(filex);
        } catch (IOException e) {
            System.out.println("Errore, impossibile scrivire sul file!");
        }


    }
}
