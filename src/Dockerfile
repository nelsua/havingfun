FROM openjdk:8-jdk
#RUN apt-get update && apt-get install -y openjdk-8-jdk
ADD target/demo-n3lson-0.0.1-SNAPSHOT.jar demo-n3lson-0.0.1-SNAPSHOT.jar
WORKDIR /usr/local/bin/
COPY target/demo-n3lson-0.0.1-SNAPSHOT.jar .
EXPOSE 8085
CMD ["/bin/bash"]
