[Numeral Prefix Wikipedia Page]: https://en.wikipedia.org/wiki/Numeral_prefix
[The Unlicense]: https://unlicense.org

# Consoomer

Java 8+ library that provides additional functional interfaces, much like the built-in Java Consumers & Functions.

| Argument Count | Function               | Consumer               |
|----------------|------------------------|------------------------|
| 3              | TriFunction            | TriConsumer            |
| 4              | QuadFunction           | QuadConsumer           |
| 5              | QuinqFunction          | QuinqConsumer          |
| 6              | SexFunction            | SexConsumer            |
| 7              | SepteFunction          | SepteConsumer          |
| 8              | OctoFunction           | OctoConsumer           |
| 9              | NovemFunction          | NovemConsumer          |
| 10             | DecemFunction          | DecemConsumer          |
| 11             | UndecFunction          | UndecConsumer          |
| 12             | DuodecFunction         | DuodecConsumer         |
| 13             | TredecFunction         | TredecConsumer         |
| 14             | QuattuordecFunction    | QuattuordecConsumer    |
| 15             | QuindecFunction        | QuindecConsumer        |
| 16             | SedecFunction          | SedecConsumer          |
| 17             | SeptendecFunction      | SeptendecConsumer      |
| 18             | OctodecFunction        | OctodecConsumer        |
| 19             | NovemdecFunction       | NovemdecConsumer       |
| 20             | VigintiFunction        | VigintiConsumer        |
| 21             | DuovigintFunction      | DuovigintConsumer      |
| 22             | QuattuorvigintFunction | QuattuorvigintConsumer |
| 23             | QuinvigintFunction     | QuinvigintConsumer     |
| 24             | UntrigintiFunction     | UntrigintiConsumer     |

Class names more or less based on [Numeral Prefix Wikipedia Page], although I took a few liberties with some of them.

# Installation

## Repository

### Maven
```xml
<repository>
    <id>jitpack</id>
    <name>Jitpack</name>
    <url>https://jitpack.io/</url>
</repository>
```

### Gradle Groovy
```groovy
maven {
    name = 'Jitpack'
    url = 'https://jitpack.io/'
}
```

### Gradle Kotlin
```kotlin
maven("https://jitpack.io")
```

## Dependency

### Maven
```xml
<dependency>
    <groupId>com.github.allinkdev</groupId>
    <artifactId>Consoomer</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle Groovy
```groovy
implementation 'com.github.allinkdev:Consoomer:1.0.0'
```

### Gradle Kotlin
```kotlin
implementation("com.github.allinkdev:Consoomer:1.0.0")
```

# Licensing
This library is licensed under [The Unlicense]. Have fun!

# Contributing
I'm not entirely sure what there IS to contribute, but if you find something, please don't hesitate to make a pull request. Just make sure your changes compile =)