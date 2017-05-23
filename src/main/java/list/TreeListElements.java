package list;

public class TreeListElements {


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    String string;


    public TreeListElements getNext() {
        return next;
    }

    public void setNext(TreeListElements next) {
        this.next = next;
    }

    TreeListElements next;


    public TreeListElements(String string) {
        this.string = string;
        this.next = next;
    }
}
