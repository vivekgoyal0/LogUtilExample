package limitinfinity.com.logutil;

import android.util.Log;

/**
 * Created by Raman on 12/24/2017.
 */

public class LogDebug {

    private static final String TAG = "Limit Infinity";

    public static void d(String message)
    {
        Log.e(TAG,message);
    }

}
