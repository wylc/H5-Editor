package H5Editor.common;

import H5Editor.Service.Json.Response;

/**
 * Created by mr_jw on 2017/3/1.
 */
public class Constant {
    public static Response RES_SUCCESS_NO_DATA = new Response("true", "success", null);
    public static Response RES_SUCCESS_WITH_DATA = new Response("true", "success", null);
    public static Response RES_FAIL = new Response("false", "", null);
}