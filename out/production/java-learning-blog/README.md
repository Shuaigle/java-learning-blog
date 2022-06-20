# java-learning-blog

## 1. markdown
**Hello**
*Hello*
***Hello***
~~Hello~~

### 引用
> Hello

### 分割
---
***

### 圖片
![Hello](https://www.9900news.com/images/vimg/2104/202107130500070.webp)

### link
[go](https://github.com/Shuaigle)

### list
1. A
2. B
3. C
- A
- B
- C

### table
name|sex|birth
--|--|--|
kevin|male|1111

### code
```public static void main```
`Hello`


## java version

- javaSE standard
- ~~javaME~~ ~~已死~~
- javaEE web/server

## JDK JRE JVM 是啥
- JDK: Java Development Kit include JRE and JVM
- JRE: Java Runtime Environment include JVM
- JVM: Java Virtual Machine 
- ![JDK](https://devops.com.vn/wp-content/uploads/2018/07/jdk_jre_jvm.png)

## Install java17 on Mac
[Install](https://www.youtube.com/watch?v=SdKIBGnkhDY)
---
check if success-> open terminal ```java -version```

## Install intellij IDEA
[IDEA](https://www.jetbrains.com/idea/download/#section=mac)

## *new*
- when using `new` -> you construct object with new memory space names **heap**
- temp variable stores in **stack**

## `static`
- `static` belongs to the class, it can only be used by class\
- the `static {}` block is the first block that loaded when `new` an object\
- it was superior to the constructor\
- static block -> constructor block\
- `static` method can not be override by child class, since it was not an instance method.

## `final`
- if `public final Person {}` , then this class can not be inherited. Since the final appeared.

## `abstract`
- `abstract` is a class or method modifier
- some objects/class inherits from `abstract` method/class should override the methods of its parent's methods.
- `abstract` class can not be `new`

## `interface`
- can not write method -> always `abstract`
- default modifier of method is `public abstract`
- when a class `implements` an interface -> this class must `@Override` each method of **interface**

## nested class
- initiate inner class by outer class
- inner class can get outer class's private attributes
- a java class can only exist a `public` class






