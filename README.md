# Apache Camel Learning

A beginner-friendly project for learning Apache Camel using Java DSL and YAML DSL.

---

### Technologies

- Java 24
- Apache Camel 4.18.3
- Maven
- Camel YAML DSL
- Camel CLI
- Kaoto

---

### 1. Running the Java Route
The Java DSL addition route is defined in App.java.
```
mvn exec:java '-Dexec.mainClass=com.camellearning.App'
```

### 2. Running YAML Routes
RunYamlApp.java is used to start Camel and load YAML routes.

```
mvn exec:java '-Dexec.mainClass=com.camellearning.RunYamlApp' '-Dcamel.main.routesIncludePattern=classpath:camel/<yaml-file-name>'
```

> Replace ```<yaml-file-name>``` with actual YAML file name you want to run

### 3. Running YAML with Camel CLI
Camel CLI can also run YAML routes directly:
```
camel run <yaml-file-name>
```