GetItemCountNpe
===============

A project demonstrating a potential bug with `RecyclerView` which causes a
`NullPointerException` when unsetting the adapter while the view is scrolling.

A link to the issue can be found [here](https://issuetracker.google.com/issues/128350138).

Stack trace:
```
java.lang.NullPointerException: Attempt to invoke virtual method 'int androidx.recyclerview.widget.RecyclerView$Adapter.getItemCount()' on a null object reference
        at androidx.recyclerview.widget.RecyclerView$Recycler.tryGetViewHolderForPositionByDeadline(RecyclerView.java:5920)
        at androidx.recyclerview.widget.RecyclerView$Recycler.getViewForPosition(RecyclerView.java:5858)
        at androidx.recyclerview.widget.RecyclerView$Recycler.getViewForPosition(RecyclerView.java:5854)
        at androidx.recyclerview.widget.LinearLayoutManager$LayoutState.next(LinearLayoutManager.java:2230)
        at androidx.recyclerview.widget.LinearLayoutManager.layoutChunk(LinearLayoutManager.java:1557)
        at androidx.recyclerview.widget.LinearLayoutManager.fill(LinearLayoutManager.java:1517)
        at androidx.recyclerview.widget.LinearLayoutManager.scrollBy(LinearLayoutManager.java:1331)
        at androidx.recyclerview.widget.LinearLayoutManager.scrollVerticallyBy(LinearLayoutManager.java:1075)
        at androidx.recyclerview.widget.RecyclerView.scrollStep(RecyclerView.java:1832)
        at androidx.recyclerview.widget.RecyclerView$SmoothScroller.onAnimation(RecyclerView.java:11651)
        at androidx.recyclerview.widget.RecyclerView$ViewFlinger.run(RecyclerView.java:5149)
        at android.view.Choreographer$CallbackRecord.run(Choreographer.java:949)
        at android.view.Choreographer.doCallbacks(Choreographer.java:761)
        at android.view.Choreographer.doFrame(Choreographer.java:693)
        at android.view.Choreographer$FrameDisplayEventReceiver.run(Choreographer.java:935)
        at android.os.Handler.handleCallback(Handler.java:873)
        at android.os.Handler.dispatchMessage(Handler.java:99)
        at android.os.Looper.loop(Looper.java:193)
        at android.app.ActivityThread.main(ActivityThread.java:6669)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:493)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:858)
```
