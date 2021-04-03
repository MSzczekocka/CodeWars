package pl.martynaszczekocka;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        int size =0;
        int temp =0;
        for (int i=0; i< arr.length;i++){
            switch (arr[i].toLowerCase()){
                case "north":
                    for (int j=0; j< arr.length;j++){
                        if (arr[j].toLowerCase().equals("south")) {
                            arr[i]="";
                            arr[j]= "";
                            break;
                        }
                    }
                    break;
                case "south":
                    for (int j=0; j< arr.length;j++){
                        if (arr[j].toLowerCase().equals("north")) {
                            arr[i]="";
                            arr[j]= "";
                            break;
                        }
                    }
                    break;
                case "east":
                    for (int j=0; j< arr.length;j++){
                        if (arr[j].toLowerCase().equals("west")) {
                            arr[i]="";
                            arr[j]= "";
                            break;
                        }
                    }
                    break;
                case "west":
                    for (int j=0; j< arr.length;j++){
                        if (arr[j].toLowerCase().equals("east")) {
                            arr[i]="";
                            arr[j]= "";
                            break;
                        }
                    }
                    break;
            }
        }

        for (int i=0; i<arr.length; i++){
            if (!arr[i].equals("")) size++;
        }

        String[] result = new String[size];

        for (int i=0; i<arr.length; i++){
            if (!arr[i].equals("")){
                result[temp] = arr[i];
                temp ++;
            }
        }

        return result;
    }
}
