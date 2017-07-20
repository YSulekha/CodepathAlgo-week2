import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aharyadi on 7/20/17.
 */
public class Anagrams {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        HashMap<String,Integer> ana = new HashMap<String,Integer>();
        int k=0;

        for(int i = 0;i <a.size();i++){
            String s = sortString(a.get(i));

            if(ana.containsKey(s)){

                result.get(ana.get(s)).add(i+1);

            }
            else{
                ArrayList<Integer> res  =new ArrayList<Integer>();
                res.add(i+1);
                result.add(res);
                ana.put(s,k);
                k++;
            }
        }
        return result;
    }

    public String sortString(String x){
        char[] c = x.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
