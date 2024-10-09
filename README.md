# Unit-2-Project-CSA
Art Shop!
# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project](image/Copy of UML Diagrma.png)

## Description
I made an Art shop that sells painting and pottery supplies. I chose this topic because I fancy the Arts ad wanted to represent more medias and show that art is not just paintings or poetry, it can be something materialistic such as pottery.The art shop project uses class hierarchy to represent product categories in the store. The Product super class represents any product with common variables like name, price, and quantity. The product class uses no-argument constructors for generic products and parameterized constructors for more specific ones. Subclasses Painting and Pottery extend the Product class with specific attributes and behavior. The program expects user input for quantity and color, and prints a summary of the item added to the cart using the toString method. The program modifies the quantity attribute, and adjusts the number of items a customer wants by using accessor and mutator methods 