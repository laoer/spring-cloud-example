package com.jinjiang;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Laoer on 16/8/24.
 */
public class BaseController extends TopController {


    public void setSessionAttribute(HttpServletRequest request, String key, Object value) {
        request.getSession().setAttribute(key, value);
    }

    public Object getSessionAttribute(HttpServletRequest request, String key) {
        return request.getSession().getAttribute(key);
    }

}
