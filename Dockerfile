FROM openjdk:8-jdk as builder
ADD . .
RUN ./gradlew build

FROM openjdk:8-jdk
COPY --from=builder ./build/libs/kubedemo.jar ./app.jar
CMD java -jar ./app.jar
EXPOSE 9001
