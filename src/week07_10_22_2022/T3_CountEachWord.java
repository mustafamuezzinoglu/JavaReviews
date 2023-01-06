package week07_10_22_2022;

public class  T3_CountEachWord  {
    public static void main(String[] args) {


        String names = "Adam Adam Barry Aysun Aysun";
        String result="";
        String temp="";
            for (int i = 0; i <names.length() ; i++) {
            char ch=names.charAt(i);

            //we need to find pne by one
            if(ch!=' '){
                temp+=ch;
                continue; // we need to find word in order to continue to next statement
            }

            String search=temp;
            //in order to count word

            int counter=0;
            String dumy=names;
            while (dumy.contains(search)){
                counter++;
                dumy=dumy.replaceFirst(search,"");
        }
          if (! result.contains(search))
            result+=search + "_"+ counter +"\n ";
                temp="";
        }
        System.out.println("result = \n" + result);


    }
    /*Count each name in sentence.

            input :

    String names = "Adam Adam Barry Aysun Aysun";

    output:

    Adam-2 Barry-1 Aysun-2*/
}
