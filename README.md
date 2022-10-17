Drake Johnson (drake937) 2022

Attached is a .csv file and a main driver file.

I have created a github account for an assignment at Jacksonville State University.

Provided by Dr. Ogden, the posted files will read through 500 records writing to a text document in postal 
letter format. Properly studied, the code posted can motivate a novice programmer to 
work with complex data structures.

Method:
The first line of the .csv file is read in as the header. Noted in the main method, each key is seperated by 
a comma. Starting after line one, the header, each name, address, zipcode, etc... follows. Each element 
seperated by a comma from the first row will act as a key. 

Every line of the database will be read into an arraylist and along with the constant header arraylist. The 
key and value will be assigned to a Hashmap. Now for everyline, there is a key that will bring a value for 
that line, depenedent on the comma seperation.

Every line is stored into one arraylist called data, representing each subcomponent of every .csv line. 

Main:
Outputs the total number of records read after the previous methods have ran. 

The output file is created from a succession of nested if statements asking for each key and will not procede 
in obtaining the data to output the string concatenation if there is an error in retrieving a value. 
(The output file will be viewed as cryptic compared to the desired output.)

Conclusion:
A beginner software developer my find this code useful in exploring the science behind database functionality. 


