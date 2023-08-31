### 作者QQ：1556708905(支持修改、 部署调试、 支持代做毕设)

#### 支持代做任何毕设论、接网站建设、小程序、H5、APP、各种系统等

**毕业设计所有选题地址 [https://github.com/zhengjianzhong0107/allProject](https://github.com/zhengjianzhong0107/allProject)****[博客地址](https://blog.csdn.net/2303_76227485/article/details/130637253)**

**视频演示：
[B站视频演示](https://www.bilibili.com/video/BV1Fj411S74t/)**

 

## 基于springboot+vue的房屋租赁统(源代码+数据库)

## 一、系统介绍

本项目前后端分离

本系统分为管理员、房主、普通用户三种种角色

用户角色包含以下功能：

- 登录、注册、房屋管理、房屋资讯、个人中心、密码修改
- 我的预约看房管理、我的租赁订单管理、我的房租缴纳管理、我的房屋退租管理、我的报修管理

房主角色包含以下功能：

- 登录、注册、房屋租赁管理、租赁订单管理、个人中心、密码修改、房屋缴租管理、房屋退租管理、报修信息管理

管理员角色包含以下功能：

- 登录、用户管理、房主管理、房源分类管理、房屋租赁管理、预约看房管理、租赁订单管理、房屋缴租管理、房屋退租管理、报修信息管理
- 房屋资讯管理、个人中心、密码修改、轮播图管理

## 二、所用技术

后端技术栈：

- springboot
- mybatis-plus
- mysql

前端技术栈：

- vue
- elementui

## 三、环境介绍

基础环境 :IDEA/eclipse, JDK 1.8, Mysql5.7及以上,Node.js(14),Maven3.6

所有项目以及源代码本人均调试运行无问题 可支持远程调试运行

## 四、页面截图

![contents](./picture/picture1.png)
![contents](./picture/picture2.png)
![contents](./picture/picture3.png)
![contents](./picture/picture4.png)
![contents](./picture/picture5.png)
![contents](./picture/picture6.png)
![contents](./picture/picture7.png)
![contents](./picture/picture8.png)
![contents](./picture/picture9.png)
![contents](./picture/picture10.png)
![contents](./picture/picture11.png)
![contents](./picture/picture12.png)
![contents](./picture/picture13.png)
![contents](./picture/picture14.png)
![contents](./picture/picture15.png)
![contents](./picture/picture16.png)
![contents](./picture/picture17.png)
![contents](./picture/picture18.png)
![contents](./picture/picture19.png)
![contents](./picture/picture20.png)
![contents](./picture/picture21.png)
![contents](./picture/picture22.png)
![contents](./picture/picture23.png)
![contents](./picture/picture24.png)
![contents](./picture/picture25.png)
![contents](./picture/picture26.png)
![contents](./picture/picture27.png)
![contents](./picture/picture28.png)
![contents](./picture/picture29.png)
![contents](./picture/picture30.png)
![contents](./picture/picture31.png)

## 五、浏览地址

前台访问地址：http://localhost:8082/

用户账号/密码：user1/123456

房主账号/密码：fang1/123456

后台访问地址：http://localhost:8081/

管理员账号/密码：admin/admin

## 六、部署教程

1. 使用Navicat或者其它工具，在mysql中创建对应名称的数据库，并执行项目的sql文件；

2. 使用IDEA/Eclipse导入项目，若为maven项目请选择maven，等待依赖下载完成；

3. 进入src/main/resources修改application.yml 里面的数据库配置

4. 启动项目后端项目

5. vscode或idea打开src/main/resources/admin/admin项目和src/main/resources/front/front项目，

6. 在编译器中打开terminal，执行npm install 依赖下载完成后执行 npm run serve,执行成功后会显示访问地址 
