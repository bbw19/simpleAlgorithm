import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    }
    public int LaRousse(int A, int B) {

        ArrayList<Integer> X = new ArrayList<Integer>();
        ArrayList<Integer> Y = new ArrayList<Integer>();
        ArrayList<Integer> Z = new ArrayList<Integer>();

        X.add(A);
        Y.add(B);

        int Xcount = 0;
        while (A > 0) {

            if (X.get(Xcount) % 2 != 0) {
                Z.add(X.get(Xcount));
            } else {
                Z.add(0);
            }

            if (A % 2 == 0) {
                X.add(A / 2);
            } else {
                X.add(0);
            }

            B = B * 2;
            Y.add(B);

            Xcount = Xcount + 1;
        }
        int sum = 0;
        for (int i = 0; i < X.size(); i = i + 1) {
            sum = sum + X.get(i);
        }

        return sum;
    }
}
