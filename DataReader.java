
package mailingaddressbook;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;


public class DataReader {
        //private ArrayList<String> key;
        //private ArrayList<String> value;
        private String firstName;
        private String middleName;
        private String lastName;
        private String streetAdd;
        private String city;
        private String state;
        private String zipCode;
        public DataReader()
        {
            //ArrayList<String> key = new ArrayList<>();
            //ArrayList<String> value= new ArrayList<>();
            String firstName = "";
            String middleName = "";
            String lastName = "";
            String streetAdd = "";
            String city = "";
            String state = "";
            String zipCode = "";
        }
        public DataReader(String first, String middle, String last, String street, String town, String homeState, String zip)
        {
           firstName = first;
           middleName = middle;
           lastName = last;
           streetAdd = street;
           city = town;
           state = homeState;
           zipCode = zip;

        }
        public void setDataReader(String first, String middle, String last, String street, String town, String homeState, String zip)
        {
           firstName = first;
           middleName = middle;
           lastName = last;
           streetAdd = street;
           city = town;
           state = homeState;
           zipCode = zip;

        }
        public String getFirstName()
        {
            return firstName;
        }
        public String getMiddleName()
        {
            return middleName;
        }
        public String getLastName()
        {
            return lastName;
        }
        public String getStreetAdd()
        {
            return streetAdd;
        }
        public String getCity()
        {
            return city;
        }
        public String getState()
        {
            return state;
        }
        public String getZipCode()
        {
            return zipCode;
        }
        public String toString()
        {
            return(firstName + middleName + lastName + "\n" + streetAdd + "\n" + city + state + zipCode + "\n");
        }
       
}
