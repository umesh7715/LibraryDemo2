import android.content.Context;
import android.widget.Toast;

public class ToastLibrary {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, "Mty library toast", Toast.LENGTH_SHORT).show();
    }
}
