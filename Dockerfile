FROM openjdk:8u162-jdk as build

WORKDIR /srv/arklogger

COPY . /srv/arklogger

ENV SBT_VERSION=1.1.2

RUN curl -L -o sbt-$SBT_VERSION.deb http://dl.bintray.com/sbt/debian/sbt-$SBT_VERSION.deb && dpkg -i sbt-$SBT_VERSION.deb

RUN sbt clean assembly

FROM openjdk:8u162-jre-slim

COPY --from=build /srv/arklogger/target/scala-2.12/arklogger-assembly-0.0.1-SNAPSHOT.jar /srv/arklogger/app.jar

WORKDIR /srv/arklogger

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar app.jar" ]