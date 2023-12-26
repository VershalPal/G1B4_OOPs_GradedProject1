# G1B4_OOPs_GradedProject1
This project implements a Department Management System.
### _Department Management System_

This repository contains the code implementation for the assignment provided. It consists of four different departments as separate classes: Super Department, Admin Department, HR Department, and Tech Department.

## Super Department

Super Department is the superclass that all other departments extend. It contains the following methods:

1. `departmentName()`: Returns "Super Department".
2. `getTodaysWork()`: Returns "No Work as of now".
3. `getWorkDeadline()`: Returns "Nil".
4. `isTodayAHoliday()`: Returns "Today is not a holiday".

## Admin Department

Admin Department is a subclass of Super Department. It includes the following methods:

1. `departmentName()`: Returns "Admin Department".
2. `getTodaysWork()`: Returns "Complete your documents Submission".
3. `getWorkDeadline()`: Returns "Complete by EOD".

## HR Department

HR Department is also a subclass of Super Department. It provides the following methods:

1. `departmentName()`: Returns "HR Department".
2. `getTodaysWork()`: Returns "Fill today’s timesheet and mark your attendance".
3. `getWorkDeadline()`: Returns "Complete by EOD".
4. `doActivity()`: Executes the activity "team Lunch".

## Tech Department

Tech Department extends Super Department and offers the following methods:

1. `departmentName()`: Returns "Tech Department".
2. `getTodaysWork()`: Returns "Complete coding of module 1".
3. `getWorkDeadline()`: Returns "Complete by EOD".
4. `getTechStackInformation()`: Returns "core Java".

## Usage

The **Main** class serves as the driver class for this assignment. It creates objects of HrDepartment, TechDepartment, and AdminDepartment, then displays their functionalities.

Please refer to the assignment's expected output mentioned above.

Make sure you have Java installed on your machine to execute the code successfully.

#### Prerequisites:
To execute this project successfully, the following prerequisites need to be met:
1. JDK: Ensure that you have JDK (Java Development Kit) installed on your system.
2. IDE: Install your preferred Java IDE (Integrated Development Environment), such as Eclipse or IntelliJ IDEA, to work with the project.

#### Instructions for Execution:
1. Clone the project repository from [repository URL].
2. Open the project in your chosen IDE.
3. Build and compile the project to ensure that there are no errors.
4. Run the project by executing the main class or the entry point of the application.
5. Follow the instructions displayed on the console to input the required information.
6. The application will generate the email address, determine the department, generate a random password, and display the generated credentials on the console.
