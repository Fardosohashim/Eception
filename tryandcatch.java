package Exception;

import java.io.IOException;
import java.io.RandomAccessFile;

public class tryandcatch {
    public static void main(String[] args) throws IOException {
        RandomAccessFile input=null;
        String line = null;
        try{
            String file= null;
            input=new RandomAccessFile(file , "r");
            while((line= input.readLine())!=null){
                System.out.println(line);
            }
            return ;
        }catch (Exception e ){
            System.out.println("file doesn't exist:");
        }
        finally {
            if(input!=null){
                input.close();
            }
        }
    }
}
