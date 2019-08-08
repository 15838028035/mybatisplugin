
<p align="center">
mybatis代码生成器

# 项目简介
   mybatis代码生成器

    
# maven使用
```xml
    <dependency>
            <groupId>cn.com.thinkit.cloud</groupId>
            <artifactId>mybatisplugin</artifactId>
             <version>1.0.0-SNAPSHOT</version>
    </dependency> 
  ```
### 版本说明
1. 本项目定为大约每1个月发布一次正式版，版本号格式为X.X.0（如1.0.1,1.0.2等），遇到重大问题需修复会及时提交新版本，欢迎大家随时提交Pull Request；
2. BUG修复和新特性一般会先发布成小版本作为临时测试版本（如1.0.2.B，即尾号不为0，并添加B，以区别于正式版）；

## SNAPSHOT版

本项目的BUG修复和新特性一般会先发布在*-SNAPSHOT版里供大家预览，如果要使用*-SNAPSHOT版，则需要在你的pom.xml中添加这段：

```xml
<repositories>
  <repository>
      <snapshots />
      <id>sonatype snapshots</id>
      <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
  </repository>
</repositories>
```

## 环境准备：

| 工具    | 版本或描述                |
| ----- | -------------------- |
| JDK   | 1.8                  |

# 使用
    (1) 修改pom.xml文件中的
             <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>cn.com.thinkit.cloud</version>
                <dependencies>
                     <dependency> 
                     <groupId>com.thinkit</groupId>
                      <artifactId>mybatisplugin</artifactId>
                    <version>1.4</version>
                   </dependency>
                        <dependency>
                            <groupId>mysql</groupId>
                            <artifactId>mysql-connector-java</artifactId>
                            <version>5.1.35</version>
                        </dependency>
                </dependencies>
                
                <configuration>
                    <configurationFile>${mybatis.generator.generatorConfig.xml}</configurationFile>
                    <overwrite>true</overwrite>
                    <verbose>true</verbose>
                </configuration>
            </plugin>
    
# 代码生成器使用
    （1）修改/src/test/resources/generatorConfig.properties里面的信息
    (2) 修改src/test/resources/generatorConfig.xml里面的
     <!--对应数据库表名 -->
        <table tableName="ana_speakerinfo" ></table>
     
     （3） 执行maven命令     mvn mybatis-generator:generate
     
```

# 代码贡献
 1. fork代码
 2. 建立分支
 3. 提交代码,pull request
 4. 更新代码

# 分支管理
 1. master分支，禁止在上面开发
 2. develop分支 开发分支
 3. bugfix分支  线上问题紧急修复分支

# 代码规范
 提交代码前，尽量使用工程中提供的checkstyle.xml对代码风格进行检查
 
# 6、问题反馈
微信号码:15838028035
 


     
