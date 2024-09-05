# PipedWriter and PipedReader in java
## Description
PipedWriter and PipedReader classes in Java are used to 
communicate and exchange data between two threads. 
These classes allow you to pass data from one thread to another without
having to store the data in a file or use other storage resources.

Scenario: Communication between two threads to process data
Suppose you have two threads:

The first thread generates data and sends it to the second thread.
The second thread receives and processes the data.
We will use PipedWriter and PipedReader to implement this communication.