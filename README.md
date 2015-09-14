This is a working example of JPA for HBase using datanucleus.
I used the following versions

Apache Maven 3.3.3 

JDK: 1.8

Hbase: .94

How to setup the project.

1. clone this project.
2. run mvn clean compile
3. run mvn datanucleus:enhance
4. run mvn test

Now you should see two table named as 'Department' and 'Employ' in your Hbase.

