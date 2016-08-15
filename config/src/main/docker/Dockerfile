FROM java:8
VOLUME /tmp
ADD config-0.0.1.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8990
# Expose our log volumes
VOLUME ["/data"]

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","--log.path=/data","/app.jar"]