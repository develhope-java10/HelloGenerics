import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ValueWriter <H>{

    private H h;

    public ValueWriter(H h) {
        this.h = h;
    }

    public H getH() {
        return h;
    }
    public void save(File file) throws IOException {

        FileWriter fw= new FileWriter(file);
        fw.write(h.toString());
        fw.close();
    }
}
