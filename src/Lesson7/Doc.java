package Lesson7;
public abstract class Doc implements Printable {
    private String docName;

    public Doc(String docName) {
        this.docName = docName;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public void printName(){
        System.out.printf("Name of document %s",docName);
    }
}
