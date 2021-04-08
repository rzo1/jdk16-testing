# How to start

## Notes

- JDK 15 is running fine ;) 
- It is related to https://openjdk.java.net/jeps/396 (strong encapsulation by default in JDK 16)

## Results
- Install latest OpenJDK 16. I am using [AdoptOpenJDK](https://adoptopenjdk.net/?variant=openjdk16&jvmVariant=hotspot).
- `mvn clean install` then `mvn tomee:run`

This should result in the following log output:

```
/usr/lib/jvm/openjdk-16/bin/java -Dmaven.multiModuleProjectDirectory=/home/zowallar/IdeaProjects/jdk16-crash-example -Dmaven.home=/opt/idea/idea-IU-203.7148.57/plugins/maven/lib/maven3 -Dclassworlds.conf=/opt/idea/idea-IU-203.7148.57/plugins/maven/lib/maven3/bin/m2.conf -Dmaven.ext.class.path=/opt/idea/idea-IU-203.7148.57/plugins/maven/lib/maven-event-listener.jar -javaagent:/opt/idea/idea-IU-203.7148.57/lib/idea_rt.jar=41667:/opt/idea/idea-IU-203.7148.57/bin -Dfile.encoding=UTF-8 -classpath /opt/idea/idea-IU-203.7148.57/plugins/maven/lib/maven3/boot/plexus-classworlds-2.6.0.jar:/opt/idea/idea-IU-203.7148.57/plugins/maven/lib/maven3/boot/plexus-classworlds.license org.codehaus.classworlds.Launcher -Didea.version=2020.3.3 org.apache.tomee.maven:tomee-maven-plugin:8.0.7-SNAPSHOT:run
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< com.github.rzo1:jdk16-crash-example >-----------------
[INFO] Building jdk16-crash-example 1.0-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO] 
[INFO] --- tomee-maven-plugin:8.0.7-SNAPSHOT:run (default-cli) @ jdk16-crash-example ---
[INFO] TomEE was unzipped in '/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee'
[INFO] Removed not mandatory default webapps
[INFO] Deleted /home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/lib/openjpa-3.1.2.jar
[INFO] Deleted /home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/lib/xbean-asm8-shaded-4.17.jar
[INFO] Copied 'org.apache.openjpa:openjpa:3.1.3-SNAPSHOT' in '/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/lib/openjpa-3.1.3-SNAPSHOT.jar
[INFO] Copied 'com.github.rzo1:jdk16-crash-example:1.0-SNAPSHOT' in '/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/webapps/ROOT.war
[INFO] TomEE will run in development mode
[INFO] Running 'org.apache.openejb.maven.plugin.run'. Configured TomEE in plugin is localhost:8181 (plugin shutdown port is 8005 and https port is null)
08-Apr-2021 13:37:37.326 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke Server Version:        Apache Tomcat/9.0.44
08-Apr-2021 13:37:37.326 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke Server built:          Mar 4 2021 21:49:34 UTC
08-Apr-2021 13:37:37.326 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke Server version number: 9.0.44.0
08-Apr-2021 13:37:37.326 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke OS Name:               Linux
08-Apr-2021 13:37:37.327 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke OS Version:            5.6.0-1052-oem
08-Apr-2021 13:37:37.327 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke Architektur:           amd64
08-Apr-2021 13:37:37.327 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke Java Home:             /usr/lib/jvm/openjdk-16
08-Apr-2021 13:37:37.327 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke JVM Version:           16+36
08-Apr-2021 13:37:37.327 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke JVM Hersteller:        AdoptOpenJDK
08-Apr-2021 13:37:37.327 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke CATALINA_BASE:         /home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee
08-Apr-2021 13:37:37.327 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke CATALINA_HOME:         /home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee
08-Apr-2021 13:37:37.343 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke Command line argument: -XX:+HeapDumpOnOutOfMemoryError
08-Apr-2021 13:37:37.343 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke Command line argument: -Dorg.apache.catalina.STRICT_SERVLET_COMPLIANCE=false
08-Apr-2021 13:37:37.344 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke Command line argument: -Dopenejb.session.manager=org.apache.tomee.catalina.session.QuickSessionManager
08-Apr-2021 13:37:37.344 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke Command line argument: -Dtomee.remote.support=true
08-Apr-2021 13:37:37.345 INFORMATION [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke Command line argument: -Dopenejb.system.apps=false
08-Apr-2021 13:37:37.346 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Command line argument: -Dfoo=bar
08-Apr-2021 13:37:37.346 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Command line argument: -Dtomee.jsp-development=true
08-Apr-2021 13:37:37.346 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Command line argument: -Djava.util.logging.config.file=/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/conf/logging.properties
08-Apr-2021 13:37:37.346 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Command line argument: -javaagent:/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/lib/openejb-javaagent.jar
08-Apr-2021 13:37:37.346 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Command line argument: -Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager
08-Apr-2021 13:37:37.347 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Command line argument: -Djava.io.tmpdir=/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/temp
08-Apr-2021 13:37:37.348 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Command line argument: -Dcatalina.base=/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee
08-Apr-2021 13:37:37.348 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Command line argument: -Dcatalina.home=/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee
08-Apr-2021 13:37:37.348 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Command line argument: -Dcatalina.ext.dirs=/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/lib
08-Apr-2021 13:37:37.349 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Command line argument: -Dorg.apache.tomcat.util.http.ServerCookie.ALLOW_HTTP_SEPARATORS_IN_V0=true
08-Apr-2021 13:37:37.349 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Command line argument: -ea
08-Apr-2021 13:37:37.350 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke The Apache Tomcat Native library which allows using OpenSSL was not found on the java.library.path: [/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib]
08-Apr-2021 13:37:37.756 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Initialisiere ProtocolHandler["http-nio-8181"]
08-Apr-2021 13:37:37.986 INFORMATION [main] org.apache.openejb.util.OptionsLog.info Using 'tomee.remote.support=true'
08-Apr-2021 13:37:38.002 INFORMATION [main] org.apache.openejb.util.OptionsLog.info Using 'openejb.jdbc.datasource-creator=org.apache.tomee.jdbc.TomEEDataSourceCreator'
08-Apr-2021 13:37:38.115 INFORMATION [main] org.apache.openejb.OpenEJB$Instance.<init> ********************************************************************************
08-Apr-2021 13:37:38.115 INFORMATION [main] org.apache.openejb.OpenEJB$Instance.<init> OpenEJB http://tomee.apache.org/
08-Apr-2021 13:37:38.116 INFORMATION [main] org.apache.openejb.OpenEJB$Instance.<init> Startup: Thu Apr 08 13:37:38 CEST 2021
08-Apr-2021 13:37:38.116 INFORMATION [main] org.apache.openejb.OpenEJB$Instance.<init> Copyright 1999-2021 (C) Apache TomEE Project, All Rights Reserved.
08-Apr-2021 13:37:38.116 INFORMATION [main] org.apache.openejb.OpenEJB$Instance.<init> Version: 8.0.7-SNAPSHOT
08-Apr-2021 13:37:38.116 INFORMATION [main] org.apache.openejb.OpenEJB$Instance.<init> Build date: 20210408
08-Apr-2021 13:37:38.116 INFORMATION [main] org.apache.openejb.OpenEJB$Instance.<init> Build time: 03:58
08-Apr-2021 13:37:38.117 INFORMATION [main] org.apache.openejb.OpenEJB$Instance.<init> ********************************************************************************
08-Apr-2021 13:37:38.117 INFORMATION [main] org.apache.openejb.OpenEJB$Instance.<init> openejb.home = /home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee
08-Apr-2021 13:37:38.117 INFORMATION [main] org.apache.openejb.OpenEJB$Instance.<init> openejb.base = /home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee
08-Apr-2021 13:37:38.120 INFORMATION [main] org.apache.openejb.cdi.CdiBuilder.initializeOWB Created new singletonService org.apache.openejb.cdi.ThreadSingletonServiceImpl@3568f9d2
08-Apr-2021 13:37:38.123 INFORMATION [main] org.apache.openejb.cdi.CdiBuilder.initializeOWB Succeeded in installing singleton service
08-Apr-2021 13:37:38.156 INFORMATION [main] org.apache.openejb.config.ConfigurationFactory.init TomEE configuration file is '/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/conf/tomee.xml'
08-Apr-2021 13:37:38.204 INFORMATION [main] org.apache.openejb.config.ConfigurationFactory.configureService Configuring Service(id=Tomcat Security Service, type=SecurityService, provider-id=Tomcat Security Service)
08-Apr-2021 13:37:38.206 INFORMATION [main] org.apache.openejb.config.ConfigurationFactory.configureService Configuring Service(id=Default Transaction Manager, type=TransactionManager, provider-id=Default Transaction Manager)
08-Apr-2021 13:37:38.208 INFORMATION [main] org.apache.openejb.util.OptionsLog.info Using 'openejb.system.apps=false'
08-Apr-2021 13:37:38.209 INFORMATION [main] org.apache.openejb.util.OptionsLog.info Using 'openejb.deployments.classpath=false'
08-Apr-2021 13:37:38.238 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.createRecipe Creating TransactionManager(id=Default Transaction Manager)
08-Apr-2021 13:37:38.305 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.createRecipe Creating SecurityService(id=Tomcat Security Service)
08-Apr-2021 13:37:38.408 INFORMATION [main] org.apache.openejb.server.ServiceManager.initServer Creating ServerService(id=cxf)
[INFO] Waiting for command: [quit, exit, reload]
08-Apr-2021 13:37:38.640 INFORMATION [main] org.apache.openejb.server.ServiceManager.initServer Creating ServerService(id=cxf-rs)
08-Apr-2021 13:37:38.696 INFORMATION [main] org.apache.openejb.server.SimpleServiceManager.start   ** Bound Services **
08-Apr-2021 13:37:38.696 INFORMATION [main] org.apache.openejb.server.SimpleServiceManager.printRow   NAME                 IP              PORT  
08-Apr-2021 13:37:38.696 INFORMATION [main] org.apache.openejb.server.SimpleServiceManager.start -------
08-Apr-2021 13:37:38.696 INFORMATION [main] org.apache.openejb.server.SimpleServiceManager.start Ready!
08-Apr-2021 13:37:38.697 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Server initialization in [1630] milliseconds
08-Apr-2021 13:37:38.730 INFORMATION [main] org.apache.tomee.catalina.OpenEJBNamingContextListener.bindResource Importing a Tomcat Resource with id 'UserDatabase' of type 'org.apache.catalina.UserDatabase'.
08-Apr-2021 13:37:38.730 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.createRecipe Creating Resource(id=UserDatabase)
08-Apr-2021 13:37:38.747 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Starting service [Catalina]
08-Apr-2021 13:37:38.747 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Starting Servlet engine: [Apache Tomcat/9.0.44]
08-Apr-2021 13:37:38.763 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Deploying web application archive [/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/webapps/ROOT.war]
08-Apr-2021 13:37:38.769 INFORMATION [main] org.apache.tomee.catalina.TomcatWebAppBuilder.init ------------------------- localhost -> /
08-Apr-2021 13:37:38.770 INFORMATION [main] org.apache.openejb.util.JarExtractor.extract Extracting jar: /home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/webapps/ROOT.war
08-Apr-2021 13:37:38.774 INFORMATION [main] org.apache.openejb.util.JarExtractor.extract Extracted path: /home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/webapps/ROOT
08-Apr-2021 13:37:38.774 INFORMATION [main] org.apache.openejb.util.OptionsLog.info Using 'openejb.session.manager=org.apache.tomee.catalina.session.QuickSessionManager'
08-Apr-2021 13:37:39.020 INFORMATION [main] org.apache.openejb.config.ConfigurationFactory.configureApplication Configuring enterprise application: /home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/webapps/ROOT
08-Apr-2021 13:37:39.430 INFORMATION [main] org.apache.openejb.config.InitEjbDeployments.deploy Auto-deploying ejb DemoEndpoint: EjbDeployment(deployment-id=DemoEndpoint)
08-Apr-2021 13:37:39.430 INFORMATION [main] org.apache.openejb.config.InitEjbDeployments.deploy Auto-deploying ejb DemoPersistenceService: EjbDeployment(deployment-id=DemoPersistenceService)
08-Apr-2021 13:37:39.435 INFORMATION [main] org.apache.openejb.config.ConfigurationFactory.configureService Configuring Service(id=Default Stateless Container, type=Container, provider-id=Default Stateless Container)
08-Apr-2021 13:37:39.436 INFORMATION [main] org.apache.openejb.config.AutoConfig.createContainer Auto-creating a container for bean DemoEndpoint: Container(type=STATELESS, id=Default Stateless Container)
08-Apr-2021 13:37:39.436 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.createRecipe Creating Container(id=Default Stateless Container)
08-Apr-2021 13:37:39.456 INFORMATION [main] org.apache.openejb.config.ConfigurationFactory.configureService Configuring Service(id=Default JDBC Database, type=Resource, provider-id=Default JDBC Database)
08-Apr-2021 13:37:39.456 INFORMATION [main] org.apache.openejb.config.AutoConfig.logAutoCreateResource Auto-creating a Resource with id 'Default JDBC Database' of type 'javax.sql.DataSource for 'DemoEndpoint'.
08-Apr-2021 13:37:39.457 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.createRecipe Creating Resource(id=Default JDBC Database)
08-Apr-2021 13:37:39.738 INFORMATION [main] org.hsqldb.persist.Logger.logInfoEvent Checkpoint start
08-Apr-2021 13:37:39.738 INFORMATION [main] org.hsqldb.persist.Logger.logInfoEvent checkpointClose start
08-Apr-2021 13:37:39.757 INFORMATION [main] org.hsqldb.persist.Logger.logInfoEvent checkpointClose end
08-Apr-2021 13:37:39.759 INFORMATION [main] org.hsqldb.persist.Logger.logInfoEvent Checkpoint end - txts: 1
08-Apr-2021 13:37:39.777 INFORMATION [main] org.apache.openejb.config.AutoConfig.processResourceRef Auto-linking resource-ref 'java:/openejb/Resource/demo' in bean DemoEndpoint to Resource(id=Default JDBC Database)
08-Apr-2021 13:37:39.778 INFORMATION [main] org.apache.openejb.config.AutoConfig.processResourceRef Auto-linking resource-ref 'java:/openejb/Resource/demo' in bean DemoPersistenceService to Resource(id=Default JDBC Database)
08-Apr-2021 13:37:39.779 INFORMATION [main] org.apache.openejb.config.ConfigurationFactory.configureService Configuring Service(id=Default Managed Container, type=Container, provider-id=Default Managed Container)
08-Apr-2021 13:37:39.780 INFORMATION [main] org.apache.openejb.config.AutoConfig.createContainer Auto-creating a container for bean .Comp975354582: Container(type=MANAGED, id=Default Managed Container)
08-Apr-2021 13:37:39.780 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.createRecipe Creating Container(id=Default Managed Container)
08-Apr-2021 13:37:39.786 INFORMATION [main] org.apache.openejb.core.managed.SimplePassivater.init Using directory /home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/temp for stateful session passivation
08-Apr-2021 13:37:39.793 INFORMATION [main] org.apache.openejb.config.AutoConfig.processResourceRef Auto-linking resource-ref 'java:/openejb/Resource/demo' in bean .Comp975354582 to Resource(id=Default JDBC Database)
08-Apr-2021 13:37:39.794 INFORMATION [main] org.apache.openejb.config.AutoConfig.deploy Configuring PersistenceUnit(name=demo)
08-Apr-2021 13:37:39.795 INFORMATION [main] org.apache.openejb.config.AutoConfig.logAutoCreateResource Auto-creating a Resource with id 'Default JDBC DatabaseNonJta' of type 'DataSource for 'demo'.
08-Apr-2021 13:37:39.795 INFORMATION [main] org.apache.openejb.config.AutoConfig.deploy Configuring Service(id=Default JDBC DatabaseNonJta, type=Resource, provider-id=Default JDBC Database)
08-Apr-2021 13:37:39.795 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.createRecipe Creating Resource(id=Default JDBC DatabaseNonJta)
08-Apr-2021 13:37:39.808 INFORMATION [main] org.apache.openejb.config.AutoConfig.setJtaDataSource Adjusting PersistenceUnit demo <jta-data-source> to Resource ID 'Default JDBC Database' from 'demo'
08-Apr-2021 13:37:39.808 INFORMATION [main] org.apache.openejb.config.AutoConfig.setNonJtaDataSource Adjusting PersistenceUnit demo <non-jta-data-source> to Resource ID 'Default JDBC DatabaseNonJta' from 'null'
08-Apr-2021 13:37:39.830 INFORMATION [main] org.apache.openejb.config.AppInfoBuilder.build Enterprise application "/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/webapps/ROOT" loaded.
08-Apr-2021 13:37:39.834 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.createApplication Assembling app: /home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/webapps/ROOT
14  demo  INFO   [main] openjpa.Runtime - OpenJPA dynamically loaded a validation provider.
08-Apr-2021 13:37:40.140 INFORMATION [main] org.apache.openejb.assembler.classic.ReloadableEntityManagerFactory.createDelegate PersistenceUnit(name=demo, provider=org.apache.openjpa.persistence.PersistenceProviderImpl) - provider time 285ms
08-Apr-2021 13:37:40.192 INFORMATION [main] org.apache.openejb.assembler.classic.JndiBuilder.bind Jndi(name=DemoEndpointLocalBean) --> Ejb(deployment-id=DemoEndpoint)
08-Apr-2021 13:37:40.192 INFORMATION [main] org.apache.openejb.assembler.classic.JndiBuilder.bind Jndi(name=global/DemoEndpoint!com.github.rzo1.service.DemoEndpoint) --> Ejb(deployment-id=DemoEndpoint)
08-Apr-2021 13:37:40.193 INFORMATION [main] org.apache.openejb.assembler.classic.JndiBuilder.bind Jndi(name=global/DemoEndpoint) --> Ejb(deployment-id=DemoEndpoint)
08-Apr-2021 13:37:40.194 INFORMATION [main] org.apache.openejb.assembler.classic.JndiBuilder.bind Jndi(name=DemoPersistenceServiceLocalBean) --> Ejb(deployment-id=DemoPersistenceService)
08-Apr-2021 13:37:40.195 INFORMATION [main] org.apache.openejb.assembler.classic.JndiBuilder.bind Jndi(name=global/DemoPersistenceService!com.github.rzo1.service.DemoPersistenceService) --> Ejb(deployment-id=DemoPersistenceService)
08-Apr-2021 13:37:40.195 INFORMATION [main] org.apache.openejb.assembler.classic.JndiBuilder.bind Jndi(name=global/DemoPersistenceService) --> Ejb(deployment-id=DemoPersistenceService)
08-Apr-2021 13:37:40.229 INFORMATION [main] org.apache.openejb.cdi.CdiBuilder.initSingleton Existing thread singleton service in SystemInstance(): org.apache.openejb.cdi.ThreadSingletonServiceImpl@3568f9d2
08-Apr-2021 13:37:40.322 INFORMATION [main] org.apache.openejb.cdi.OpenEJBLifecycle.startApplication OpenWebBeans Container is starting...
08-Apr-2021 13:37:40.327 INFORMATION [main] org.apache.webbeans.plugins.PluginLoader.startUp Adding OpenWebBeansPlugin : [CdiPlugin]
08-Apr-2021 13:37:40.332 INFORMATION [main] org.apache.openejb.cdi.CdiScanner.handleBda Using annotated mode for file:/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/webapps/ROOT/WEB-INF/classes/ looking all classes to find CDI beans, maybe think to add a beans.xml if not there or add the jar to exclusions.list
08-Apr-2021 13:37:41.144 INFORMATION [main] org.apache.webbeans.config.BeansDeployer.validateInjectionPoints All injection points were validated successfully.
08-Apr-2021 13:37:41.164 INFORMATION [main] org.apache.openejb.cdi.OpenEJBLifecycle.startApplication OpenWebBeans Container has started, it took 842 ms.
08-Apr-2021 13:37:41.167 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.startEjbs Created Ejb(deployment-id=DemoPersistenceService, ejb-name=DemoPersistenceService, container=Default Stateless Container)
08-Apr-2021 13:37:41.168 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.startEjbs Created Ejb(deployment-id=DemoEndpoint, ejb-name=DemoEndpoint, container=Default Stateless Container)
08-Apr-2021 13:37:41.194 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.startEjbs Started Ejb(deployment-id=DemoPersistenceService, ejb-name=DemoPersistenceService, container=Default Stateless Container)
08-Apr-2021 13:37:41.200 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.startEjbs Started Ejb(deployment-id=DemoEndpoint, ejb-name=DemoEndpoint, container=Default Stateless Container)
08-Apr-2021 13:37:41.204 WARNUNG [main] org.apache.batchee.container.services.ServicesManager.init You didn't specify org.apache.batchee.jmx.application and JMX is already registered, skipping
08-Apr-2021 13:37:41.206 INFORMATION [main] org.apache.openejb.assembler.classic.Assembler.createApplication Deployed Application(path=/home/zowallar/IdeaProjects/jdk16-crash-example/target/apache-tomee/webapps/ROOT)
08-Apr-2021 13:37:41.209 SCHWERWIEGEND [main] jdk.internal.reflect.NativeMethodAccessorImpl.invoke Error waiting for multi-thread deployment of WAR files to complete
	java.util.concurrent.ExecutionException: java.lang.InternalError: LocalBeanProxyFactory.createProxy: java.lang.reflect.InaccessibleObjectException: Unable to make protected final java.lang.Class java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain) throws java.lang.ClassFormatError accessible: module java.base does not "opens java.lang" to unnamed module @185d8b6
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:357)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:297)
	at java.base/java.lang.reflect.Method.checkCanSetAccessible(Method.java:199)
	at java.base/java.lang.reflect.Method.setAccessible(Method.java:193)
	at org.apache.openejb.util.proxy.LocalBeanProxyFactory$Unsafe.getClassLoaderDefineClassMethod(LocalBeanProxyFactory.java:845)
	at org.apache.openejb.util.proxy.LocalBeanProxyFactory$Unsafe.defineClass(LocalBeanProxyFactory.java:828)
	at org.apache.openejb.util.proxy.LocalBeanProxyFactory.createProxy(LocalBeanProxyFactory.java:142)
	at org.apache.openejb.util.proxy.LocalBeanProxyFactory.createProxy(LocalBeanProxyFactory.java:152)
	at org.apache.tomee.catalina.TomcatWebAppBuilder.eagerInitOfLocalBeanProxies(TomcatWebAppBuilder.java:1569)
	at org.apache.tomee.catalina.TomcatWebAppBuilder.startInternal(TomcatWebAppBuilder.java:1315)
	at org.apache.tomee.catalina.TomcatWebAppBuilder.configureStart(TomcatWebAppBuilder.java:1131)
	at org.apache.tomee.catalina.GlobalListenerSupport.lifecycleEvent(GlobalListenerSupport.java:134)
	at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:123)
	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5082)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase.addChildInternal(ContainerBase.java:717)
	at org.apache.catalina.core.ContainerBase.addChild(ContainerBase.java:690)
	at org.apache.catalina.core.StandardHost.addChild(StandardHost.java:706)
	at org.apache.catalina.startup.HostConfig.deployWAR(HostConfig.java:1023)
	at org.apache.catalina.startup.HostConfig$DeployWar.run(HostConfig.java:1903)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:123)
	at org.apache.catalina.startup.HostConfig.deployWARs(HostConfig.java:824)
	at org.apache.catalina.startup.HostConfig.deployApps(HostConfig.java:474)
	at org.apache.catalina.startup.HostConfig.start(HostConfig.java:1611)
	at org.apache.catalina.startup.HostConfig.lifecycleEvent(HostConfig.java:319)
	at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:123)
	at org.apache.catalina.util.LifecycleBase.setStateInternal(LifecycleBase.java:423)
	at org.apache.catalina.util.LifecycleBase.setState(LifecycleBase.java:366)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:936)
	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:843)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1384)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1374)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:145)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:909)
	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:434)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:930)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.startup.Catalina.start(Catalina.java:772)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:567)
	at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:342)
	at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:473)

		at java.base/java.util.concurrent.FutureTask.report(FutureTask.java:122)
		at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:191)
		at org.apache.catalina.startup.HostConfig.deployWARs(HostConfig.java:836)
		at org.apache.catalina.startup.HostConfig.deployApps(HostConfig.java:474)
		at org.apache.catalina.startup.HostConfig.start(HostConfig.java:1611)
		at org.apache.catalina.startup.HostConfig.lifecycleEvent(HostConfig.java:319)
		at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:123)
		at org.apache.catalina.util.LifecycleBase.setStateInternal(LifecycleBase.java:423)
		at org.apache.catalina.util.LifecycleBase.setState(LifecycleBase.java:366)
		at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:936)
		at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:843)
		at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
		at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1384)
		at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1374)
		at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
		at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
		at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:145)
		at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:909)
		at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262)
		at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
		at org.apache.catalina.core.StandardService.startInternal(StandardService.java:434)
		at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
		at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:930)
		at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
		at org.apache.catalina.startup.Catalina.start(Catalina.java:772)
		at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
		at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78)
		at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
		at java.base/java.lang.reflect.Method.invoke(Method.java:567)
		at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:342)
		at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:473)
	Caused by: java.lang.InternalError: LocalBeanProxyFactory.createProxy: java.lang.reflect.InaccessibleObjectException: Unable to make protected final java.lang.Class java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain) throws java.lang.ClassFormatError accessible: module java.base does not "opens java.lang" to unnamed module @185d8b6
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:357)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:297)
	at java.base/java.lang.reflect.Method.checkCanSetAccessible(Method.java:199)
	at java.base/java.lang.reflect.Method.setAccessible(Method.java:193)
	at org.apache.openejb.util.proxy.LocalBeanProxyFactory$Unsafe.getClassLoaderDefineClassMethod(LocalBeanProxyFactory.java:845)
	at org.apache.openejb.util.proxy.LocalBeanProxyFactory$Unsafe.defineClass(LocalBeanProxyFactory.java:828)
	at org.apache.openejb.util.proxy.LocalBeanProxyFactory.createProxy(LocalBeanProxyFactory.java:142)
	at org.apache.openejb.util.proxy.LocalBeanProxyFactory.createProxy(LocalBeanProxyFactory.java:152)
	at org.apache.tomee.catalina.TomcatWebAppBuilder.eagerInitOfLocalBeanProxies(TomcatWebAppBuilder.java:1569)
	at org.apache.tomee.catalina.TomcatWebAppBuilder.startInternal(TomcatWebAppBuilder.java:1315)
	at org.apache.tomee.catalina.TomcatWebAppBuilder.configureStart(TomcatWebAppBuilder.java:1131)
	at org.apache.tomee.catalina.GlobalListenerSupport.lifecycleEvent(GlobalListenerSupport.java:134)
	at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:123)
	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5082)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase.addChildInternal(ContainerBase.java:717)
	at org.apache.catalina.core.ContainerBase.addChild(ContainerBase.java:690)
	at org.apache.catalina.core.StandardHost.addChild(StandardHost.java:706)
	at org.apache.catalina.startup.HostConfig.deployWAR(HostConfig.java:1023)
	at org.apache.catalina.startup.HostConfig$DeployWar.run(HostConfig.java:1903)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:123)
	at org.apache.catalina.startup.HostConfig.deployWARs(HostConfig.java:824)
	at org.apache.catalina.startup.HostConfig.deployApps(HostConfig.java:474)
	at org.apache.catalina.startup.HostConfig.start(HostConfig.java:1611)
	at org.apache.catalina.startup.HostConfig.lifecycleEvent(HostConfig.java:319)
	at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:123)
	at org.apache.catalina.util.LifecycleBase.setStateInternal(LifecycleBase.java:423)
	at org.apache.catalina.util.LifecycleBase.setState(LifecycleBase.java:366)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:936)
	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:843)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1384)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1374)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:145)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:909)
	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:434)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:930)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.startup.Catalina.start(Catalina.java:772)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:567)
	at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:342)
	at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:473)

		at org.apache.openejb.util.proxy.LocalBeanProxyFactory.createProxy(LocalBeanProxyFactory.java:145)
		at org.apache.openejb.util.proxy.LocalBeanProxyFactory.createProxy(LocalBeanProxyFactory.java:152)
		at org.apache.tomee.catalina.TomcatWebAppBuilder.eagerInitOfLocalBeanProxies(TomcatWebAppBuilder.java:1569)
		at org.apache.tomee.catalina.TomcatWebAppBuilder.startInternal(TomcatWebAppBuilder.java:1315)
		at org.apache.tomee.catalina.TomcatWebAppBuilder.configureStart(TomcatWebAppBuilder.java:1131)
		at org.apache.tomee.catalina.GlobalListenerSupport.lifecycleEvent(GlobalListenerSupport.java:134)
		at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:123)
		at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5082)
		at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
		at org.apache.catalina.core.ContainerBase.addChildInternal(ContainerBase.java:717)
		at org.apache.catalina.core.ContainerBase.addChild(ContainerBase.java:690)
		at org.apache.catalina.core.StandardHost.addChild(StandardHost.java:706)
		at org.apache.catalina.startup.HostConfig.deployWAR(HostConfig.java:1023)
		at org.apache.catalina.startup.HostConfig$DeployWar.run(HostConfig.java:1903)
		at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
		at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
		at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
		at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:123)
		at org.apache.catalina.startup.HostConfig.deployWARs(HostConfig.java:824)
		... 28 more
08-Apr-2021 13:37:41.240 INFORMATION [main] org.apache.catalina.core.StandardContext.setClassLoaderProperty Unable to set the web application class loader property [clearReferencesRmiTargets] to [true] as the property does not exist.
08-Apr-2021 13:37:41.240 INFORMATION [main] org.apache.catalina.core.StandardContext.setClassLoaderProperty Unable to set the web application class loader property [clearReferencesObjectStreamClassCaches] to [true] as the property does not exist.
08-Apr-2021 13:37:41.241 INFORMATION [main] org.apache.catalina.core.StandardContext.setClassLoaderProperty Unable to set the web application class loader property [clearReferencesObjectStreamClassCaches] to [true] as the property does not exist.
08-Apr-2021 13:37:41.241 INFORMATION [main] org.apache.catalina.core.StandardContext.setClassLoaderProperty Unable to set the web application class loader property [clearReferencesThreadLocals] to [true] as the property does not exist.
08-Apr-2021 13:37:41.266 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Starting ProtocolHandler ["http-nio-8181"]
08-Apr-2021 13:37:41.278 INFORMATION [main] jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke Server startup in [2580] milliseconds

```


