import java.util.*;
class palinambigen
{
    public static String i(String s)
    {
        String t="";
        for(int i=1;i<=4-s.length();i++)
        t=t+"0";
        return (t+s);
    }
    public static void check(String st)
    {
        String t="";
        int flag=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            t=ch+t;
            if(ch!='0' && ch!='1' && ch!='2' && ch!='5' && ch!='8')
            flag=1;
        }
        if(flag==0 && st.equals(t))
        System.out.println(st);
    }
    public static void main()
    {
        Scanner s=new Scanner(System.in);
        String st,d,m;
        for(int i=1;i<=2022;i++)        //U can find such dates till the end of time but i don't recommend it unless u have a quantum computer.
        for(int j=1;j<=12;j++)
        for(int k=1;k<=31;k++)
        {
            st=((Integer.toString(k)).length()==1?"0"+k:""+k)+((Integer.toString(j)).length()==1?"0"+j:""+j)+((Integer.toString(i)).length()>=4?""+i:""+i(""+i));
            check(st);
            st="";
        }
    }
}
