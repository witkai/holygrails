holygrails
==========

My frist Grails application.

Using: Grails 2.1.1

## Database Configuration

Located in conf/DataSource.groovy

### H2

dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
	logSql = true
}

URL: jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000 

### MySQL

dataSource {
	pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	username = "kai"
	password = "kai"
	logSql = true
}

URL: jdbc:mysql://192.168.249.140:3306/sakila
