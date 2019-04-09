# MockitoExample

This is a simple example of how to use mockito in a java application.
I used netbeans in this example.

Steps
1. Go to https://mvnrepository.com/artifact/org.mockito/mockito-core/2.26.0
2. Look for a table with a row that has the following text: "Files	jar (573 KB)  View All"
3. Click the "jar (573 KB)" button
4. Download the jar somewhere
5. Scroll down to compile dependencies
6. There should be a table with three rows with the following text(Each of these rows are dependencies that mockito 
core needs to work, I tried to use the latest updated versions and mockito did not work): 

```
Category/License		Group / Artifact	                    Version 	Updates
Bytecode
Apache 2.0		      net.bytebuddy » byte-buddy	          1.9.10	  1.9.12

Apache 2.0		      net.bytebuddy » byte-buddy-agent	           1.9.10	  1.9.12
Reflection
Apache 2.0		      org.objenesis » objenesis	                   2.6	        3.0.1
```


7. Click on the button with "1.9.10" version for byte-buddy and download the jar
8. Click on the button with "1.9.10" version for byte-buddy-agent and download the jar
9. Click on the button with "2.6" version for objenesis and download the jar
10. All of the downloaded jars should be added to your test project's jars
11. Also manually add junit 4.12 and hamcrest 1.3 for your tests
