
package mega.privacy.android.pipeline

import java.util.Date

class MyUtil {
    String getMyHelloWorld() {
        return "Hello World from MyUtil! ${new Date().toString()}"
    }

    public static String getDateTime() {
        return "MyUtil.getDateTime(static)! ${new Date().toString()}"
    }
}

