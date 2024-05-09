FROM gradle
WORKDIR /home/gradle/src
COPY code/. /home/gradle/src
RUN gradle build --no-daemon
CMD ["gradle", "run"]