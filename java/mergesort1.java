import java.util.Arrays;

public class mergesort1 {
    keytype key;
    index link;
}
public static index mergesort (index low, index high)
        {
            index mid, list1 list2, mergeedlistist;

            if (low == high){
                mergedlist =  low;
                arr[mergelist].link =0;
        }
            else {
                mid =[(low +high) /2 ];
                list1 = mergesort(low,high);
                list2 = mergesort(mid+1, high);
                mergedlist = merge(list1, list2);
        }
            return mergelist;
        }
public  static index merge(index list1, index list2)
        {
            index lastsorted, mergedlist;

            if (arr[list1].key < arr[list2].key){
                mergedlist = list1;
                list1 =arr[list1].link;
        }
            else {
                mergelist = list2;
                list2 = S[list].link;
        }
            lastsorted = mergedlist;
            while (list1 != 0 && list2 !=0)
                if arr[list1].key < arr[list2].key{
                    arr[lastsorted].link = list1;
                    list1 = arr[list1].link;

        }
                else {
                    arr[lastsorted].link = list2;
                    lastsorted = list2;
                    list2 = arr[list2].link;
        }
                if (list1 == 0)
                    arr[lastsorted].link = list2;
                else
                    arr[lastsorted].link = list1;
                return mergedlist
        }