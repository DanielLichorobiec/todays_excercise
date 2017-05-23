package list;

/**
 * Created by RENT on 2017-05-23.
 */
public class SingleListElements {

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    String string;

    public SingleListElements getNext() {
        return next;
    }

    public void setNext(SingleListElements next) {
        this.next = next;
    }

    SingleListElements next;


    public SingleListElements(String string, SingleListElements next) {
        this.string = string;
        this.next = next;
    }
}
