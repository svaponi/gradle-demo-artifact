# Gradle Demo Artifact

Java/Gradle demo project to show **how to deploy private artifacts** on a remote _Maven Repository_.

To see **how to use private artifacts** from a remote _Maven Repository_ [svaponi/gradle-demo-consumer](https://github.com/svaponi/gradle-demo-consumer).

The library provides a service that returns the current OS user. That's it!


## How to

Test project and and build artifacts:

```bash
gradle clean build
```

Install artifacts locally:

```bash
gradle install
```

Install artifacts on remote _Maven Repository_:

```bash
gradle uploadArchives
```

If you get an error, see [Local configuration for remote Maven Repository](https://github.com/svaponi/gradle-demo-consumer#local-configuration-for-remote-maven-repository).


### Gradle Tasks

Show all Gradle tasks available on this project:

```bash
gradle tasks --all
```
