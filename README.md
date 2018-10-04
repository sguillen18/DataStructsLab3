# DataStructsLab3
Wentworth Institute of Technology
Department of Computer Science and Networking.
            Comp 2000 Data Structures Fall 2018

           Lab #3 Queue implementation         (total 100 pts)                       
Create a class LinkedQueue <T> which implements QueueInterface <T>.
For the purpose of implementation, include EmptyQueueException class in your package.
Include the file TestQueue.java in your package and make sure it runs OK.
For testing, create:
1)	A class Passenger with an id field (type String or int) and a destination field of type Station.
2)	A class Station with the fields: name (type String) and LinkedQueue of Passengers. 
3)	A Route main class where you generate an array of stations and assign a random number of passengers to each station. Each passenger has a random id (5-digit number, possibly converted to String) and a random destination station.
After doing so, print out the distribution of passengers. The output might be as follows:
-----------------------
Oak Grove
 Passengers: 

10340, Sullivan Square
========================

-----------------------
Wellington
 Passengers: 

67015, Downtown Crossing
10139, Ruggles
88324, Sullivan Square
========================

-----------------------
Assembly
 Passengers: 

10714, Jackson Square
62667, Wellington
========================

You can retrieve the station names from the attached file orange.txt or get them in any other way.
