
package compress_decompress;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class decompressor {
    public static void method(File file) throws IOException
    {
        String fileDirector = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzip = new GZIPInputStream(fis);

        FileOutputStream fos = new FileOutputStream(fileDirector+"/decompressedFile");

        byte[] buffer = new byte[1024];
        int len;
        while((len=gzip.read(buffer))!=-1)
            fos.write(buffer,0,len);
        gzip.close();
        fis.close();
        fos.close();

    }
    public static void main(String[] args) throws IOException
    {
        File path = new File("D:\\java-programes\\compress_decompree\\decompressor");
        //method(path);
    }
}


