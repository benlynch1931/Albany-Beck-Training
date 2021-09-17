# File Handling

What is a file?

- Any data stored on a disk

- Persistence Unit


## Java Stream Classes

What is a stream in file handling?

- Constant flow of data
- Abstract representation of data flow

- A sequence of bytes


What are Java Stream Classes

- Classified into 2 types:

  - Byte Stream Class
    - *(Not ideal for internet-based applications)*
    - Useful for Socket Networks/Application as all data is in bytes

    - InputStream (Abstract Class)

      - FileInputStream
      - DataInputStream
      - ObjectInputStream

    - OutputStream (Abstract Class)

      - FileOutputStream
      - DataOutputStream
      - ObjectOutputStream


  - Character Stream Class
    - Useful most places that requires character-based inputs

    - Reader (Abstract Class)

      - FileReader
      - BufferedReader

    - Writer (Abstract Class)

      - FileWrite
      - BufferedWriter


What is the difference between Byte Stream Class and Character Stream Class?

- Byte Stream Classes do not support UNICODE, whereas Character Stream Classes support UNICODE


## Serialization

- Process of writing the state of an object into a Byte Stream

- To implement Serialization we use ObjectOutputStream

- Static fields cannot be serialized.


Note:
  Only the objects of class that implements Serializable interface are eligible for Serialization
  - Objects must implement Serializable

De-Serialization:

- Process of reading the state of an object from a Byte Stream

- To implement Serialization we use ObjectInputStream

**Transient Variables**

- A value that cannot be serialized
