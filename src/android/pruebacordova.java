package cordova.pluginpruebacordova.pruebacordova

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class pruebacordova extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        
        if (action.equals("add")) {
            this.add(args, callbackContext);
            return true;
        } else if (action.equals("substrac")) {
            this.substrac(args, callbackContext);
            return true;
        }
        return false;
    }

    private void add(JSONArray args, CallbackContext callback)
    {
        if (args != null) {
            try {
                int p1 = Integer.parseInt(args.JSONObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.JSONObject(0).getString("param2"));
                callback.success("" + (p1 + p2));
            } catch (Exception e) {
                callback.error("es un catch (Exception e)");
            }
        } else {
            callback.error("es un error");
        }
    }

    private void substrac(JSONArray args, CallbackContext callback)
    {
        if (args != null) {
            try {
                int p1 = Integer.parseInt(args.JSONObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.JSONObject(0).getString("param2"));
                callback.success("" + (p1 - p2));
            } catch (Exception e) {
                callback.error("es un catch (Exception e)");
            }
        } else {
            callback.error("es un error");
        }
    }
}
