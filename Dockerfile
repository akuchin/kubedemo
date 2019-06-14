FROM openjdk:8-jdk

ADD ./build/libs/kubedemo.jar ./app.jar
CMD java -jar ./app.jar

EXPOSE 9001
