class Solution {
    public int largestInteger(int num) {//numbers ko easily raverse nhi kr skte isiliye ISLIYE CHAR KE ARRAYS KO string me convert kr
    char[] arr=  String.valueOf(num).toCharArray();
    //eevn odd ki alag alag lits bnegi
    List<Integer>even = new ArrayList<>();
    List<Integer>odd = new ArrayList<>();
    //digit ko cahr me convert or even or odd ko alag kr do
    for(char ch:arr){
        int digit = ch - '0';
        if(digit % 2==0){
            even.add(digit);

        }else{
            odd.add(digit);
        }
    }
 //descending order
 even.sort(Collections.reverseOrder());
 odd.sort(Collections.reverseOrder());//evemn opr odd ki alg alg list banke descendong oreder me sort ho chuki h
 int e =0;
 int o =0;//ab dono 0 pe h ab decide hoag pejle konsa elemnt ayga 0 index pe
 //ab pura ek ek hi string me chahiye isilye
 StringBuilder ans= new StringBuilder();

 for (char ch : arr){
    int digit = ch-'0';

    //ab line agr even h to even ka sabse bada number uthao or odd h to odd ka 
    if(digit%2==0){
        ans.append(even.get(e++));
    }else{
        ans.append(odd.get(o++));
    }
 }
//ab apn mne  swap kr liya h to vapse string ko numbers me rretutnkkrne k eliey
        return Integer.parseInt(ans.toString());
    }
}