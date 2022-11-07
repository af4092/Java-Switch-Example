import java.util.Scanner;

class SwitchExample{
    public static void main(String args[]){
        // we declare answer1 and answer2 variables
        String answer1, answer2;
        Scanner input = new Scanner(System.in);
        //ask question which gives to options to choose
        System.out.println("Do you like to study in the University?");
        System.out.println("Yes / No");
        answer1 = input.nextLine();
        //in case of answering Yes in the above line, it gives another options to choose
        switch(answer1){
            case "yes":
            System.out.println("Choose one university from the list: ");
            System.out.println("AJOU");
            System.out.println("SNU");
            System.out.println("KAIST");
            answer2 = input.nextLine();
            // if you choose any of them, you will be directed to that particular case
            switch(answer2){
                case "AJOU":
                System.out.println("Contact to following address: Farkhod@ajou.ac.kr");
                break;
                case "SNU":
                System.out.println("Contact following address: frank@snu.ac.kr");
                break;
                // default simply means that you chose the KAIST option
                default:
                System.out.println("Contact following email: frankenstein@kaist.ac.kr");
                            }
            //it ends the Yes case
            break;
            //in case of No answer, you will see following text
            case "no":
            System.out.println("Think one more time pls:(");
            break;
            //this means if you type anything rather than yes or no, 
            //text will be shown
            default:
            System.out.println("see you next time :/");
        }
    }
}