FROM frolvlad/alpine-oraclejdk8:slim
RUN apk add --no-cache --update-cache bash
CMD ["/bin/bash"]
VOLUME /tmp
ADD ./service-demo-deploy/build/libs/service-demo-deploy-1.0.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
EXPOSE 18080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]