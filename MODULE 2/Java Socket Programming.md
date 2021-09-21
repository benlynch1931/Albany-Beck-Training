# Socket Programming


A way by which a machine can communicate with another machine
Or a JVM can communication with another JVM

*Note: Java provides classes and interfaces which are defined in "java.net"*

***What is a network?***

- An interconnection of devices

***What is a protocol in networking?***

- A rule which governs data communication


Types of protocols:

- Connection-Oriented

  There must be an active connection between sender and receiver OR Client and Server

  **HTTP** - Hyper Text Transfer Protocol (connection-oriented by default)

    - Enables a browser to communicate with an active server


  **TCP** - Transmission Control Protocol

    - Guarantee the delivery of packets by means of supporting acknowledgement facility

    - Sequential - packets are delivered in a sequential/ordered manner


- Connection-less

  An active connection is *NOT* required between the sender and receiver OR Client and Server

  **UDP** - Does not guarantee delivery of packets because there is no acknowledgement facility
          - Faster because it follows non-sequential approach to send packets

    Ex: Video Streaming
