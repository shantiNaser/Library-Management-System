# Library-Management-System
Final java OOAD Project talk about library in University and how to deal with book and User


Project OOAD
 CS Students
Write a project for the university library. The library maintains two main classes: one for the books and one for the users. Books have a title,ISBN,  an author and a publication year. Books can be either in the library or borrowed by a user.
Users can be either students or professors. Students have a name and a student ID number. Professors have a name, ID number and belongs to a faculty. Users can borrow books. A Student can borrow 2 books at a time while professors are allowed to borrow 5 books simultaneously.
The project can read and store its classes in arrays.
There is a user interface that allows to add new books and new users to the arrays.The user interface proposes to borrow or to return books.
Some implementation details
A Library class contains four fields that are: library name, president name, two linked list one for the books and one for the users. The Library class contains methods addBook and addUser to add new books and new users. It contains methods to display the list of books and the list of users. The Library class has a method to borrow a book and a method to return a book.
A Book has a borrower field to record who borrowed it (possibly nobody). The Book class provides a method to prompt the user for entering a new book.
A User has a field intborrowedBooks to record the number of books it has borrowed. The class provides a constant MAX_BORROWED_BOOKS that indicates how many books a user is allowed to borrow at the library. Each time a user wants to borrow a book the class checks that he is allowed to do so and increments its borrowedBooks. Conversely when a book is returned the borrower has his borrowedBooksdecremented.
A user can be a student or a professor. Provide a method to prompt the user for new students or professors.
Write a main method that will run your classes, Fill the arrays and propose different options to the user: 


Menue
1.	adding new books
2.	delete a book
3.	delete books of an author
4.	add new users
5.	delete user
6.	borrow a book
7.	returning a book
8.	listing the available books
9.	listing the borrowed books
 10.	listing the users.
 11.	Exit

Enter Your Choice:____

Test your program. Provide data form a file where there is a library with around 10 books and 6 users.
