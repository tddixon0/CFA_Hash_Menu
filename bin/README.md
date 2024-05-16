<h1 align="center"> CFA Two </h1> <br>

<p align="center">
  A take on Chick-fil-A's mobile app

<p align="center"> 
  CFA_Menu is under construction for dirty code
</p>

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Requirements](#requirements)
- [Quick Start](#quick-start)
- [Testing](#testing)
- [API](#requirements)
- [Acknowledgements](#acknowledgements)

## Introduction

TODO: 
### Cart function
Have a running count of all items want to purchase, and add up value when asked.

### Reward System
"you earned 50 points from this purchase"

### Employee login
Make a simple if else and input a custom, hard coded 6/8digit pin. If pin = ID continue; else restart.
Have somewhere to ask if you have discount.

Are you employee? Yes, then ask for ID number. No continue with order taking.

Make Hashing work
Cart (Add all the items up to print out a final total) 
GUI

### Ideas to solve
Maybe just have a menu item paired with a number (Asian restaurant, EX: E4 or D3 or even just a number like 56)

### COMPLETED
Employee Login using an ID

### CRUNCH TIME
SQL for menu and prices
Have a "cart function" that sums up prices selected
Return in interface
GUI in Java

## Features
TODO: Description of features

* Include a list of
* all the many beautiful
* web server features


## Requirements
The application can be run locally or in a docker container, the requirements for each setup are listed below.


### EGO
A running instance of [EGO](https://github.com/overture-stack/ego/) is required to generate the Authorization tokens and to provide the verification key.

[EGO](https://github.com/overture-stack/ego/) can be cloned and run locally if no public server is available. 


### Local
* [Java 8 SDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven](https://maven.apache.org/download.cgi)


### Docker
* [Docker](https://www.docker.com/get-docker)


## Quick Start
Make sure the JWT Verification Key URL is configured, then you can run the server in a docker container or on your local machine.

### Configure JWT Verification Key
Update __application.yml__. Set `auth.jwt.publicKeyUrl` to the URL to fetch the JWT verification key. The application will not start if it can't set the verification key for the JWTConverter.

The default value in the __application.yml__ file is set to connect to EGO running locally on its default port `8081`.

### Run Local
```bash
$ mvn spring-boot:run
```

Application will run by default on port `1234`

Configure the port by changing `server.port` in __application.yml__


### Run Docker

First build the image:
```bash
$ docker-compose build
```

When ready, run it:
```bash
$ docker-compose up
```

Application will run by default on port `1234`

Configure the port by changing `services.api.ports` in __docker-compose.yml__. Port 1234 was used by default so the value is easy to identify and change in the configuration file.


## Testing
TODO: Additional instructions for testing the application.


## API
TODO: API Reference with examples, or a link to a wiki or other documentation source.

## Acknowledgements
Co-creator: Von