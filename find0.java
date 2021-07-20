import java.util.Scanner;


class find0{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String toFind = sc.nextLine();
        boolean found = false;
        int i = 0;
        for(i = 0; i < toFind.length(); i++){
            if(toFind.charAt(i) == '0'){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("0 found at " + (i+1) + "th character");
        } else{
            System.out.println("Not Found");
        }
    }
}