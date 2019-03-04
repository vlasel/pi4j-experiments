For deploy to your PI board use:

```
mvn clean install
```

Properties in maven POM thar are used for connection to PI board: 

```
<pi4j.dev.host>OPiZero.local</pi4j.dev.host>
<pi4j.dev.port>22</pi4j.dev.port>
<pi4j.dev.user>user</pi4j.dev.user>
<pi4j.dev.password>user</pi4j.dev.password>
```

The result jar file with dependencies ("fat" jar) will be deployed to folder is set in property `pi4j.dev.directory`.
By default it is:

```
/home/${pi4j.dev.user}/pi4j-projects
```
