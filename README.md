# EmailApp

# Email ApplicationScenario: 

You are an IT Support Administrator Specialist and are charged with the task of creating email accounts for new hires.This application  
does the following:
- Generate an email with the following syntax: firstname.lastname@department.company.com
- Determine the department(IT, sales, accounting), if none leave blank
- Generate a random String for a password.
- Have setmethodsto change the password, set the mailbox capacity, and definean alternate emailaddress
- Have get methodsto display the name, email, and mailbox capacity

### Example:

#### Sample Input:

```

New Employee: Riya
DEPARTMENT CODES
1 for IT
2 for Sales
3 for Accounting
0 for none
Enter Department Code: 2

```
#### Sample Output:

We have selected 5 so the output will be:

```

Your Password is: !%U!FJSS3E
Your Email is: riya.gupta@Sales.tcs.com
DISPLAY NAME: Riya Gupta
COMPANY EMAIL: riya.gupta@Sales.tcs.com
MAILBOX CAPACITY: 1000mb

```
