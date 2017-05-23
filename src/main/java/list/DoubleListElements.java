package list;

public class DoubleListElements {
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    String string;

    public DoubleListElements getNext() {
        return next;
    }

    public void setNext(DoubleListElements next) {
        this.next = next;
    }

    DoubleListElements next;

    public DoubleListElements getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleListElements previous) {
        this.previous = previous;
    }

    DoubleListElements previous;

    public DoubleListElements(String string) {
        this.string = string;
        this.previous = previous;
        this.next = next;
    }
}
