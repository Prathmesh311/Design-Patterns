# Simple Factory Design Pattern

---

This module demonstrates the Simple Factory Design Pattern in Java, applied to a scenario involving different types of posts creation.

## Introduction

The Simple Factory Design Pattern is a creational design pattern that provides a way to create objects without exposing the instantiation logic to the client. It involves a Factory class that has a method for creating objects based on a given input. This pattern is useful when there are multiple subtypes of objects to be created and the client code should not be aware of the instantiation process.

## How it Works

In the Simple Factory pattern, we have the following components:

1. **Factory**: A class responsible for creating objects. It contains a method that accepts input parameters and returns an instance of one of several possible classes.

2. **Product**: The interface or abstract class representing the objects being created.

3. **Concrete Products**: The actual classes that implement or extend the Product interface or class.

## Implementation

In this module, you'll find an example implementation of the Simple Factory Design Pattern. It demonstrates how to use the Simple Factory pattern to create different types of posts, such as NewsPost, BlogPost, and ProductPost.

## How to Use

To use this module:

1. Clone the repository to your local machine.
2. Navigate to the `SimpleFactoryPattern` directory.
3. Review the source code to understand the implementation of the Simple Factory Design Pattern.
4. Compile and run the Java program to see the Simple Factory pattern in action.

## Example Scenario

In the example provided, we have a `Post` interface representing the common properties and behaviors of different types of posts. We have three concrete implementations of `Post`: `NewsPost`, `BlogPost`, and `ProductPost`, representing different types of posts.

The `PostFactory` class acts as a Simple Factory, providing a method `createPost` that accepts a parameter indicating the type of post to create. Based on the input, it instantiates and returns an instance of the corresponding concrete post class.

## Contributing

Contributions are welcome! If you'd like to improve the example, add more features, or fix bugs, feel free to fork the repository, make your changes, and submit a pull request.
