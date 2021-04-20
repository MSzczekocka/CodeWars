package pl.martynaszczekocka;

public class CamelCase {
    static String toCamelCase(String s){
        String result = "";
        String temp = "";
        String[] words1 = s.split("-");
        String[] words2 = s.split("_");

        if (words1.length>1){
            for(int i=1; i<words1.length;i++){
                temp = temp + words1[i].substring(0, 1).toUpperCase() + words1[i].substring(1);
            }
            result = words1[0]+temp;
        }else{
            for(int i=1; i<words2.length;i++){
                temp = temp + words2[i].substring(0, 1).toUpperCase() + words2[i].substring(1);
            }
            result = words2[0]+temp;
        }
        return result;
    }
}
