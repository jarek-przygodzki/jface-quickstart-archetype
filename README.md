Maven JFace Quick Start Archetype
==========================

This is a Maven archetype for creating JFace projects.

## Installing

The archetype is not yet available via Maven Central, so you'll have to build and install it before
you can use it to generate skeleton projects. 

```
% git clone git://github.com/jarek-przygodzki/jface-quickstart-archetype.git
% cd jface-quickstart-archetype
% mvn install
```
Once it's installed, you can delete the `jface-quickstart-archetype` directory that you cloned.
It's not needed any more.

## Creating a skeleton project

```
mvn archetype:generate  \
    -DarchetypeGroupId=net.jarekprzygodzki.archetypes \
    -DarchetypeArtifactId=jface-quickstart \
    -DgroupId=<group-id> \
    -DartifactId=<artifact-id> \
    -DinteractiveMode=false
```

## Used Maven repository

This archetype uses [swt-repo](https://code.google.com/p/swt-repo/) repository that hosts SWT and 
JFace bundles as regular libraries that can be used with Maven in non-Osgi projects.
