package Vererbung.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Apotheke {


        Map<String, Integer> Medication = new HashMap<>();

        final int Count = Medication.size();
        public int getCount() {
            return(Count);

    }

    void save() {

        Medication.put("Kuan", 12);

        System.out.println(Medication);
    }

    String find(String medicationName){


            return(medicationName);


    }
    void delete(String medicationName) {

           Medication.remove(medicationName);

    }




}
