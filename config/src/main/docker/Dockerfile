FROM java:8
VOLUME /tmp
ADD config-0.0.1.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8990

ENTRYPOINT umount /etc/hosts && echo '192.168.4.2 git.ejinjiang.com' > /etc/hosts && bash
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]