import java.util.Arrays;

public class Leet14 {
    public static String commonSequence(String[] str)
    {
        StringBuffer sb = new StringBuffer();
        //it will convert string to a chracter
        Arrays.sort(str);
        char[] arr1=str[0].toCharArray();
        char[] arr2=str[str.length-1].toCharArray();

        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i]!=arr2[i])
                break;

            sb.append(arr1[i]);
        }
        return sb.toString();

    }
    public static void main(String[] args) {

       String str= new Leet14().commonSequence(new String[] {"flower","flow","flight"});
       System.out.println(str);

      //  String[] str = {"flower","flow","flight"};
      //  System.out.println(commonSequence(str));
    }
}
