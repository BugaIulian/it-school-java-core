Imagine you are building a simple application for tracking tasks. The application will have the following classes and interfaces:

An interface called Task with the following methods:

String getTitle()
String getDescription()
void setTitle(String title)
void setDescription(String description)
A class called SimpleTask that implements the Task interface. This class will have the following instance variables:

String title
String description
It will also have a constructor that takes two arguments, title and description, and sets the corresponding instance variables using the setters provided by the Task interface.

A class called TaskTracker that has a main method that creates an array of Task objects and initializes them using the SimpleTask constructor.

With this project, you can practice implementing the Task interface in the SimpleTask class and creating instances of the SimpleTask class in the TaskTracker class.

For example, you could create a few SimpleTask objects and use the getters and setters to modify their title and description fields. Then you could print out the metadata for each task using the getTitle and getDescription methods of the Task interface.