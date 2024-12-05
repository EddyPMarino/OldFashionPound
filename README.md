# OldFashionPound

OldFashionPound is a Java library that implements the four basic arithmetic operations (addition, subtraction,
multiplication, and division) for prices according to the pre-decimalization British currency system (1 pound = 20
shillings, 1 shilling = 12 pence).

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Examples](#examples)
- [License](#license)

## Installation

Before including OldFashionPound in your project, make sure to build, compile the project, and generate the artifact. Once done, add the following dependency to your `pom.xml` file:
```xml
<dependency>
    <groupId>org.interviews</groupId>
    <artifactId>old-fashion-pound</artifactId>
    <version>1.0.0-RELEASE</version>
</dependency>
```

## Usage

Here's a quick example of how to use the OldFashionPound library:

```java
import old.fashion.pound.service.OldFashionPoundCalculator;
import old.fashion.pound.service.impl.OldFashionPoundCalculatorImpl;

public class Main {
    public static void main(String[] args) {
        OldFashionPoundCalculator calculator = new OldFashionPoundCalculatorImpl();

        String price1 = "5p 17s 8d";
        String price2 = "3p 4s 10d";

        String sum = calculator.add(price1, price2);
        String difference = calculator.subtract(price1, price2);
        String product = calculator.multiply(price1, 2);
        String quotient = calculator.divide(price1, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
```

Here is another example of how to use the OldFashionPound library within a Spring service:

```java
import it.stepsrl.org.testsdk.service.Foo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import old.fashion.pound.service.OldFashionPoundCalculator;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class FooImpl implements Foo {

    private final OldFashionPoundCalculator oldFashionPoundCalculator;

    @Override
    public String sum(String addend1, String addend2) {
        log.info("sum old fashion pound calculator, addend1: {}, addend2: {}", addend1, addend2);
        String result = oldFashionPoundCalculator.add(addend1, addend2);
        log.info("sum old fashion pound calculator, result: {}", result);
        return result;
    }
}
```

## Features

* **Addition:** add two prices.
* **Subtraction:** subtract one price from another.
* **Multiplication:** multiply a price by an integer.
* **Division:** divide a price by an integer, with remainder handling.

## Examples

**Addition**

```java
String result = calculator.add("5p 17s 8d", "3p 4s 10d");
// result: "9p 2s 6d"
```

**Subtraction**

```java
String result = calculator.subtract("5p 17s 8d", "3p 4s 10d");
// result: "2p 12s 10d"
```

**Multiplication**

```java
String result = calculator.multiply("5p 17s 8d", 2);
// result: "11p 15s 4d"
```

**Division**

```java
String result = calculator.divide("5p 17s 8d", 3);
// result: "1p 19s 2d (2d)"
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.