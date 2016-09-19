模式是在某情境(context)下，针对某问题的某种解决方案

## 面向对象的3个基本特征
- **1.封装**
封装就是指隐藏
**对象隐藏了数据**，private修饰的属性避免了其它对象直接通过对象访问属性或修改，阻止了其它对象任意修改对象内部数据而引起的数据不一致。
**对象隐藏了实现细节**，使用者只能使用公有的方法，而不能使用那些受保护的或私有的方法。你可以随意修改那些非公有的方法而不会影响使用者。
可以隐藏具体的类型，使用者不必知道真正的类型就可以使用它们（依赖于接口和抽象带来的好处）。

- **2.多态**

 **多态可以使我们以相同的方式处理不同类型的对象**：使用同一段代码处理不同类型的对象，只要它们继承/实现了相同的类型，这样我们就没有必要为每一种类型的对象编写相同的逻辑，提高了代码重用度。

- **3.继承**
继承可以使不同类的对象具有相同的行为，为了使用其它类的方法，我们没有必要重新编写这些方法，只要这个类（子类）继承包含那些方法的类（父类）即可

## 设计原则

1. 把变化的部分取出来并封装起来，便于以后可以轻易的改动或扩充此部分，而不影响不需要变化的其它部分。
2. 针对接口编程，而不是针对实现编程。
3. 多用组合，少用继承。
4. 对扩展开发，对修改关闭。
5. 依赖抽象，不依赖具体类。
6. 别找我，我会找你。
7. 类应该只有一个改变的理由

1.开闭原则（Open Close Principle）
开闭原则就是说对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。所以一句话概括就是：为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。
参考：https://realm.io/cn/news/donn-felker-solid-part-2/

2.里氏代换原则（Liskov Substitution Principle）
里氏代换原则(Liskov Substitution Principle LSP)面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。 LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。—— From Baidu 百科
参考：https://realm.io/cn/news/donn-felker-solid-part-3/

3.依赖倒转原则（Dependence Inversion Principle）
这个是开闭原则的基础，具体内容：真对接口编程，依赖于抽象而不依赖于具体。
参考：https://realm.io/cn/news/donn-felker-solid-part-5/

4.接口隔离原则（Interface Segregation Principle）
这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。还是一个降低类之间的耦合度的意思，从这儿我们看出，其实设计模式就是一个软件的设计思想，从大型软件架构出发，为了升级和维护方便。所以上文中多次出现：降低依赖，降低耦合。
参考：https://realm.io/cn/news/donn-felker-solid-part-4/

5.迪米特法则（最少知道原则）（Demeter Principle）
为什么叫最少知道原则，就是说：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。

6.合成复用原则（Composite Reuse Principle）
原则是尽量使用合成/聚合的方式，而不是使用继承。

7.



## 设计模式

### 1.单例模式
单例模式确保一个类只有一个实例，并提供一个全局访问点。

### 2.工厂模式


### 3.策略模式


### 4.观察者模式
观察者模式定义了对象之间一对多依赖，这样一来，当一个对象状态改变时，它的所有依赖者都会收到通知并自动更新。

### 5.代理模式
代理模式为另一对象提供一个替身或占位符以控制对这个对象的访问

### 6.状态模式
状态模式允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。

## 7.迭代器模式
迭代器模式提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露内部的表示。

## 8.模板方法模式
模板方法模式在一个方法中定义算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下
，重新定义算法中的某些步骤。

## 9.工厂方法模式
工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。

## 10.抽象工厂模式
抽象工厂模式提供了一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。

## 11.命令模式
命令模式将“请求”封装成对象，以便使用不同的请求、队列、或者日志来参数化其它对象。命令模式也支持可撤销的操作。

## 12.适配器模式
适配器模式将一个类的接口，转换成客户期望的另一个接口。适配器让原本不兼容的类可以合作无间。
