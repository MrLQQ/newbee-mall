![newbee-logo](https://newbee-mall.oss-cn-beijing.aliyuncs.com/poster/product/newbee-logo.png?x-oss-process=image/resize,h_240,w_480)

# 项目简介
**项目地址**：https://github.com/newbee-ltd/newbee-mall

**项目介绍**：newbee-mall 项目是一套电商系统，包括 newbee-mall 商城系统及 newbee-mall-admin 商城后台管理系统，基于 Spring Boot 2.X 及相关技术栈开发。 前台商城系统包含首页门户、商品分类、新品上线、首页轮播、商品推荐、商品搜索、商品展示、购物车、订单结算、订单流程、个人订单管理、会员中心、帮助中心等模块。 后台管理系统包含数据面板、轮播图管理、商品管理、订单管理、会员管理、分类管理、设置等模块。

# 项目运行
想要运行该项目需要进行相应的配置：

* 安装Mysql

安装好Mysql后新建一个数据库，并运行项目文件夹下的newbee-mall-schema.sql文件，将数据插入数据库，可参考：如何执行sql文件插入数据库。

* 配置Mysql
修改application.properties文件中的mysql数据库名为自己的数据库名：
    ```properties
    spring.datasource.name=newbee（自己的数据库名）
    spring.datasource.username=root
    spring.datasource.password=12345678
    ```
* 解压img，修改路径
  将项目路径下的upload.zip解压，并记录下路径；

  在common/constansts中修改路径
  ```java
  //public final static String FILE_UPLOAD_DIC = "/opt/image/upload/";//上传文件的默认url前缀，根据部署设置自行修改
    public final static String FILE_UPLOAD_DIC = "D:\\upload\\";//上传文件的默认url前缀，根据部署设置自行修改
  ```
* 运行、访问
  运行成功之后，打开网页，访问：localhost:28089即可。



# 项目框架
* common：定义一些公用字段名；
* util：提供一些静态帮助方法。如邮箱格式验证、MD5码生成等；
* config：WebMvcConfigure的配置，主要设置拦截器以及资源文件；
* dao：跟数据层的交互接口，获取货品信息、用户信息、订单信息等；项目使用的数据库是Mybatis，通过XML配置dao接口跟数据库的映射关系；
* Interceptor：拦截器的具体实现，完成身份验证、购物车数量实时更新；
* controller：MVC框架中的控制器，根据web端的请求调用相应的service层进行逻辑处理；
* entity：项目中的常用字段类；
* service：服务层，由控制器进行调用；s