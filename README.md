# MyDispatchTouchEventTest
this is a project to test dispatchtouchevent.


# 结论

1、触摸事件的传递流程是从dispatchTouchEvent开始的，如果不进行人为干预（默认返回父类同名函数），则事件将会依照嵌套层次由外层向内层传递，到达最内层的view时，就由它的onTouchEvent方法处理，该方法能够消费该事件则返回true，处理不了则返回false，并且事件开始重新向外层传递，由外层的onTouchEvent方法处理。。

2、如果事件向内层传递时被人为干预，事件处理函数返回true，会导致事件被提前消费掉，内层的view不会收到这个事件。

3、view控件的触发顺序是先执行onTouch方法，最后执行onClick方法，如果onTouch方法返回true，则事件不会被继续传递，最后不会执行到onClick方法。
