/*
    Drake Johnson, CS232, 09/26/22
    Program uses nested if statements to check for a key and 
    returns a value to an output file in a specific format
*/
package mailingaddressbook;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.io.FileWriter;
import java.util.Iterator;

public class MailingAddressBook {

    public static void main(String[] args) {
        
        /* Row Objects */
        
        ArrayList<String> keys;             // Holds key names from header row
        ArrayList<String> values;           // Holds the values read from subsequent rows
        
        HashMap<String, String> row;        // Holds the key/value pairs for each data row

        String line, header;

        /* Container for File Data */
        
        ArrayList data = new ArrayList<>(); // Create ArrayList to hold HashMaps for all rows
        
        try {
            
            /* Attempt to open input file */
            
            Scanner in = new Scanner(Paths.get("lab4_input.csv"), "UTF-8");
            
            /* Get list of keys from the header row; split into an ArrayList */
            
            header = in.nextLine();
            keys = new ArrayList(Arrays.asList(header.split(",")));
            
            /* Read and process every subsequent row (record) in CSV file */
            
            while ( in.hasNextLine() ) {
                
                /* Get next line */
                
                line = in.nextLine();
                
                /* Create new map for current row */
                
                row = new HashMap<>();
                
                /* Split comma-separated values into ArrayList */
                
                values = new ArrayList(Arrays.asList(line.split(",")));
                
                /* Populate map, using key names from the header row */
                
                for (int i = 0; i < keys.size(); i++) {
                    
                    row.put(keys.get(i), values.get(i));
                    
                }
                
                /* Add map to data container */
                
                data.add(row);
                
                
                 //System.out.println(values);
            }
            
            /* Print number of records read from file (should be 500, not including header) */
            
            System.out.println("Number of records read: " + data.size());
            
            /* Close input file */
            
            in.close();
            //Iterator<String> iterator = row.keySet().iterator();
            /* Parse data from records; print as formatted address blocks */
            
            /* INSERT YOUR CODE HERE */
            //initializing vars and file writer
            FileWriter writer = new FileWriter("mailing_list.txt");
            String first;
            String middle; 
            String last; 
            String street; 
            String city; 
            String state; 
            String zip;
            
             for (int i = 0; i < data.size(); ++i)
                {
                    row = (HashMap)data.get(i);
                    //nested if statements that checks for a key and assigne the value to the initial variables
                    if (row.containsKey("FirstName"))
                    {
                        first = row.get("FirstName");
                        
                        if (row.containsKey("MiddleInitial"))
                        {
                            middle = row.get("MiddleInitial");
                            if (row.containsKey("LastName"))
                            {
                                last = row.get("LastName");
                                if (row.containsKey("StreetAddress"))
                                {
                                    street = row.get("StreetAddress");
                                    if (row.containsKey("City"))
                                    {
                                        city = row.get("City");
                                        if (row.containsKey("State"))
                                        {
                                            state = row.get("State");
                                            if (row.containsKey("ZipCode"))
                                            {
                                                zip = row.get("ZipCode");
                                                //formatting of the output file/console window
                                                writer.write(first + " " + middle + " " + last + "\n" + street + "\n" + city + ", " + state + " " + zip + "\n");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }  
                }
             //closing the file
            writer.close();
        }
        
        catch (Exception e) {
            
            System.err.println(e.toString());
            
            }
        
        }

    }


