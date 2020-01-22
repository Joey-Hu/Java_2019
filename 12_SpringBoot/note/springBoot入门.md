## 1.springBoot简介
简化spring应用开发的一个框架；
整个spring技术栈的一个大整合；
J2EE开发的一站式解决方案；

## 2.微服务
martin fowler

微服务：架构风格（服务简化）
一个应用应该是一组小型服务；可以通过HTTP协议进行互通

每一个功能元素最终都是一个可独替换和独立升级的软件单元

## 3.环境准备

* jdk 1.8：java version "1.8.0_201"
* maven .3.3以上版本     
    [maven安装](https://blog.csdn.net/qq_36160730/article/details/91579235)
* IDEA
* SpringBoot 1.5.9.RELEASE

### 1.MAVEN设置：  
setting.xml   

    <profile>
      <id>jdk-1.8</id>

      <activation>
		<activeByDefault>true</activeByDefault>
        <jdk>1.8</jdk>
      </activation>

      <properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>
		<maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
	  </properties>
    </profile>

### 2.IDEA设置