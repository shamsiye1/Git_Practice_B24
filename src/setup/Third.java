package setup;

public class Third {

    public static void CountLetter(String text){

        String result="";

        for (int i=0; i<text.length();i++){
            int count=1;
            // it should be started count from 1
            for (int j=i+1; j<text.length(); j++){

                if (text.charAt(j)==text.charAt(i)){
                    count++;
                }
            }

            if (!result.contains(text.charAt(i)+"")){

                result +=count+text.charAt(i)+"";
            }
        }

  //  added my new method
        System.out.println(result);
    }

    public static void m(){


    }

}
