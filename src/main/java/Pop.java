import java.util.ArrayList;
import java.util.List;

public class Pop {
    public void aop(List list) {

        po:for (int i = 0; i < list.size(); i++) {
            for (int a = i + 1; a <= list.size(); a++) {
                int count = 0;
                if (i == a) {
                    count++;

                }

            }
        }
    }

    public static int f(int x) {
        if (x == 1 || x == 2)
            return 1;
        else
            return f(x - 1) + f(x - 2);
    }

    public static void main(String[] args) {
        int i=0;
        for(i=1;i<=20;i++)
            System.out.println(f(i));
    }
}


