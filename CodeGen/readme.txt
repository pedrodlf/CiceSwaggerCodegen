http://localhost:7070/swagger-ui.html#/


<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.codegen.example</groupId>
	<artifactId>CodeGen</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>CodeGen</name>
	<description>Demo project for Spring Boot</description>

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.5.9.RELEASE</version>
		<relativePath /> <!-- lookup parent from repository -->
	</parent>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
		<springfox-version>2.7.0</springfox-version>
		<api.version>1.0</api.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>${springfox-version}</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>${springfox-version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		<dependency>
			<groupId>javax.validation</groupId>
			<artifactId>validation-api</artifactId>
			<version>1.1.0.Final</version>
			<scope>provided</scope>
		</dependency>
	</dependencies>

	<build>
	<sourceDirectory>src/main/java</sourceDirectory>
		<resources>
			<resource>
				<directory>${project.build.sourceDirectory}/../resources</directory>
			</resource>
			<resource>
				<directory>${project.build.directory}/generated-sources/swagger/src/main/resources</directory>
			</resource>
		</resources>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<executions>
					<execution>
						<goals>
							<goal>repackage</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>2.18.1</version>
				<configuration>
					<includes>
						<include>**/*Tests.java</include>
						<include>**/*Test.java</include>
					</includes>
					<excludes>
						<exclude>**/Abstract*.java</exclude>
					</excludes>
				</configuration>
			</plugin>
			
			<plugin>
				<groupId>io.swagger</groupId>
				<artifactId>swagger-codegen-maven-plugin</artifactId>
				<version>2.2.3</version>
				<executions>
					<execution>
						<id>generate-spring-mvc</id>
						<goals>
							<goal>generate</goal>
						</goals>
						<configuration>
							<inputSpec>${project.build.sourceDirectory}/../resources/generador_${api.version}.yaml</inputSpec>
							<language>spring</language>
						<modelPackage>com.example.generated.model</modelPackage>
							<apiPackage>com.example.generated.api</apiPackage>
							<configOptions>
								<interfaceOnly>true</interfaceOnly>
								<dateLibrary>java.util.Date</dateLibrary>

							</configOptions>
						</configuration>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.codehaus.mojo</groupId>
				<artifactId>build-helper-maven-plugin</artifactId>
				<executions>
					<execution>
						<id>add-source</id>
						<phase>generate-sources</phase>
						<goals>
							<goal>add-source</goal>
						</goals>
						<configuration>
							<sources>
								<source>target/generated-sources/swagger/src/main/java/</source>
							</sources>
						</configuration>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>


</project>