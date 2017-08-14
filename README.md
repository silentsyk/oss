# spring-boot+mybatis框架原型

## 下载第一件事——生成自己的项目

### 0.前置需求
* git
* maven
* shell

### 1.下载代码
```
git clone https://github.com/silentsyk/example.git
```

### 2.运行start.sh脚本
* 必须在仓库目录下执行start.sh.
* 新项目的名称假设希望叫做cry

```
cd example
sudo chmod 777 start.sh
./start cry
```

### 3.将新项目导入到IDE
* 新项目在上一级目录下(../cry)
* 注意修改application-dev.properties中的数据名为自己希望连接的数据库名
