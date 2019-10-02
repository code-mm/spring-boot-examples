#源镜像
FROM anapsix/alpine-java:8_server-jre_unlimited

VOLUME /tmp
# 添加到工作目录
ADD demo-0.0.1-SNAPSHOT.jar app.jar
# 最终运行docker的命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
