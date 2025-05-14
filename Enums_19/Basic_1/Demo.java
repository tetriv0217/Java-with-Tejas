package Enums_19.Basic_1;

enum Status{ // Status is a class
    Running,
    Pending,
    Failed,
    Successfull
}

public class Demo {

    public static void main(String[] args) {
        // Status []array = Status.values();//Status.values() return the whole array
        
        // for(Status s : array){
        //     System.out.println(s + " : " + s.ordinal());//s.ordinal()  gives the array value
        // }

        Status s = Status.Successfull;

        switch (s) {// in swit
            case Running:
                System.out.println("Wait");
                break;
            case Pending:
                System.out.println("Check Notifications when done");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
                default:
                System.out.println("Done");
                break;
        }

    }
}