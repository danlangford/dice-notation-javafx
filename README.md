# dice-notation-javafx

this is to demonstrate how to create a java jar that has all dependencies and can be executed on multiple platforms.

Leverages:
- Java 11 (non-module config)
- Maven
- javafx (with multiple OS specific dependencies)
- maven-shade-plugin

When importing into your IDE "Open" or "Import" the `pom.xml` file to create a new project.

Most of the interesting work is in the `pom.xml` file. Also, there is a funny situation that requires the use of a seperate class with a `main` method. See the comments in `FatJarLauncher.java`

execute maven (`mvn`) with the `package` goal then locate your jar in the `target/` dir.

    mvn package
    
 This little app is just a simple ui for [Bernardo-MG/dice-notation-java](https://github.com/Bernardo-MG/dice-notation-java). That lib has a handful of transitive dependencies so this demonstrates how `maven-shade-plugin` creates a jar with ALL the necessary dependencies. 
 
 A compiled version of this is over in the [Releases](https://github.com/danlangford/dice-notation-javafx/releases). 
 
 The only dependency that is not included in Java 11 itself. It is possible to include that but then you would not be using the shade plugin, you would be using all proper java modules and `jlink`. I'll demonstrate that another time. 