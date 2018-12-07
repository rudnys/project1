import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = {2, 4, 3, 2, 3, 1, 2, 1, 3, 3};

        migratoryBirds(Arrays.asList(arr));
    }


    static int sockMerchant(int n, int[] ar) {
        HashSet<Integer> set = new HashSet<Integer>();
        int cont = 0;
        int pair = 0;

        for (int i = 0; i < n; i++) {
            if (!set.contains(ar[i])) {
                for (int j = 1; j < n; j++) {
                    if (ar[i] == ar[j]) {
                        cont++;
                    }
                }
                pair = pair + cont % 2;
                cont = 0;
            }
        }
        return pair;
    }


        // Complete the migratoryBirds function below.
        static int migratoryBirds(List<Integer> arr) {
            HashSet<Integer> map1= new HashSet< Integer>();
            ArrayList<Integer> map= new ArrayList<>();

            int cont=1;
            int value=0;

            for(int i =0; i< arr.size(); i++){
                if(! map1.contains(arr.get(i))){
                    value= arr.get(i);
                    map1.add(value);
                    for(int j=i+1;j<arr.size(); j++){
                        if(arr.get(i)==arr.get(j)){
                            cont ++;
                        }
                    }
                    if(map.isEmpty()){
                        map.add(0,value);
                        map.add(1,cont);
                    }else  {
                        if(map.get(1)<cont){
                            map.set(0,value);
                            map.set(1,cont);
                        }
                        else  if(map.get(1)==cont){
                            if(map.get(0)>value){
                                map.set(0,value);
                                map.set(1,cont);

                            }
                        }
                    }
                    cont=1;
                }



            }
            return map.get(0);
        }

    }
