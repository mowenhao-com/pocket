package com.pocket.Utile;


import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 *
 * @author Mark sunlightcs@gmail.com
 */
public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public R() {
        put("code", 0);
        put("message", "success");
        put("data", null);
    }

    public static R error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "Unknown Error. Please try later.");
    }

    public static R error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("message", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("message", msg);
        return r;
    }

    public static R data(Object object) {
        R r = new R();
        r.put("data", object);
        return r;
    }

    public static R list(Object list) {
        R r = new R();
        r.put("data", listToObject(list));
        return r;
    }

    public static R url(String url) {
        R r = new R();
        r.put("data", urlToObject(url));
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    private static Map<String, Object> listToObject(Object list) {
        return new HashMap<String, Object>() {{
            put("list", list);
        }};
    }

    private static Map<String, Object> urlToObject(String url) {
        return new HashMap<String, Object>() {{
            put("url", url);
        }};
    }

}

