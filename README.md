**Integrate the AWS Secret Manager with Spring Boot**

Using AWS secret manager to store your crdentials and using them in Springboo project . 

1. Create application properties in AWS Secret Manager
2. Create an IAM user with _SecretsManagerReadWrite_ permission

Set the aws credential in your system.

in application.properties file of the application , add the below property 

spring.config.import: aws-secretsmanager:test/mysecret;



