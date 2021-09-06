/**
 * Description: https://design-patterns.readthedocs.io/zh_CN/latest/creational_patterns/factory_method.html
 * <h1>模式动机</h1>
 * 现在对该系统进行修改，不再设计一个按钮工厂类来统一负责所有产品的创建，
 * 而是将具体按钮的创建过程交给专门的工厂子类去完成，
 * 我们先定义一个抽象的按钮工厂类，再定义具体的工厂类来生成圆形按钮、矩形按钮、菱形按钮等，它们实现在抽象按钮工厂类中定义的方法。
 * 这种抽象化的结果使这种结构可以在不修改具体工厂类的情况下引进新的产品，如果出现新的按钮类型，只需要为这种新类型的按钮创建一个具体的工厂类就可以获得该新按钮的实例，
 * 这一特点无疑使得工厂方法模式具有超越简单工厂模式的优越性，更加符合“开闭原则”。
 *
 * <h1>模式定义</h1>
 * 工厂方法模式(Factory Method Pattern)又称为工厂模式，也叫虚拟构造器(Virtual Constructor)模式或者多态工厂(Polymorphic Factory)模式，
 * 它属于类创建型模式。在工厂方法模式中，工厂父类负责定义创建产品对象的公共接口，而工厂子类则负责生成具体的产品对象，
 * 这样做的目的是将产品类的实例化操作延迟到工厂子类中完成，即通过工厂子类来确定究竟应该实例化哪一个具体产品类。
 *
 *
 * @author 李自豪（zihao.li@quantgroup.cn）
 * @since 2021/9/5
 */
package creation.factorymethod;
