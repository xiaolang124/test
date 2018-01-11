# test
测试springboot各种功能

mybatis generator
	1、可能存在driver找不到情况，添加<classPathEntry location="C:\Users\tianyuan\.m2\repository\mysql\mysql-connector-java\5.1.44\mysql-connector-java-5.1.44.jar"></classPathEntry>
	2、添加maven run，mybatis-generator:generate -e
	3、生成后需要添加@Mapper

druid
	多数据源配置中DataSource构建需要指定为DruidDataSourceBuilder
	
devtools
	添加pom后，更改Intellij中settings的Compile中make project automatically
	再更改shift+ctrl+alt+/，选择registry，生效compiler.automake.allow.when.app.running

@Autowired、@Resource	
1、@Autowired与@Resource都可以用来装配bean. 都可以写在字段上,或写在setter方法上。
2、@Autowired默认按类型装配（这个注解是属于spring的），默认情况下必须要求依赖对象必须存在，如果要允许null值，可以设置它的required属性为false，如：@Autowired(required=false) ，如果我们想使用名称装配可以结合@Qualifier注解进行使用，如下：
@Autowired() @Qualifier("baseDao")    
private BaseDao baseDao;
3、@Resource 是JDK1.6支持的注解，默认按照名称进行装配，名称可以通过name属性进行指定，如果没有指定name属性，当注解写在字段上时，默认取字段名，按照名称查找，如果注解写在setter方法上默认取属性名进行装配。当找不到与名称匹配的bean时才按照类型进行装配。但是需要注意的是，如果name属性一旦指定，就只会按照名称进行装配。
