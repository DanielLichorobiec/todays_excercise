package list;


import java.util.ArrayList;

public class GenealogicList {

   private TreeListElements x;
   static ArrayList<TreeListElements> list = new ArrayList<TreeListElements>();

    public GenealogicList(TreeListElements x) {
        list.add(x);
    }
}
