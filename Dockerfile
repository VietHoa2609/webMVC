FROM maven:3.8.1-openjdk-17-slim AS builder
WORKDIR /WebMVC
COPY . .
RUN mvn clean package -DskipTests

FROM tomcat:10.0.27-jdk17-corretto
RUN rm -rf /usr/local/tomcat/webapps/* //xóa mặc định của tomcat
COPY --from=builder /deployServletProject/target/WebMVC.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]