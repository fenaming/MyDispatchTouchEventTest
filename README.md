# MyDispatchTouchEventTest
this is a project to test dispatchtouchevent.

事件传递机制主要包括三个阶段：分发、拦截、消费，其中拥有事件传递处理能力的有下面三种：

Activity：dispatchTouchEvent()，onTouchEvent()；

ViewGroup：dispatchTouchEvent()，onInterceptTouchEvent()，onTouchEvent()；

View：dispatchTouchEvent()，onTouchEvent()；

下图为没有人为干预情况下ACTION_DOWN事件传递：

![image](https://yangukanyang.hulianjun.com/fenaming/20583109-423bc028e81cf0fb.png)

# 结论

1、触摸事件的传递流程是从dispatchTouchEvent开始的，如果不进行人为干预（默认返回父类同名函数），则事件将会依照嵌套层次由外层向内层传递，到达最内层的view时，就由它的onTouchEvent方法处理，该方法能够消费该事件则返回true，处理不了则返回false，并且事件开始重新向外层传递，由外层的onTouchEvent方法处理。

2、如果事件向内层传递时被人为干预，事件处理函数返回true，会导致事件被提前消费掉，内层的view不会收到这个事件。

3、view控件的触发顺序是先执行onTouch方法，最后执行onClick方法，如果onTouch方法返回true，则事件不会被继续传递，最后不会执行到onClick方法。

4、触摸事件的传递顺序是由Activity到ViewGroup，再由ViewGroup递归传递给它的子View。

5、ViewGroup通过方法onInterceptTouchEvent对事件进行拦截，返回true时不会继续传递事件。

6、在子View对事件消费之后，ViewGroup接收不到任何事件。
