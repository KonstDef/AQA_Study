package Lesson11.IO;

import java.io.ByteArrayInputStream;

public class ByteArrayStreamEx {
    public static void main(String[] args) {
        byte[] buffer = new byte[]{5,2,11,9,123,111};
        ByteArrayInputStream bis = new ByteArrayInputStream(buffer);

        for(int i = bis.read(); i!=-1; i=bis.read()){
            System.out.println(i);
        }
        System.out.println("----------");

        String text = "Skymachine";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(text.getBytes());
        for(int j = byteArrayInputStream.read(); j!=-1; j=byteArrayInputStream.read()){
            System.out.println("Byte: "+j+". Has char value: "+(char)j);
        }
    }
}
