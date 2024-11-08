# Java Data Access 

## Examples

### Example 1 

First example - modified: printing data (ref example Person) in file - basic example.

### Example 2

Second example: printing data (ref example Person) with try-catch block.

### Example 3

Third example: printing data (not ref Person) in certain subfolder with try-catch block.

### Example 4

Fourth example: printing data (Person) to .txt file (advanced example).
Fourth example: reading data (Person) from person.txt file (advanced example)

### Example 5

Package: filereaderfirst
In first example we created file myPerson.txt . In this example we are reading data from file myPerson.txt .

### Example 6

Package: fileinputstream
reading BYTES from file input.txt and try with MULTIPLE catch

### Example 7

Package: fileinputoutputstream
READ bytes ("input.txt") & WRITE bytes ("output.txt") and try with MULTIPLE catch

Some of use cases:

7.1.
Worker in small shop is scan goods, selling goods and printing "small" fiscal invoice.
"Fiscal printer device" is connected to PC AND writes "printed invoice" to file ("invoice.txt") and exactly to folder C:/tmp . "Retail app" is reading that "invoice.txt" (location: C:/tmp) and storing data in "database" AND delete "invoice.txt".

7.2.
There is State Tax Control and they control paid tax.
They want Q1, Q2, Q3, Q4 TAX data in thier document (created according to the State Tax requirements (income, tax, paid, not paid, contracts, codes, ...). So, we:
- read State Tax Document ("input.txt"),
- read data from our database
- write results to "output.txt"

7.3.
We have to pay salaries to workers at the end of month.
We have "input.txt" created by State Tax Sallary Department where are certain codes. We:
- are reading "input.txt"
- reading data from database and process "business logic" and
- write data to "output.txt" in order to send data via State Tax Sallary Department Web app.

### Example 8

Package: filereadersecond
Reading data FROM FILE character by character AND PARSING

### Example 9

Package: mongodbfirst
Java to MongoDB

### Example 10

Package: mysqlfirst
Java to MySQL


