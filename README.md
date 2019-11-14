`
2019-11-14 15:04:48.630  INFO 10800 --- [           main] step.scope.spy.bean.JobControllerIT      : Started JobControllerIT in 8.184 seconds (JVM running for 9.463)
 2019-11-14 15:04:48.663 ERROR 10800 --- [           main] o.s.test.context.TestContextManager      : Caught exception while allowing TestExecutionListener [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@636be97c] to prepare test instance [step.scope.spy.bean.JobControllerIT@10b687f2]
 
 org.springframework.beans.factory.BeanCreationException: Could not inject field: step.scope.spy.bean.batch.MyItemWriter step.scope.spy.bean.JobControllerIT.myItemWriter; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'scopedTarget.writer': Scope 'step' is not active for the current thread; consider defining a scoped proxy for this bean if you intend to refer to it from a singleton; nested exception is java.lang.IllegalStateException: No context holder available for step scope
 	at org.springframework.boot.test.mock.mockito.MockitoPostProcessor.inject(MockitoPostProcessor.java:369) ~[spring-boot-test-2.1.8.RELEASE.jar:2.1.8.RELEASE]
 	at org.springframework.boot.test.mock.mockito.MockitoPostProcessor.inject(MockitoPostProcessor.java:354) ~[spring-boot-test-2.1.8.RELEASE.jar:2.1.8.RELEASE]
 	at org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener.lambda$injectFields$0(MockitoTestExecutionListener.java:79) ~[spring-boot-test-2.1.8.RELEASE.jar:2.1.8.RELEASE]
 	at org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener$$Lambda$30/1790585734.accept(Unknown Source) ~[na:na]
 	at org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener.postProcessFields(MockitoTestExecutionListener.java:100) ~[spring-boot-test-2.1.8.RELEASE.jar:2.1.8.RELEASE]
 	at org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener.injectFields(MockitoTestExecutionListener.java:79) ~[spring-boot-test-2.1.8.RELEASE.jar:2.1.8.RELEASE]
 	at org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener.prepareTestInstance(MockitoTestExecutionListener.java:54) ~[spring-boot-test-2.1.8.RELEASE.jar:2.1.8.RELEASE]
 	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:246) ~[spring-test-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.createTest(SpringJUnit4ClassRunner.java:227) [spring-test-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner$1.runReflectiveCall(SpringJUnit4ClassRunner.java:289) [spring-test-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12) [junit-4.12.jar:4.12]
 	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.methodBlock(SpringJUnit4ClassRunner.java:291) [spring-test-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:246) [spring-test-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:97) [spring-test-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290) [junit-4.12.jar:4.12]
 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71) [junit-4.12.jar:4.12]
 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288) [junit-4.12.jar:4.12]
 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58) [junit-4.12.jar:4.12]
 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268) [junit-4.12.jar:4.12]
 	at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61) [spring-test-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:70) [spring-test-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.junit.runners.ParentRunner.run(ParentRunner.java:363) [junit-4.12.jar:4.12]
 	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:190) [spring-test-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.junit.runner.JUnitCore.run(JUnitCore.java:137) [junit-4.12.jar:4.12]
 	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68) [junit-rt.jar:na]
 	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47) [junit-rt.jar:na]
 	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242) [junit-rt.jar:na]
 	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70) [junit-rt.jar:na]
 Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'scopedTarget.writer': Scope 'step' is not active for the current thread; consider defining a scoped proxy for this bean if you intend to refer to it from a singleton; nested exception is java.lang.IllegalStateException: No context holder available for step scope
 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:365) ~[spring-beans-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.springframework.aop.target.SimpleBeanTargetSource.getTarget(SimpleBeanTargetSource.java:35) ~[spring-aop-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:672) ~[spring-aop-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	at step.scope.spy.bean.batch.MyItemWriter$$EnhancerBySpringCGLIB$$933f510a.getTargetObject(<generated>) ~[classes/:na]
 	at org.springframework.boot.test.mock.mockito.MockitoPostProcessor.inject(MockitoPostProcessor.java:364) ~[spring-boot-test-2.1.8.RELEASE.jar:2.1.8.RELEASE]
 	... 27 common frames omitted
 Caused by: java.lang.IllegalStateException: No context holder available for step scope
 	at org.springframework.batch.core.scope.StepScope.getContext(StepScope.java:167) ~[spring-batch-core-4.1.2.RELEASE.jar:4.1.2.RELEASE]
 	at org.springframework.batch.core.scope.StepScope.get(StepScope.java:99) ~[spring-batch-core-4.1.2.RELEASE.jar:4.1.2.RELEASE]
 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:353) ~[spring-beans-5.1.9.RELEASE.jar:5.1.9.RELEASE]
 	... 32 common frames omitted
`