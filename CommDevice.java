/*
Regardless of the type of communication device, there must be a way to transmit and receive data. 

Define an interface, CommDevice, with two methods: 

transmit, which accepts two parameters—reference to a Destination object, and a string (in that order), and returns a boolean; and 

receive, which accepts a parameter of type Duration, and returns a reference to a String.
*/


interface CommDevice {
    boolean transmit(Destination d, String s);
    String receive(Duration d);
}