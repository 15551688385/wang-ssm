# ssm项目
## 自动生成model、mapper和mapper.xml文件
1. 在数据库中新建表
2. generatorConfig.xml配置表名和类名
3. 使用工具类\src\main\java\com\base\ssm\tool\GeneratorMapper.java运行
4. 自动生成model、mapper和mapper.xml文件
## 启动服务
1. 本地启动（开发环境）通过配置tomcat启动
2. 生产环境配置maven
> mvn  clean package -DskipTests -P test



