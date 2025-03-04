import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Main{

    public static void main(String[] args) throws IOException {
        
        
        File f = new File("data.txt");

        f.createNewFile();
        System.out.println(f.exists());

        FileReader fr = new FileReader("data.txt");

        BufferedReader br = new BufferedReader(fr);

        String str = br.readLine();

        while(str!=null){

            System.out.println(str);
            str = br.readLine();
        }

        br.close();

        System.out.println("done");
    }
}