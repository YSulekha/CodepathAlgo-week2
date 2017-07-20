import java.util.HashMap;

/**
 * Created by aharyadi on 7/20/17.
 */
public class colorfulNumber {
    public int colorful(int a) {
        HashMap<Integer,Integer> color = new HashMap<Integer,Integer>();
        String x = String.valueOf(a);

        for(int i = 0;i<x.length();i++){
            int product = 1;
            for(int j = i;j < x.length();j++){
                product = product * (x.charAt(j) - '0');
                if(color.containsKey(product)){
                    return 0;
                }
                color.put(product,j);
            }
        }
        return 1;


    }
}
