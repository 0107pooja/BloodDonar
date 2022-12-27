import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        PersonData personData= new PersonData();

        System.out.println(" Enter the Name");
        String personName=sc.nextLine();
        personData.setName(personName);

        System.out.println(" Enter the Blood Group");
        String bloodGroup = sc.nextLine();
        personData.setBloodGroup(bloodGroup);

        System.out.println(" Enter the Age");
        int personAge=sc.nextInt();
        personData.setAge(personAge);

        System.out.println(" Enter the Height");
        float personHeight=sc.nextFloat();
        personData.setHeight(personHeight);

        System.out.println(" Enter the Weight");
        float personWeight=sc.nextFloat();
        personData.setWeight();


        //ratio of height and weight to donate the blood  x>y && x>z

//        if (personAge >= 18 && personAge <= 65) {
//            System.out.println("You must be in good health at the time you donate");
//        }
//        else{
//              System.out.println("Not in Good State to Donate");
//        }


        //if blood group is A,B, Ab e t c, how are they eligible to donate the blood

        if(bloodGroup == "A+"){
            System.out.println("Person can donate blood to the  person who is having A+ and AB+");
            System.out.println("Person can receive blood from  the  person who is having A+, A-, O+, and O-");
        }

//
//        if(bloodGroup == "A-"){
//            System.out.println("Person can donate blood to the  person who is having A+, B+, AB+, O+");
//            System.out.println("Person can receive blood from  the  person who is having A-, and O-"");
//        }
//        if(bloodGroup == "O+"){
//            System.out.println("Person can donate blood to the  person who is having O+, A+, B+, AB+");
//            System.out.println("Person can receive blood from  the  person who is having O+, and O-");
//        }

//        if(bloodGroup == "O-"){
//            System.out.println("Person can donate blood to the all the groups ");
//            System.out.println("Person can receive blood from  the  person who is having B-, and O-");
//              System.out.println("they are called Universal Donor");
//        }
//
//        if(bloodGroup == "B+"){
//            System.out.println("Person can donate blood to the  person who is having B+ and AB+");
//            System.out.println("Person can receive blood from  the  person who is having B+, B-, O+, and O-");
//        }

//        if(bloodGroup == "B-"){
//            System.out.println("Person can donate blood to the  person who is having B+, B-, AB+, AB-");
//            System.out.println("Person can receive blood from  the  person who is having B-, and O-");
//        }
//
//        if(bloodGroup == "AB+"){
//            System.out.println("Person can donate blood to the  person who is having AB+");
//            System.out.println("Person can receive blood from All the blood Groups");
//            System.out.println("they are called Universal Receiver");
//        }

//        if(bloodGroup == "AB-"){
//            System.out.println("Person can donate blood to the  person who is having AB+ and AB-");
//            System.out.println("Person can receive blood from  the  person who is having A-, B-, AB-, and O-");
//        }

//
//
//        if(personData.weightNeedToDonate()==0.0){
//            System.out.println(" Invalid Weight");
//        }

    }
}