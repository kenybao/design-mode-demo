package bbs;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author 73598.
 * @Date 2018/5/4 0004.
 * @Time 10:02.
 */
public class CharsetTest {
    @Test
    public void testCharset() throws IOException {
        String a = "我";
        File file = new File("aa.txt");
        if (file.exists()){
            System.out.println("exist");
        }
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalPath());
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        fileOutputStream.write(a.getBytes("UTF-8"));
//        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        int read;
        while ((read = fileInputStream.read()) != -1){
            System.out.println(read);
        }
    }
}
