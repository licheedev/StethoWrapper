# StethoWrapper
Fackbook Stetho 辅助工具，仅在debug时启动Stetho

**Gradle 引用**

1. 在根build.gradle中添加

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

2. 添加依赖

```
dependencies {
        debugCompile 'com.github.licheedev.StethoWrapper:stetho_debug:1.0.0'
        releaseCompile 'com.github.licheedev.StethoWrapper:stetho_release:1.0.0'
}
```

**使用**

```java
StethoWrapper.initStetho(this);
StethoWrapper.inspectNetwork(okhttpclient_builder);
```