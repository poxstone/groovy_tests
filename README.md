# Groovy

## prerequirements
- java 1.8+
- export JAVA_HOME="/usr/lib/jvm/java-17-openjdk-amd64"

## Install
- [Donwload](https://groovy-lang.org/install.html)
- unzip example: ${HOME}/bin/groovy-4.0.12
- add to $PATH
  - export PATH="${PATH}:${HOME}/bin/groovy-4.0.12/bin"
- create GROOVY_HOME
  - export GROOVY_HOME="${HOME}/bin/groovy-4.0.12"

## test
```bash
groovy -version;
groovy hello-world.groovy;
```