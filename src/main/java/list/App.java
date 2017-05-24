package list;

public class App {
    public static void main(String[] args) {

//        //single list elements
//        SingleListElements seg3 = new SingleListElements("kota. ", null);
//        SingleListElements seg2 = new SingleListElements("ma ", seg3);
//        SingleListElements seg1 = new SingleListElements("Ala ", seg2);
//
//        SingleListElements current = seg1;
//        while (current != null) {
//            System.out.print(current.getString());
//            current = current.getNext();
//        }
//
//        //double list elements
//        DoubleListElements deg1 = new DoubleListElements("X");
//        DoubleListElements deg2 = new DoubleListElements("a");
//        DoubleListElements deg3 = new DoubleListElements("n");
//        DoubleListElements deg4 = new DoubleListElements("a");
//        DoubleListElements deg5 = new DoubleListElements("x");
//
//        deg1.setPrevious(null);
//        deg1.setNext(deg2);
//        deg2.setPrevious(deg1);
//        deg2.setNext(deg3);
//        deg3.setPrevious(deg2);
//        deg3.setNext(deg4);
//        deg4.setPrevious(deg3);
//        deg4.setNext(deg5);
//        deg5.setPrevious(deg4);
//        deg5.setNext(null);
//
//        DoubleListElements current2 = deg1;
//        while (current2 != null) {
//            System.out.print(current2.getString());
//            current2 = current2.getNext();
//       }
        //tree list elements
        TreeListElements el1 = new TreeListElements("Pradziadzio i prababcio");
        TreeListElements el2 = new TreeListElements("Dziadzio i babcio 1");
        TreeListElements el3 = new TreeListElements("Dziadzio i babcio 2");
        TreeListElements el4 = new TreeListElements("Mamo i tato 1");
        TreeListElements el5 = new TreeListElements("Mamo i tato 2");
        TreeListElements el6 = new TreeListElements("Mamo i tato 1");
        TreeListElements el7 = new TreeListElements("Mamo i tato 2");
        TreeListElements el8 = new TreeListElements("Mamo i tato 3");


        el1.setNext(el2);
        el1.setNext(el3);
        el2.setNext(el4);
        el2.setNext(el5);
        el3.setNext(el6);
        el3.setNext(el7);
        el3.setNext(el8);




    }
    public String recursion(TreeListElements x){
        if(x.getNext() != null){
            System.out.println(x.getString());
            recursion(x.getNext());
        }
    }
}

