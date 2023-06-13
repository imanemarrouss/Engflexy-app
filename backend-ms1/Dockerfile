FROM maven:3.6.1-jdk-8-slim AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN mvn -f pom.xml clean package -Dmaven.test.skip

FROM openjdk:8-alpine
COPY --from=build /workspace/target/*.jar app.jar
EXPOSE 8036
ENTRYPOINT ["java","-jar","app.jar"]
# SonarQube Configuration
ENV SONAR_TOKEN=sqp_9a8657077894a3a50d9f8973530b561df35879cb
ENV SONAR_HOST_URL=http://sonarqube:9000
RUN apk update && apk add curl
RUN curl --location --silent --show-error --output sonar-scanner-cli.zip https://binaries.sonarsource.com/Distribution/sonar-scanner-cli/sonar-scanner-cli-4.6.2.2472.zip \
    && unzip sonar-scanner-cli.zip \
    && rm sonar-scanner-cli.zip \
    && mv sonar-scanner-4.6.2.2472 /opt/sonar-scanner \
    && ln -s /opt/sonar-scanner/bin/sonar-scanner /usr/local/bin/sonar-scanner
ENV SONAR_RUNNER_HOME=/opt/sonar-scanner
ENV PATH $PATH:/opt/sonar-scanner/bin

ENTRYPOINT sonar-scanner \
    -Dsonar.projectKey=engflexy \
    -Dsonar.sources=. \
    -Dsonar.host.url=$SONAR_HOST_URL \
    -Dsonar.login=$SONAR_TOKEN \
    && java -jar app.jar