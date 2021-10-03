package setup;

public class Third {

    public static void CountLetter(String text){

        String result="";

        for (int i=0; i<text.length();i++){
            int count=0;
            for (int j=i+1; j<text.length(); j++){

                if (text.charAt(j)==text.charAt(i)){
                    count++;
                }
            }

            if (!result.contains(text.charAt(i)+"")){

                result +=count+text.charAt(i)+"";
            }
        }


        System.out.println(result);
    }


}
