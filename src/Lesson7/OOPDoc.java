package Lesson7;
public class OOPDoc extends Doc{
    public OOPDoc(String docName) {
        super(docName);
    }

    @Override
    public void print() {
        printName();
        System.out.println();
    }

}
