package mocking.service.mocking;

import com.google.gson.JsonObject;

import javax.servlet.http.HttpServletRequest;

public class HttpGetHandler extends MockingHandler<HttpServletRequest, JsonObject> {

    @Override
    public JsonObject handle(HttpServletRequest data) {
        return null;
    }
}
