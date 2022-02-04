import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    int s;
    int e;

    Lecture(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Lecture L) {
        if (this.e == L.e) {
            return this.s - L.s;
        } else {
            return this.e - L.e;
        }
    }

}

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            arr.add(new Lecture(a, b));
        }

        Collections.sort(arr);

        int answer = 0;
        int ed = 0;

        for (Lecture tmp : arr) {
            if (ed <= tmp.s) {
                answer++;
                ed = tmp.e;
            }
        }

        System.out.println(answer);
    }
}
