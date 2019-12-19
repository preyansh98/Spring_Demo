# SafeHome Spring Demo

## Prerequisites:

1.  Set up a Heroku Application  
 - check out: https://devcenter.heroku.com/articles/getting-started-with-java

2.  Link the Spring Boot Application to Heroku
 - check out: https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku#connecting-to-a-database
   
Now that your Spring Boot Application is set up with Heroku, it’s time to write some code!

## Task: 
Your task is to provide the functionality for a User to register on SafeHome as either a student or a walker, and then successfully log in. You will develop three APIs as part of this exercise, one for registration, one for login, and finally functionality to display a list of all the logged in users.

  

###  Registration
    
 - All users have to register with their McGill Email and a password, as
   well as an indication of whether they want to register as a Student
   or a Walker
 - You must verify that the email and password are provided, and return
   a 400 Bad Request error if they are not.
 - Bonus: Try and add more checks to ensure that the email is in the
   correct email format (hint: regex). Also, you may add a way to hash
   the passwords for security. (java.security has a bunch of methods you
   could use)

    
### Log In
    

 - The purpose here is to simply authenticate the user. Upon a call to
   login, the McGill Email and password are provided. If the user exists
   on the system (i.e. has registered before) the call results in a
   success.

    

### List of Logged In Users
    

 - The purpose of this part is to simply display a response of all the
   currently logged in users on the system.
 - You may format the response in any way you want. The check here is to
   ensure that once a user registers, and then logs in, their
   information should be appended to this list.
   
## Tips

Try and follow the classic way:

![](https://lh6.googleusercontent.com/W9g0ca8dytVP6T-_vKQGRCvuaemMqRlvtK9e2ovDgfxaoupbNEttTh1oo0DeiLeCDuwjZhd6RKhTJAgnbCDlSDW_WWAKPbSatEiv4_c3yE9bA2MqpeenDj4DNdEmYnbndOxBoJQU)

For reference, you can follow any other spring projects, or SafeHome itself.

1.  Think about what classes/entities you need. Create these and put them in a “model” package.
2.  You will need a repository class for the entities you want to save to your database.
