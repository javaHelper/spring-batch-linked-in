# Building Batch Job

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.1)

2024-06-07 23:44:57.887  INFO 20658 --- [           main] c.l.batch.LinkedinBatchApplication       : Starting LinkedinBatchApplication using Java 11.0.22 on Prateeks-MacBook-Pro.local with PID 20658 (/Users/prats/Documents/Prateek/spring-batch-linked-in/01. Building Batch Job/target/classes started by prateekashtikar in /Users/prats/Documents/Prateek/spring-batch-linked-in/01. Building Batch Job)
2024-06-07 23:44:57.889  INFO 20658 --- [           main] c.l.batch.LinkedinBatchApplication       : No active profile set, falling back to 1 default profile: "default"
2024-06-07 23:44:58.248  INFO 20658 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-06-07 23:44:58.357  INFO 20658 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-06-07 23:44:58.430  INFO 20658 --- [           main] o.s.b.c.r.s.JobRepositoryFactoryBean     : No database type set, using meta data indicating: H2
2024-06-07 23:44:58.512  INFO 20658 --- [           main] o.s.b.c.l.support.SimpleJobLauncher      : No TaskExecutor has been set, defaulting to synchronous executor.
2024-06-07 23:44:58.560  INFO 20658 --- [           main] c.l.batch.LinkedinBatchApplication       : Started LinkedinBatchApplication in 0.876 seconds (JVM running for 1.081)
2024-06-07 23:44:58.561  INFO 20658 --- [           main] o.s.b.a.b.JobLauncherApplicationRunner   : Running default command line with: []
2024-06-07 23:44:58.587  INFO 20658 --- [           main] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deliverPackageJob]] launched with the following parameters: [{}]
2024-06-07 23:44:58.605  INFO 20658 --- [           main] o.s.batch.core.job.SimpleStepHandler     : Executing step: [packageItemStep]
The item has been packaged.
2024-06-07 23:44:58.613  INFO 20658 --- [           main] o.s.batch.core.step.AbstractStep         : Step: [packageItemStep] executed in 8ms
2024-06-07 23:44:58.615  INFO 20658 --- [           main] o.s.b.c.l.support.SimpleJobLauncher      : Job: [SimpleJob: [name=deliverPackageJob]] completed with the following parameters: [{}] and the following status: [COMPLETED] in 16ms
2024-06-07 23:44:58.618  INFO 20658 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2024-06-07 23:44:58.621  INFO 20658 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
```