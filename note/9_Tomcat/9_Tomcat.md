## Tomcat
web软件服务器

### 下载
!["Tomcat_download"]()

### 安装和卸载
直接解压放到不含中文和空格的路径即可，卸载只要删除路径即可

### 启动
* bin/startup.bat，双击运行即可
* 访问：http://localhost:8080    访问自己	 		http://ip:8080    访问别人

* 可能遇到的问题：
	1. 黑窗口一闪而过：
		* 原因：没有正确配置JAVA_HOME的环境变量
		* 解决：正确配置即可
	2. 启动报错：
		1. 暴力：找到占用的端口号，并且找到对应的进程，杀死该进程
			* netstat -ano
		2. 温柔：修改自身的端口号

### 关闭
1. 正常关闭
	* bin/shutdown.bat
	* ctrl + c
2. 强制关闭
	* 点击启动窗口的x

### 配置
* 部署项目的方式：
	1. 直接将项目放到webapps目录下即可
	2. 配置conf/server.xml文件
	3. 在conf/Catalina/localhost创建任意名称的xml文件

* 动态项目和静态项目：
	* 目录结构
		* java动态项目的目录结构：
			* 项目的根目录：
				* WEB-INF目录：
					1. web.xml：web项目的核心配置文件
					2. classes目录：放置字节码文件的目录
					3. lib目录：放置依赖的jar包

### Tomcat集成到IDEA中
tomcat配置到IDEA中：Run/Edit Configurations
!["tomcat_IDEA"]()

部署web项目


