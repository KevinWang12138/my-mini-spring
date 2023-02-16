2023.02.16更新

本次更新实现了从xml文件中读取beanDefinition，将其注册到beanDefinition注册器中。

今天第一次将所有的代码进行串联起来。这里我想简单总结一下代码运行过程。

首先，从xml文件中读取Bean的信息，也就是beanDefinition。将他们注册到BeanDefinition注册器中。

接下来，在运行的时候如果需要拿bean，则先看看容器中是否有bean，如果没有，则先读取beanDefinition进行实例化，在实例化的过程中，需要根据BeanDefinition里面记录的默认值对变量进行初始化。同时如果遇到bean引用的，则需要获取/实例化bean。

最后，将新生成的bean保存到容器中，保证单例。

