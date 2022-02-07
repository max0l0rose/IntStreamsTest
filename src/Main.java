import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//        System.out.println(new Main().func(new int[] {10, 20, 30, 40, 50}, 0, 3));
        System.out.println(new Main().func2("123", "321"));
    }

    double func(int[] array, int n1, int n2) {
        double res = IntStream.range(n1, n2).map( i -> {
            return array[i];
        }).average().getAsDouble();
        return res;
    }


    boolean func2(String str, String str2) {
        //str.contentEquals();
        //str.equals();
        IntStream.range(0, str.length()).forEach( i -> {
            System.out.println(i);
            CharSequence sequence = str.subSequence(i, i+1);
            sequence.chars().forEach(v -> {
                final StringBuilder sb = new StringBuilder();
                sb.append(v);
                System.out.println(" " + sb);
            });
            if (!str2.contains(sequence))
                throw new IllegalArgumentException();
            //return i;
        });
        return true;
    }

}
