import java.util.ArrayList;

class DynamicArray1 {

    public static void main(String[] args) {
        final int TAILLE = 10;
        ArrayList<Integer> tab = new ArrayList<Integer>();
        for (int i = 0; i < TAILLE; ++i) {
            tab.add(tab.size());
        }
        for (int val : tab) {
            System.out.println(val);
        }
    }
}
class DynamicArray2 {
    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList<Integer>();
        tab1.add(99);
        tab1.add(1);
        tab1.add(0);

        ArrayList<Integer> tab2 = new ArrayList<Integer>();
        for(int i=0; i < tab1.size(); ++i) {
            tab2.add(tab1.get(0));
        }
        for (int val : tab2) {
            System.out.println(val);
        }
    }
}