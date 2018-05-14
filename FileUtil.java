import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class FileUtil 
{

	//test
       public static long getFileSize(String file) throws IOException
       {
            return getFileSize(new File(file));

       }
        public static long getFileSize(File file) throws IOException
    {
        try(FileInputStream fis = new FileInputStream(file)){
        long size = 0;
        byte[] tmp = new byte[1024];
        int b=0;
        while((b = fis.read(tmp))!=-1)
        {
            
            size+=b;

        }
        return size;
    }
    
    }
}
