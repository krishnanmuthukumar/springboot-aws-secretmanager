# springboot-aws-secretmanager #aws #springboot #secretsmanager

Using AWS secret manager to store your crdentials and using them in Springboo project . 

1. Create a secret manager entry in AWS
2. Create an IAM user with AWS secret manager read/write permission

in application.properties file, add the below property 

spring.config.import: aws-secretsmanager:test/mysecret;



