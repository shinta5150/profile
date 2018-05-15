# Swagger generated server


## Overview 
A stubbed implementation to show how a Profile API can be served as a SpringBoot API.
Implementation would use event sourcing to update the CRM.

To clone the repo and build:
```
git clone https://github.com/shinta5150/profile.git
cd profile
mvn clean
mvn install
```
To run on the command line:
```
mvn spring-boot:run

## Integration Architecture
See Architecture.png

## Security
Assumption is using an API gateway that allows for federated IDM and Policy management.
Use API gateway to manage different api keys for different channels.
Assume Mobile app is trusted, so it's possible to use Password Grant on Mobile.
For Web use the Authorisation code grant.
Assume that there is a firewall between the API gateway hosted in a cloud environment 
that needs to use NAT to the internal network where the CRM resides.
Assume TLS between clients and API gateway.
IDM will have federated id's for the CRM to allow scope to the CRM profile resources.

## API Versioning
Avoided until required. Assumes additive fields to avoid breaking changes.