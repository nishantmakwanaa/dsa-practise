import src.Btrees;

public class Main {

    public static void main(String[] args) {

        Btrees tree = new Btrees();

        tree.insert(50);
        tree.insert(30);

        tree.insert(20);
        tree.insert(40);
        tree.insert(70);

        tree.printInorder();

    }
}