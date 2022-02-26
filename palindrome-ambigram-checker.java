import java.util.*;
class palinambichecker
{
    public static void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a no.");
        String st=s.next(),t="";
        int flag=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            t=ch+t;
            if(ch!='0' && ch!='1' && ch!='2' && ch!='5' && ch!='8')           //The only Ambigram digits in the number system(0-9) are 0,1,2,5 and 8.
            flag=1;
        }
        if(flag==0 && st.equals(t))
        System.out.println("The number is Palindrome & Ambigram both");
        else
        System.out.println("The number is not Palindrome & Ambigram");
    }
}
