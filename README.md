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
    debugCompile 'com.github.licheedev.StethoWrapper:stetho_debug:1.0.3'
    releaseCompile 'com.github.licheedev.StethoWrapper:stetho_release:1.0.3'
    provided 'com.squareup.okhttp3:okhttp:3.4.2'
}
```

**使用**

```java
StethoWrapper.initStetho(this);
StethoWrapper.inspectNetwork(okhttpclient_builder);
```


如果同步Gradle提示下列错误

> Error:Conflict with dependency 'com.google.code.findbugs:jsr305' in project ':app'. Resolved versions for app (3.0.1) and test app (2.0.1) differ. See http://g.co/androidstudio/app-test-app-conflict for details.

则修改出错module的build.gradle

```
apply plugin: 'com.android.application'

android {
    ...
}

// 加入下面语句
configurations.all {
    resolutionStrategy.force 'com.google.code.findbugs:jsr305:3.0.1'
}

dependencies {
    ...
}

```


