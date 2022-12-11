FROM openjdk:19
COPY target/classes/ /tmp
WORKDIR /tmp
CMD java ie.atu.Main