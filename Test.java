
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
public class Test {
    public void print(){
        System.out.print(FileSystems.getDefault().getPath(new String()).toAbsolutePath());
    }
    public static void main(String[]args){
        Test test =new Test();
        test.print();
    }
}
