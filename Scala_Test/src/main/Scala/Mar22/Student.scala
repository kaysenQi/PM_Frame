package Mar22

//为什么一加上private就不行呢???
//视频里也是这样,会报错

 class Student {

   var name: String = _
   var age: Int = _
  
  def show() = {
    printf("这是show方法,年龄是:%s,名字为:%s\n", age, name)
  }
}

object Student {
  def apply(): Student = new Student()
}
