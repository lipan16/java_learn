interface superinterface1{}
interface superinterface2{}
interface interface_multi_father extends superinterface1,superinterface2{}
//接口之间可以多继承,生成的还是字节码
//Java中自定义的类型分为两种，类类型和接口类型