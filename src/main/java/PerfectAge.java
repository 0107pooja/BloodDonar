public class PerfectAge {

        public PersonData getPersonAge(int age){
            PersonData personData= new PersonData();

            if (personData.personAge >= 18 && personData.personAge <= 65) {
                System.out.println("You must be in good health at the time you donate");
            }
            else{

                System.out.println("Not in Good State to Donate");
            }
            return null;
        }
    }


}
