BOOK BEATER 

Description: 

This app is created in Java programming language. For the GUI we have used Scene Builder and JavaFX library. Moreover, it uses MariaDB to save the order list in the database. 

Software Requirements: 

•	JavaFX SDK 11.0.2 - https://openjfx.io/ 

•	Scene Builder 11.0.0 - https://gluonhq.com/products/scene-builder/ 

•	IntelliJ IDEA - https://www.jetbrains.com/idea/ 

•	Instruction to set up - https://openjfx.io/openjfx/docs/#introduction 

•	For VM options: --module-path ${PATH_TO_JAVAFX} --add-modules javafx. controls,javafx.fxml ;${PATH_TO_JAVAFX} - path to JavaFX library   

•	MariaDB connector which in the requirements folder. 

Functions: 

This app helps the user to save the history of the books that he has studied. 

Installation 

•	First, we should have a IDE that will work like IntelliJ Idea along with XAMMP (APPACHE and SQL). 

•	Run Apache and SQL with XAMMP and create Database Name="books", username="root" and no password. 

•	Connect IDE with Database Name="test", username="root" and password= "" 

•	Add MariaDB Connector file to libraries path. 

•	Run the file. It will work if you have setup JavaFX correctly in your IDE  


List of completed features  

•	Can insert and delete the history of books.  

•	The famous authors tab will open into a list of famous authors.  

•	The famous books will open into a list of famous books of all time.  

List of features yet to implement 

•	The database is visible to everyone, it can be visible to only admins/staff. It can be done through creating login systems for customers and admin separately
