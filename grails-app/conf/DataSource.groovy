dataSource {
	pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	username = "kai"
	password = "kai"
	//logSql = true
}
dataSource_sakila {
	pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
    url = "jdbc:mysql://192.168.249.140:3306/sakila"
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
	username = "kai"
	password = "kai"
	//logSql = true
}
hibernate {
	format_sql = true
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://192.168.249.140:3306/holygrails"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://192.168.249.140:3306/holygrails"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
            pooled = true
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=true
               validationQuery="SELECT 1"
            }
        }
    }
}
