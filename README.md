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

---
# TCP/IP

---
- ip
  - ipv4/ipv6
  - public/private
- port
  - public: 0~ 1023
  - process: Tomcat: 8080/ MySQL: 3306
  - dynamic
- 192.168.16.124:8888
- four layers
  - application: http/snmp/smtp/dns
  - transport: tcp
  - network: ip
  - data and link: ethernet/ieee 802.1A
  

# Thread

## properly stop a thread
- `thread.interrupt()` is a perfect way to stop a thread.\
- other than **flag** method, `interrupt` can immediately stop an interruptable thread.
- **flag** has to run through all block of call which spent more time and may not interrupt the thread.


# [JVM](https://docs.oracle.com/javase/specs/jvms/se17/jvms17.pdf) (Java Virtual Machine)
![JVM](https://simplesnippets.tech/wp-content/uploads/2018/03/java-execution-flow-diagram-1280x720.jpg)

![JVM wiki](https://upload.wikimedia.org/wikipedia/commons/d/dd/JvmSpec7.png)

# MySQL
## Download
[Download MySQL](https://www.sqlshack.com/how-to-install-mysql-database-server-8-0-19-on-windows-10/)
## Connect to MySQL through terminal
1. set the PATH variable -> mysql/bin/
2. `mysql -u root -p` and enter the key
3. 

  








