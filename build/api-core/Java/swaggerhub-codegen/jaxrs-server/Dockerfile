FROM maven:3.3.9-jdk-8
COPY pom.xml .
COPY src .

CMD ["mvn clean package jetty:run"]
