package list;

public class TreeListElements {


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    private String string;


    public TreeListElements getNext() {
            return next;
    }

    public void setNext(TreeListElements next) {
        this.next = next;
        new GenealogicList(next);
    }

    private TreeListElements next;


    public TreeListElements(String string) {
        this.string = string;
    }
}