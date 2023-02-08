package Lesson12;

public class BufferEx {
    public static void main(String[] args) {
        String str = "Java";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("Capacity is " + stringBuffer.capacity());
        stringBuffer.ensureCapacity(32);
        System.out.println("Capacity is " + stringBuffer.capacity());
        System.out.println("Length is " + stringBuffer.length());

        StringBuffer strBuffer = new StringBuffer("Hello ");
        strBuffer.append(stringBuffer);
        System.out.println(strBuffer.toString());

        strBuffer.insert(strBuffer.length(),'!');
        System.out.println(strBuffer.toString());

        strBuffer.delete(0,2);
        System.out.println(strBuffer);
        strBuffer.insert(0,"He");

        String str1 = strBuffer.substring(4);
        System.out.println(str1);
        System.out.println(str1.substring(0,2));

        strBuffer.replace(6,10,"Dear");
        System.out.println(strBuffer);

        strBuffer.reverse();
        strBuffer.replace(6,10,"Dear");
        System.out.println(strBuffer.toString());
    }
}
