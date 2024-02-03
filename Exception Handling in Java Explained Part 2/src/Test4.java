
import java.io.File;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\abc.txt");
        //helps avoid checked exception temporarily
        f.createNewFile();
        //throws is an indication there is a need of
        //exception handling here try/catch
    }
}
