package task_1_2;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorListener) {
        this.callback = callback;
        this.errorCallback = errorListener;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 32) {
                errorCallback.onError("Task " + (i + 1) + " Error: not is done");
            } else {
                callback.onDone("Task " + (i + 1) + " is done");
            }
        }
    }

}
