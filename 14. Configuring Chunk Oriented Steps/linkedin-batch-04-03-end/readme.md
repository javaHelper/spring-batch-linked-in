# Chunk Oriented Step

```

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.15)

2024-06-09 20:30:27.603  INFO 4557 --- [           main] c.l.batch.LinkedinBatchApplication       : Starting LinkedinBatchApplication using Java 17.0.1 on Prateeks-MacBook-Pro.local with PID 4557 (/Users/prats/Documents/Prateek/spring-batch-linked-in/14. Configuring Chunk Oriented Steps/linkedin-batch-04-03-end/target/classes started by prateekashtikar in /Users/prats/Documents/Prateek/spring-batch-linked-in/14. Configuring Chunk Oriented Steps/linkedin-batch-04-03-end)
2024-06-09 20:30:27.606  INFO 4557 --- [           main] c.l.batch.LinkedinBatchApplication       : No active profile set, falling back to 1 default profile: "default"
2024-06-09 20:30:28.851  INFO 4557 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2024-06-09 20:30:28.859  INFO 4557 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-06-09 20:30:28.859  INFO 4557 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.79]
2024-06-09 20:30:28.953  INFO 4557 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-06-09 20:30:28.953  INFO 4557 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1281 ms
2024-06-09 20:30:29.084  INFO 4557 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-06-09 20:30:29.501  INFO 4557 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-06-09 20:30:30.035  INFO 4557 --- [           main] o.s.b.c.r.s.JobRepositoryFactoryBean     : No database type set, using meta data indicating: MYSQL
2024-06-09 20:30:30.047  INFO 4557 --- [           main] o.s.b.c.l.support.SimpleJobLauncher      : No TaskExecutor has been set, defaulting to synchronous executor.
2024-06-09 20:30:30.187  INFO 4557 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2024-06-09 20:30:30.198  INFO 4557 --- [           main] c.l.batch.LinkedinBatchApplication       : Started LinkedinBatchApplication in 3.137 seconds (JVM running for 3.985)
2024-06-09 20:30:30.200  INFO 4557 --- [           main] o.s.b.a.b.JobLauncherApplicationRunner   : Running default command line with: []
2024-06-09 20:30:30.275  INFO 4557 --- [           main] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=job]] launched with the following parameters: [{}]
2024-06-09 20:30:30.309  INFO 4557 --- [           main] o.s.batch.core.job.SimpleStepHandler     : Executing step: [chunkBasedStep]
Received list of size: 3
1
2
3
Received list of size: 2
4
5
2024-06-09 20:30:30.346  INFO 4557 --- [           main] o.s.batch.core.step.AbstractStep         : Step: [chunkBasedStep] executed in 36ms
2024-06-09 20:30:30.360  INFO 4557 --- [           main] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=job]] completed with the following parameters: [{}] and the following status: [COMPLETED] in 69ms

```