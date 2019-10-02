## Spring Boot Docker 



    gradle bootjar

    cp Dockerfile ./build/libs

    docker build -t ms/spring-boot-docker:laster ./build/libs


# 查看打包的镜像
    
    dcoker images

# 运行镜像 -p 指定端口，左边是宿主机端口，右边是容器内端口
    
    docker run -d -p 8080:8080 ms/spring-boot-docker:laster


# 运行镜像 -d 以守护进程方式启动
    
    docker run -d -p 8080:8080 ms/spring-boot-docker:laster
